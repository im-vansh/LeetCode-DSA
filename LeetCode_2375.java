import java.util.*;
public class LeetCode_2375{
    public String smallestNumber(String s) {
        StringBuilder ans=new StringBuilder();
        Stack<Integer> st=new Stack<>();
        int cnt=1;
        for(char it:s.toCharArray()){
            st.add(cnt);
            if(it=='I'){
                while(st.size()>0) ans.append(st.pop());
            }
            cnt++;
        }
        st.add(cnt);
        while(st.size()>0) ans.append(st.pop());
        return ans.toString();
    }
    public static void main(String args[]){

    }
}