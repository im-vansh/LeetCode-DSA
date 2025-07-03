import java.util.*;
public class LeetCode_1358{
    public int numberOfSubstrings(String s) {
        int left=0,right=0,n=s.length(),ans=0;
        int freq[]=new int[3];
        while(right<n){
            freq[s.charAt(right)-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                ans+=n-right;
                freq[s.charAt(left)-'a']--;
                left++;
            }
            right++;
        }
        return ans;
    }
    public static void main(String args[]){

    }
}