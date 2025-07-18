import java.util.*;
public class LeetCode_2017{
    public long gridGame(int[][] a) {
        long sum1=0,sum2=0;
        for(int i=0;i<a[0].length;i++){
            sum1+=a[0][i];
            sum2+=a[1][i];
        }
        int idx=-1;
        long Sum1=0,Sum2=0,max=(long)1e18;
        for(int i=0;i<a[0].length;i++){
            Sum1+=a[0][i];
            if(Math.max(Sum2,sum1-Sum1)<max){
                max=Math.max(Sum2,sum1-Sum1);
                idx=i;
            }
            Sum2+=a[1][i];
        }
        long ans1=0,ans2=0;
        for(int i=idx+1;i<a[0].length;i++) ans1+=a[0][i];
        for(int i=0;i<idx;i++) ans2+=a[1][i];
        return Math.max(ans1,ans2);
    }
    public static void main(String args[]){

    }
}