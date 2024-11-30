class BinaryTree {
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }

  }

  class Binary {
    static int index = -1;

    public static Node buildTree(int nodes[]) {
      index++;
      if (nodes[index] == -1) {
        return null;

      }
      Node newNode = new Node(nodes[index]);
      newNode.left = null;
      newNode.right = null;
      return newNode;

    }

  }

  public static void main(String[] args) {
    int nodes[] = { 9, 8, -1, 3, 5, -1, 2, -1, -1, 6, 9, 2 };
    Node BinaryTree = Binary.buildTree(nodes);
    System.out.println(BinaryTree.data);
  }
}