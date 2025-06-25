import java.util.*;
public class LeetCode_889{
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
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        return buildTree(preorder, postorder, new int[]{0}, 0, postorder.length - 1);
    }
    private TreeNode buildTree(int[] preorder, int[] postorder, int[] preIndex, int postStart, int postEnd) {
        if (preIndex[0] >= preorder.length || postStart > postEnd) return null;

        TreeNode root = new TreeNode(preorder[preIndex[0]++]);
        if (postStart == postEnd) return root;

        int leftRootIndex = postStart;
        while (postorder[leftRootIndex] != preorder[preIndex[0]]) leftRootIndex++;

        root.left = buildTree(preorder, postorder, preIndex, postStart, leftRootIndex);
        root.right = buildTree(preorder, postorder, preIndex, leftRootIndex + 1, postEnd - 1);

        return root;
    }
    public static void main(String args[]){

    }
}