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
        System.out.println("Returning null for index: " + idx);

        return null;
      }

      Node newNode = new Node(nodes[idx]);
      System.out.println("Creating node: " + newNode.data);

      newNode.left = buildTree(nodes);
      newNode.right = buildTree(nodes);

      return newNode;
    }

    public static void preOrder(Node root) {
      if (root == null) {
        return;
      }
      System.out.print(root.data + " ");
      preOrder(root.left);
      preOrder(root.right);
    }
  }

  public static void main(String[] args) {

    int nodes[] = { 1, 24, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

    Node root = Binary.buildTree(nodes);

    Binary.preOrder(root);
  }
}
