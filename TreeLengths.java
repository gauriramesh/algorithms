import java.util.LinkedList;
import java.util.Queue;

public class TreeLengths {
    private static class Node {
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
            left = right = null;
        }
    }

    //Recursive implementation of maxTreeLength
    public static int maxTreeLength(Node root) {
        if(root == null) {
            return 0;
        }
        int leftSubTree = maxTreeLength(root.left);
        System.out.println(leftSubTree);
        int rightSubTree = maxTreeLength(root.right);
        System.out.println(rightSubTree);
        if(rightSubTree > leftSubTree) {
            return rightSubTree + 1;
        } return leftSubTree + 1;
    }

    //Iterative solution of maxTreeLength
    public static int iterativeTreeLength(Node root) {
        Queue<Node> queue = new LinkedList<>();
        return 0;

    }


    public static void main(String [] args) {
        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(4);
        root.left.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(maxTreeLength(root));
    }
}


