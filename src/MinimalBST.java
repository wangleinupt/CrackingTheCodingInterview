import java.util.*;

public class MinimalBST {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(buildMinimalBST(arr));
    }

    public static int buildMinimalBST(int[] vals) {
        // write code here
        return buildBST(vals, 0, vals.length - 1);
    }

    public static int buildBST(int[] vals, int start, int end) {
        if (start >= end) {
            return 1;
        }

        int mid = (start + end) / 2;

        int leftHeight = buildBST(vals, start, mid - 1);
        int rightHeight = buildBST(vals, mid + 1, end);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}