package Tree;

public class Solution {
        int res = 0;

        public int findMinMoves(TreeNode root){
            if (root == null) return 0;

            int left = findMinMoves(root.left);
            int right = findMinMoves(root.right);

            res += Math.abs(left) + Math.abs(right);
            return left + right + root.val - 1;
        }

}
