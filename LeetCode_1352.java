import java.util.*;
public class LeetCode_1352{
    int prod=1;
    List<Integer> suff;    
    public void add(int num) {
        prod*=num;
        suff.add(prod);
        if(num==0) {
            prod=1;
            suff=new ArrayList<>();
        }
    }
    
    public int getProduct(int k) {
        if(suff.size()<k) return 0;
        int num=1;
        if((suff.size()-k-1)>=0) num=suff.get(suff.size()-k-1);
        int ans=suff.get(suff.size()-1)/num;
        return ans;
    }
    public static void main(String args[]){

    }
}