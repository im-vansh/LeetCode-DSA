import java.util.*;
public class LeetCode_3306{
    public boolean vowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    public int diff(char ch,int a,int e,int i,int o,int u,int A,int E,int I,int O,int U){
        if(ch=='a') return a-A;
        if(ch=='e') return e-E;
        if(ch=='i') return i-I;
        if(ch=='o') return o-O;
        return u-U;
    }
    public long countOfSubstrings(String word, int k) {
        int left=0,right=0,start=0;
        int a=0,e=0,i=0,o=0,u=0,cons=0;
        int A=0,E=0,I=0,O=0,U=0,CONS=0;
        long ans=0;
        while(right<word.length()){
            char ch=word.charAt(right);
            if(vowel(ch)){
                if(ch=='a') a++; if(ch=='e') e++; if(ch=='i') i++; if(ch=='o') o++; 
                if(ch=='u') u++;
            }
            else cons++;
            while(cons>k){
                char ch2=word.charAt(left);
                if(vowel(ch2)){
                if(ch2=='a') a--; if(ch2=='e') e--; if(ch2=='i') i--; if(ch2=='o') o--; 
                if(ch2=='u') u--;
                }
                else cons--;
                left++;
            }
            if(cons==k && a>0 && e>0 && i>0 && u>0 && o>0){
                if(start<left){
                    start=left;
                    A=0; E=0; I=0; O=0; U=0; CONS=0;
                }
                while(true){
                    char ch2=word.charAt(start);
                    if(!vowel(ch2) || diff(ch2,a,e,i,o,u,A,E,I,O,U)==1) break;
                    if(vowel(ch2)){
                    if(ch2=='a') A++; if(ch2=='e') E++; if(ch2=='i') I++; if(ch2=='o') O++; 
                    if(ch2=='u') U++;
                    }
                    else CONS++;
                    start++;
                }
                ans+=start-left+1;
            }
            right++;
        }
        return ans;
    }
    public static void main(String args[]){

    }
}