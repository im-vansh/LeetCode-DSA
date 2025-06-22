import java.util.*;
public class Leetcode_407{
    public int trapRainWater(int[][] a) {
        int dis[][]=new int[4][2];
        dis[0][0]=0; dis[0][1]=1;
        dis[1][0]=0; dis[1][1]=-1;
        dis[2][0]=1; dis[2][1]=0;
        dis[3][0]=-1; dis[3][1]=0;
        PriorityQueue<int[]> pq=new PriorityQueue<>((x,y)->(x[2]-y[2]));
        int n=a.length,m=a[0].length,i,j;
        for(i=0;i<n;i++)
        for(j=0;j<m;j++)
        if(i==0 || i==n-1 || j==0 || j==m-1){
            pq.add(new int[]{i,j,a[i][j]});
            a[i][j]=-1;
        }
        int max=0,ans=0;
        while(pq.size()>0){
            int top[]=pq.poll();
            max=Math.max(max,top[2]);
            for(int it[]:dis){
                int x=top[0]+it[0],y=top[1]+it[1];
                if(x>=0 && x<n && y>=0 && y<m && a[x][y]!=-1){
                    ans+=Math.max(0,max-a[x][y]);
                    pq.add(new int[]{x,y,a[x][y]});
                    a[x][y]=-1;
                }
            }
        }
        return ans;
    }
    public static void main(String args[]){

    }
}