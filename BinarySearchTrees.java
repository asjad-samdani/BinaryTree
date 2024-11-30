import java.util.LinkedList;
import java.util.Queue;

class Node {
  int data;
  Node left, right;

  public Node(int data) {
    this.data = data;
    this.left = null;
    this.right = null;
  }
}

public class BinarySearchTrees {
  Node root;

  public void add(int data) {
    root = insertRecursive(root, data);
  }

  private Node insertRecursive(Node current, int data) {
    if (current == null) {
      return new Node(data);

    }
    if (data < current.data) {
      current.left = insertRecursive(current.left, data);

    } else if (data > current.data) {
      current.right = insertRecursive(current.right, data);

    } else {
      return current;
    }

    return current;
  }

  public static void preOrder(Node root) {
    if (root == null) {
      return;

    }
    System.out.print(root.data + " ");

    preOrder(root.left);
    preOrder(root.right);

  }

  // LevelOrder->
  public static void levelOrder(Node root) {
    if (root == null) {
      return;

    }
    Queue<Node> qu = new LinkedList<>();
    qu.add(root);
    qu.add(null);
    while (!qu.isEmpty()) {
      Node currentNode = qu.remove();
      if (currentNode == null) {
        System.out.println();
        if (qu.isEmpty()) {
          break;

        } else {
          qu.add(null);
        }

      } else {
        System.out.print(currentNode.data + " ");
        if (currentNode.left != null) {
          qu.add(currentNode.left);

        }
        if (currentNode.right != null) {
          qu.add(currentNode.right);

        }
      }

    }

  }

  public static int heightOfTree(Node node) {
    if (node == null) {
      return 0;
    }
    int lh = heightOfTree(node.left);
    int rh = heightOfTree(node.right);
    return Math.max(lh, rh) + 1;
  }

  // Count of node->
  public static int countOfNode(Node root) {
    if (root == null) {
      return 0;

    }
    int lc = countOfNode(root.left);
    int rc = countOfNode(root.right);
    return lc + rc + 1;

  }

  public static int sumOfNodes(Node root) {
    if (root == null) {
      return 0;
    }
    int lc = sumOfNodes(root.left);
    int rc = sumOfNodes(root.right);
    return lc + rc + root.data;
  }

  public static void main(String[] args) {
    BinarySearchTrees tree = new BinarySearchTrees();
    tree.add(8);
    tree.add(7);
    tree.add(12);
    tree.add(15);
    tree.add(2);
    tree.add(5);
    tree.add(1);
    preOrder(tree.root);
    System.out.println();
    System.out.println("----------------");
    levelOrder(tree.root);
    System.out.println("------------");
    System.out.println(heightOfTree(tree.root));
    System.out.println("---------------");
    System.out.println(countOfNode(tree.root));
    System.out.println("--------------------");
    System.out.println(sumOfNodes(tree.root));
  }

}
