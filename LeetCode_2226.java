import java.util.*;
public class LeetCode_2226{
    public int maximumCandies(int[] a, long k) {
        long low=1,high=0L;
        for(int it:a) high=Math.max(high,(long)it);
        while(high>=low){
            long mid=(low+high)>>1;
            long cnt=0;
            for(int it:a)
            cnt+=(long)(it/mid);
            if(cnt>=k) low=mid+1;
            else high=mid-1;
        }
        return (int)low-1;
    }
    public static void main(String args[]){

    }
}