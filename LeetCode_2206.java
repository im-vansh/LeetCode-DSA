import java.util.*;
public class LeetCode_2206{
    public boolean divideArray(int[] a) {
        int max=0;
        for(int it:a) max=Math.max(max,it);
        int freq[]=new int[max+1];
        for(int it:a) freq[it]++;
        for(int i=1;i<=max;i++) if(freq[i]%2==1) return false;
        return true;
    }
    public static void main(String args[]){

    }
}