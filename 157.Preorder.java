//Java Program to Perform the preorder tree traversal
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

  void preorder(Node node) {
    if (node == null)
      return;
System.out.print(node.item + "->");
  
    preorder(node.left);
  
    preorder(node.right);
  }

  public static void main(String[] args) {
    Tree tree = new Tree();

    
    tree.root = new Node(1);
    tree.root.left = new Node(12);
    tree.root.right = new Node(9);
    tree.root.left.left = new Node(5);
    tree.root.left.right = new Node(6);
    System.out.println("\nPreorder traversal ");
    tree.preorder(tree.root);
  }
}

