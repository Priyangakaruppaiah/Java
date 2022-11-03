//Java Program to Detect loop in a LinkedList
class LinkedList {
  Node head;
  static class Node {
  int value;
  Node next;
   Node(int d) {
      value = d;
      next = null;
    }
  }
 public boolean checkLoop() {
    Node first = head;
    Node second = head;
    while(first != null && first.next !=null) {
     first = first.next.next;
     second = second.next;
     if(first == second) {
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();
    linkedList.head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);
    linkedList.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = second;
    System.out.print("LinkedList: ");
    int i = 1;
    while (i <= 4) {
      System.out.print(linkedList.head.value + " ");
      linkedList.head = linkedList.head.next;
      i++;
    }
    boolean loop = linkedList.checkLoop();
    if(loop) {
      System.out.println("\nThere is a loop in LinkedList.");
    }
     else {
      System.out.println("\nThere is no loop in LinkedList.");
    }
  }
}
