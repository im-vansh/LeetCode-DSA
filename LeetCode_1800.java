import java.util.*;
public class LeetCode_1800{
     public int maxAscendingSum(int[] a) {
        int sum=0,ans=0;
        for(int i=0;i<a.length-1;i++){
            sum+=a[i];
            if(a[i+1]<=a[i]){
                ans=Math.max(ans,sum);
                sum=0;
            } 
        }
        sum+=a[a.length-1];
        ans=Math.max(ans,sum);
        return ans;
    }
    public static void main(String args[]){

    }
}