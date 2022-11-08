//Java Program to Perform the postorder tree traversal
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

  void postorder(Node node) {
    if (node == null)
      return;
    postorder(node.left);
    postorder(node.right);
    System.out.print(node.item + "->");
  }

  public static void main(String[] args) {
    Tree tree = new Tree();
    tree.root = new Node(1);
    tree.root.left = new Node(12);
    tree.root.right = new Node(9);
    tree.root.left.left = new Node(5);
    tree.root.left.right = new Node(6);

    System.out.println("Postorder traversal");
    tree.postorder(tree.root);
  }
}
