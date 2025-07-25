import java.util.*;
public class LeetCode_2364{
    public long countBadPairs(int[] a) {
        HashMap<Integer,Integer> map=new HashMap<>();
        long ans=0;
        int n=a.length;
        for(int i=n-1;i>=0;i--){
            ans+=(n-1-i)-map.getOrDefault(i-a[i],0);
            map.put(i-a[i],map.getOrDefault(i-a[i],0)+1);
        }
        return ans;
    }
    public static void main(String args[]){

    }
}