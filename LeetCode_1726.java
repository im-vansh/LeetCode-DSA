import java.util.*;
public class LeetCode_1726{
    public int tupleSameProduct(int[] a) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int prod=a[i]*a[j];
                map.put(prod,map.getOrDefault(prod,0)+1);
            }
        }
        int ans=0;
        for(Integer it:map.keySet()){
            int val=(map.get(it)*(map.get(it)-1))/2;
            ans+=8*val;
        }
        return ans;
    }
    public static void main(String args[]){

    }
}