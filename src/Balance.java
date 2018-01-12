import java.util.*;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Balance {
    public static boolean isBalance(TreeNode root) {
        // write code here
        if (checkHeight(root) == -1) {
            return false;
        } else {
            return true;
        }

    }

    public static int checkHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = checkHeight(node.left);
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = checkHeight(node.right);
        if (rightHeight == -1) {
            return -1;
        }

        int diff = rightHeight - leftHeight;
        if (Math.abs(diff) > 1) {
            return -1;
        } else {
            return Math.max(rightHeight, leftHeight) + 1;
        }

    }
}