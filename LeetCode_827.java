import java.util.*;
public class LeetCode_2425{
    public HashMap<Integer,Integer> map;
    public int largestIsland(int[][] a) {
        map=new HashMap<>();
        int cnt=2,ans=0,zero=0;
        for(int i=0;i<a.length;i++)
        for(int j=0;j<a[0].length;j++)
        if(a[i][j]==0) zero++;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==1){
                    int area=area(a,i,j,cnt)+1;
                    map.put(cnt,area);
                    cnt++;
                }
            }
        }
        if(map.size()==0) return 1;
        if(zero==0) return map.get(2);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==0){
                    int tmp=0;
                    HashSet<Integer> set=new HashSet<>();
                    if(i+1<a.length) set.add(a[i+1][j]);
                    if(i-1>=0) set.add(a[i-1][j]);
                    if(j+1<a[0].length) set.add(a[i][j+1]);
                    if(j-1>=0) set.add(a[i][j-1]);
                    for(int it:set) tmp+=map.getOrDefault(it,0);
                    ans=Math.max(ans,tmp+1);
                }
            }
        }
        return ans;
    }
    public static int area(int a[][],int i,int j,int cnt){
        if(i>=a.length || j>=a[0].length) return 0;
        int ans=0;
        a[i][j]=cnt;
        if((i+1)<a.length && j<a[0].length && a[i+1][j]==1){
            ans=ans+1+area(a,i+1,j,cnt);
        } 
        if((i-1)>=0 && j<a[0].length && a[i-1][j]==1){
            ans=ans+1+area(a,i-1,j,cnt);
        } 
        if(i<a.length && (j+1)<a[0].length && a[i][j+1]==1){
            ans=ans+1+area(a,i,j+1,cnt);
        } 
        if(i<a.length && (j-1)>=0 && a[i][j-1]==1){
            ans=ans+1+area(a,i,j-1,cnt);
        } 
        return ans;
    }
    public static void main(String args[]){

    }
}