public class HeightOfTree {
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

  // TC-> O(n)
  public static int heightOfTree(Node root) {
    if (root == null) {
      return 0;
    }
    return Math.max(heightOfTree(root.left), heightOfTree(root.right) + 1);
  }

  public static int countOfNode(Node root) {
    if (root == null) {
      return 0;
    }

    int lcount = countOfNode(root.left);
    int rcount = countOfNode(root.right);
    return lcount + rcount + 1;
  }

  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);
    root.right.right.right = new Node(8);
    root.right.right.right.right = new Node(9);
    System.out.println(heightOfTree(root));
    System.out.println("---------------");
    System.out.println(countOfNode(root));

  }

}
