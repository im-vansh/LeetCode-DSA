import java.util.*;
public class LeetCode_684{
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        int F[]=new int[n+1];
        int rank[]=new int[n+1];
        for(int i=1;i<=n;i++) F[i]=i;
        for(int it[]:edges){
            if(find(F,it[0])==find(F,it[1])) return new int[]{it[0],it[1]};
            union(rank,F,it[0],it[1]);
        }
        return new int[]{};
    }
    public void union(int rank[],int G[],int u,int v){
        int x=find(G,u),y=find(G,v);
        if(x==y) return;
        if(rank[y]>rank[x]) G[x]=y;
        else if(rank[x]>rank[y]) G[y]=x;
        else{
            G[y]=x;
            rank[x]++;
        }
    }
    public int find(int f[],int x){
        if(x==f[x]) return x;
        return f[x]=find(f,f[x]);
    }
    public static void main(String args[]){

    }
}