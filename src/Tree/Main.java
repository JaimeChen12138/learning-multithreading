package Tree;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(0);
        root.right = new TreeNode(0);
        s.findMinMoves(root);
        System.out.println(s.res);
    }
}
