//Java Program to Perform the inorder tree traversal
class Node {
  int item;
  Node left, right;

  public Node(int key) {
  item = key;
  left = right = null;
  }
}
class Tree {
 Node root;
 Tree() {
 root = null;
  }
  void inOrder(Node node) {
    if (node == null)
      return;

    inOrder(node.left);
    System.out.print(node.item + "->");
     inOrder(node.right);
  }
 public static void main(String[] args) {
    Tree tree = new Tree();
    tree.root = new Node(1);
    tree.root.left = new Node(12);
    tree.root.right = new Node(9);

    tree.root.left.left = new Node(5);
    tree.root.left.right = new Node(6);

    System.out.println("In Order traversal");
    tree.inOrder(tree.root);
  }
}
