import java.util.*;
public class LeetCode_2379{
    public int minimumRecolors(String s, int k) {
        int w=0,n=s.length();
        for(int i=0;i<k;i++) if(s.charAt(i)=='W') w++;
        int ans=w;
        for(int i=k;i<n;i++){
            if(s.charAt(i-k)=='W') w--;
            if(s.charAt(i)=='W') w++;
            ans=Math.min(ans,w);
        }
        return ans;
    }
    public static void main(String args[]){

    }
}