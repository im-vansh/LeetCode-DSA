import java.util.*;
public class LeetCode_2161{
    public int[] pivotArray(int[] a, int pivot) {
        int n=a.length,c=0;
        int ans[]=new int[n];
        for(int it:a) if(it<pivot) ans[c++]=it;
        for(int it:a) if(it==pivot) ans[c++]=it;
        for(int it:a) if(it>pivot) ans[c++]=it;
        return ans;
    }
    public static void main(String args[]){

    }
}