import java.util.*;
public class LeetCode_2965{
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int freq[]=new int[n*n+1];
        for(int it[]:grid)
        for(int it2:it) freq[it2]++;
        int ans[]=new int[2];
        for(int i=1;i<=n*n;i++){
            if(freq[i]==0) ans[1]=i;
            if(freq[i]==2) ans[0]=i;
        }
        return ans;
    }
    public static void main(String args[]){

    }
}