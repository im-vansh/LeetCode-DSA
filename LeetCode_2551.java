import java.util.*;
public class LeetCode_2551{
    public long putMarbles(int[] a, int k) {
        ArrayList<Long> arr=new ArrayList<>();
        int i,n=a.length;
        for(i=0;i<n-1;i++)
            arr.add((long)a[i]+(long)a[i+1]);
        Collections.sort(arr);
        long ans1=0,ans2=0;
        for(i=0;i<k-1;i++){
            ans1+=arr.get(i);
            ans2+=arr.get(arr.size()-i-1);
        }
        return Math.abs(ans1-ans2);
    }
    public static void main(String args[]){

    }
}