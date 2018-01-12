import java.util.*;

public class SetOfStacks {

    public static void main(String[] args) {
        int[][] arr = {{1, 97868}, {1, 69995}, {1, 28525}, {1, 72341}, {1, 86916}, {1, 5966}, {2, 58473}, {2, 93399}, {1, 84955}, {
                1, 16420}, {1, 96091}, {1, 45179}, {1, 59472}, {1, 49594}, {1, 67060}, {1, 25466}, {1, 50357}, {1, 83509}, {1, 39489}, {
                2, 51884}, {1, 34140}, {1, 8981}, {1, 50722}, {1, 65104}, {1, 61130}, {1, 92187}, {2, 2191}, {1, 2908}, {1, 63673}, {
                2, 92805}, {1, 29442}};

        ArrayList<ArrayList<Integer>> setOfStack = setOfStacks(arr, 2);
    }

    public static ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        ArrayList<ArrayList<Integer>> setOfStack = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> stack = new ArrayList<Integer>(size);

        setOfStack.add(stack);

        for (int i = 0; i < ope.length; i++) {
            //push
            if (ope[i][0] == 1) {
                stack = setOfStack.get(setOfStack.size() - 1);

                if (stack.size() == size) {
                    stack = new ArrayList<Integer>();
                    stack.add(ope[i][1]);
                    setOfStack.add(stack);
                } else {
                    stack.add(ope[i][1]);
                }
            } else {
                //pop
                stack = setOfStack.get(setOfStack.size() - 1);

                stack.remove(stack.size() - 1);

                if (stack.isEmpty()) {
                    setOfStack.remove(stack);
                }
            }
        }
        return setOfStack;
    }
}