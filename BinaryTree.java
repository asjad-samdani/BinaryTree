import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
  static class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  static class Binary {
    static int idx = -1;

    public static Node buildTree(int nodes[]) {
      idx++;

      if (nodes[idx] == -1) {

        return null;
      }

      Node newNode = new Node(nodes[idx]);

      newNode.left = buildTree(nodes);
      newNode.right = buildTree(nodes);

      return newNode;
    }

    // preorder Traversals
    public static void preOrder(Node root) {
      if (root == null) {
        return;
      }
      System.out.print(root.data + " ");
      preOrder(root.left);
      preOrder(root.right);
    }

    // Inorder Traversals
    public static void inOrder(Node root) {
      if (root == null) {
        return;

      }
      inOrder(root.left);
      System.out.print(root.data + " ");
      inOrder(root.right);
    }

    // Postrder Traversals
    public static void postOrder(Node root) {
      if (root == null) {
        return;

      }
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.data + " ");
    }

    // Level order Traversals O(n)
    public static void leverlOrder(Node root) {
      if (root == null) {
        return;

      }
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      q.add(null);
      while (!q.isEmpty()) {
        Node currentNode = q.remove();
        if (currentNode == null) {
          System.out.println();
          if (q.isEmpty()) {
            break;

          } else {
            q.add(null);
          }

        } else {
          System.out.print(currentNode.data + " ");
          if (currentNode.left != null) {
            q.add(currentNode.left);

          }
          if (currentNode.right != null) {
            q.add(currentNode.right);

          }
        }

      }

    }

  }

  public static void main(String[] args) {

    int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
    Node root = Binary.buildTree(nodes);
    Binary.preOrder(root);
    System.out.println();
    Binary.inOrder(root);
    System.out.println();
    Binary.postOrder(root);
    System.out.println();
    Binary.leverlOrder(root);
  }
}
