import java.util.*;
public class LeetCode_2342{
    public int maximumSum(int[] a) {
        HashMap<Integer,PriorityQueue<Integer>> map=new HashMap<>();
        for(int it:a){
            int tmp=it,sum=0;
            while(tmp>0){
                sum+=tmp%10;
                tmp/=10;
            }
            if(!map.containsKey(sum)) map.put(sum,new PriorityQueue<>());
            map.get(sum).add(it);
            if(map.get(sum).size()>2) map.get(sum).poll();
        }
        int max=-1;
        for(Integer it:map.keySet()){
            PriorityQueue<Integer> pq=map.get(it);
            if(pq.size()>1)
            max=Math.max(max,pq.poll()+pq.poll());
        }
        return max;
    }
    public static void main(String args[]){

    }
}