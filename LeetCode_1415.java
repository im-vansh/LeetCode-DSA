import java.util.*;
public class LeetCode_1415{
    String ans;
    int K;
    public String getHappyString(int n, int k) {
        char ch[]=new char[n];
        ans="";
        K=k;
        Arrays.fill(ch,'d');
        help(0,n,ch,'d');
        return ans;
    }
    public void help(int i,int n,char ch[],char prev){
        if(i==n){
            if(K==1){
                ans=new String(ch);
                K--;
                return;
            }
            K--;
            return;
        }
        for(char c='a';c<='c';c++){
            if(c!=prev){
                ch[i]=c;
                help(i+1,n,ch,c);
                ch[i]='d';
            }
        }
    }
    public boolean doesValidArrayExist(int[] derived) {
        int ans=0;
        for(int it:derived) ans^=it;
        return (ans==0);
    }
    public static void main(String args[]){

    }
}