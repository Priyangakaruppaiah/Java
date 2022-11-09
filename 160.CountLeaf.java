//Java Program to Count number of leaf nodes in a tree
class Node {
  int item;
  Node left, right;

  public Node(int key) {
  item = key;
  left = right = null;
  }
}

class Main {
 Node root;
 Main() {
  root = null;
  }
 public static int countLeaf(Node node) {
    if(node == null) {
      return 0;
    }

    if (node.left == null && node.right == null) {
      return 1;
    }
    else {
      return countLeaf(node.left) + countLeaf(node.right);
    }
  }

  public static void main(String[] args) {
    Main tree = new Main();
    
    tree.root = new Node(5);
    tree.root.left = new Node(3);
    tree.root.right = new Node(8);

    tree.root.left.left = new Node(2);
    tree.root.left.right = new Node(4);

    tree.root.right.left = new Node(7);
    tree.root.right.right = new Node(9);

    int leafNodes = countLeaf(tree.root);
    System.out.println("Total Leaf Nodes = " + leafNodes);
  }
}
