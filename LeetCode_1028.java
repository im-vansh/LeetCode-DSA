import java.util.*;
public class LeetCode_1028{
    public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
    public TreeNode recoverFromPreorder(String str) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> brr=new ArrayList<>();
        int cnt=0,i=0;
        arr.add(0);
        while(i<str.length()){
            int j=i;
            while(j<str.length() && str.charAt(j)=='-') { cnt++; j++; }
            if(cnt>0) arr.add(cnt);
            i=j+1;
            cnt=0;
        }
        cnt=0; i=0;
        while(i<str.length()){
            int j=i;
            while(j<str.length() && str.charAt(j)>='0' && str.charAt(j)<='9') { 
                cnt=(cnt*10)+(str.charAt(j)-'0'); 
                j++; 
            }
            if(cnt>0) brr.add(cnt);
            i=j+1;
            cnt=0;
        }
        TreeNode root = new TreeNode(brr.get(0));
        Map<Integer, TreeNode> depthMap = new HashMap<>();
        depthMap.put(0, root);
        for (i=1;i<arr.size();i++) {
            int depth = arr.get(i);
            TreeNode node = new TreeNode(brr.get(i));
            TreeNode parent = depthMap.get(depth - 1);
            if (parent.left == null) parent.left = node;
            else parent.right = node;
            depthMap.put(depth, node);
        }
        return root;
    }
    public static void main(String args[]){

    }
}