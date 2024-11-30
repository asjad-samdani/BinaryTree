class Node {
  int data;
  Node left;
  Node right;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

public class BinaryTre {
  Node root;

  // Method to add a new node to the binary tree
  public void add(int value) {
    if (root == null) {
      root = new Node(value);
    } else {
      insert(root, value);
    }
  }

  // Method to insert a node into the binary tree
  private void insert(Node current, int value) {
    if (current.left == null) {
      current.left = new Node(value);
    } else if (current.right == null) {
      current.right = new Node(value);
    } else {
      insert(current.left, value);
    }
  }

  public static void preOrder(Node node) {
    if (node == null) {
      return;
    }
    System.out.print(node.data + " ");
    preOrder(node.left);
    preOrder(node.right);
  }

  public static void main(String[] args) {
    BinaryTre tree = new BinaryTre();

    tree.add(1);
    tree.add(2);
    tree.add(3);
    tree.add(4);
    tree.add(5);
    tree.add(6);

    System.out.println("Pre-order traversal:");
    preOrder(tree.root);
  }
}
