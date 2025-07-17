import java.util.*;
public class LeetCode_1976{
    public int countPaths(int n, int[][] road) {
        List<List<int[]>> arr=new ArrayList<>();
        for(int i=0;i<n;i++) arr.add(new ArrayList<>());
        for(int it[]:road){
            arr.get(it[0]).add(new int[]{it[1],it[2]});
            arr.get(it[1]).add(new int[]{it[0],it[2]});
        }
        PriorityQueue<long[]> pq=new PriorityQueue<>((x,y)->(Long.compare(x[1],y[1])));
        long dp[]=new long[n];
        long way[]=new long[n];
        long mod=(long)1e9+7;
        pq.add(new long[]{0L,0L});
        Arrays.fill(dp,(long)1e18);
        dp[0]=0L;
        way[0]=1L;
        while(pq.size()>0){
            int size=pq.size();
            while(size-->0){
                long top[]=pq.poll();
                if(top[1]>dp[(int)top[0]]) continue;
                for(int it[]:arr.get((int)top[0])){
                    if(dp[(int)it[0]]>dp[(int)top[0]]+(long)it[1]){
                        dp[(int)it[0]]=dp[(int)top[0]]+(long)it[1];
                        way[(int)it[0]]=way[(int)top[0]];
                        pq.add(new long[]{it[0],dp[(int)it[0]]});
                    }
                    else if(dp[(int)it[0]]==dp[(int)top[0]]+(long)it[1]){
                        way[(int)it[0]]=(way[(int)it[0]]+way[(int)top[0]])%mod;
                    }
                }
            }
        }
        return (int)way[n-1];
    }
    public static void main(String args[]){

    }
}