import java.util.*;
public class LeetCode_3394{
    public boolean checkValidCuts(int N, int[][] rec) {
        ArrayList<int[]> arra=new ArrayList<>();
        ArrayList<int[]> arrb=new ArrayList<>();
        int n=rec.length,i,j;
        for(i=0;i<n;i++){
            arra.add(new int[]{rec[i][0],rec[i][2]});
            arrb.add(new int[]{rec[i][1],rec[i][3]});
        }
        Collections.sort(arra,(x,y)->(x[0]==y[0])?(y[1]-x[1]):(x[0]-y[0]));
        Collections.sort(arrb,(x,y)->(x[0]==y[0])?(y[1]-x[1]):(x[0]-y[0]));
        i=0; int x=0;
        while(i<arra.size()-1){
            int curr=arra.get(i)[1];
            j=i+1;
            while(j<arra.size() && arra.get(j)[0]<curr){
                curr=Math.max(curr,arra.get(j)[1]);
                j++;
            }
            i=j;
            if(i<arra.size()) x++;
        }
        if(x>=2) return true;
        i=0; x=0;
        while(i<arrb.size()-1){
            int curr=arrb.get(i)[1];
            j=i+1;
            while(j<arrb.size() && arrb.get(j)[0]<curr){
                curr=Math.max(curr,arrb.get(j)[1]);
                j++;
            }
            i=j;
            if(i<arrb.size()) x++;
        }
        return x>=2;
    }
    public static void main(String args[]){

    }
}