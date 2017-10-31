import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    private static class Node {
        int data;
        Node left;
        Node right;
        Node(int data) {
            left = right = null;
            this.data = data;
        }
    }

    public static void levels(Node root, int level) {
        if(root == null) {
            return;
        }
        if(level == 1) {
            System.out.println(root.data);
        }
        if(level > 1) {
            levels(root.left, level - 1);
            levels(root.right, level-1);
        }
    }

    public static void levels(Node root) {
        if(root == null) {
            return;
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        while(true) {
            int nodeCounter = q.size();
            if(nodeCounter == 0) {
                break;
            }

            while(nodeCounter > 0) {
                Node node = q.peek();
                System.out.println(node.data + " ");
                q.remove();
                if(node.left != null) {
                    q.add(node.left);
                }
                if(node.right != null) {
                    q.add(node.right);
                }
                nodeCounter--;
            }
        }
    }
}
