import java.util.*;
public class LeetCode_1790{
    public boolean areAlmostEqual(String s1, String s2) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) arr.add(i);
        }
        if(arr.size()==2){
            int i=arr.get(0),j=arr.get(1);
            if(s1.charAt(i)==s2.charAt(j) && s1.charAt(j)==s2.charAt(i))
            return true;
        }
        return arr.size()==0;
    }
    public static void main(String args[]){

    }
}