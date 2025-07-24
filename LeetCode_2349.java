import java.util.*;
public class LeetCode_2349{
    HashMap<Integer,TreeSet<Integer>> map2;
    HashMap<Integer,Integer> map;
    public void change(int index, int number) {
        if(map.containsKey(index)){
            int val=map.get(index);
            map2.get(val).remove(index);
            if(map2.get(val).size()==0) map2.remove(val);
        } 
        map.put(index,number);
        if(!map2.containsKey(number)) map2.put(number,new TreeSet<>());
        map2.get(number).add(index);
    }
    
    public int find(int number) {
        if(!map2.containsKey(number)) return -1;
        return map2.get(number).first();
    }
    public static void main(String args[]){

    }
}