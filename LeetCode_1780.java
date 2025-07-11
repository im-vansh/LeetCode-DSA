import java.util.*;
public class LeetCode_1780{
    public boolean checkPowersOfThree(int n) {
        while(n>0){
            if(n%3>1) return false;
            n/=3;
        }
        return true;
    }
    public static void main(String args[]){

    }
}