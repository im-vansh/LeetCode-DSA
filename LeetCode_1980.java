import java.util.*;
public class LeetCode_1980{
    public String findDifferentBinaryString(String[] nums) {
        StringBuilder res= new StringBuilder();
        int len=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i].charAt(len)=='0') res.append(1);
            else res.append(0);
            len++;
        }
        return res.toString();
    }
    public static void main(String args[]){

    }
}