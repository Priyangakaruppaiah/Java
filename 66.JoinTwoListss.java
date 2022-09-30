//Java program to join two lists
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
	    ArrayList<Integer> l1=new ArrayList<Integer>();
	    l1.add(1);
	    l1.add(2);
	    l1.add(3);
	  
	    ArrayList<Integer> l2=new ArrayList<Integer>();
	    l2.add(1);
	    l2.add(2);
	    l2.add(3);
	    
	    ArrayList<Integer> merge=new ArrayList<Integer>(); 
	    merge.addAll(l1);
	    merge.addAll(l2);
	    System.out.println("L1 : "+l1);
	    System.out.println("L2 : "+l2);
	    System.out.println("mergrd : "+merge);
	  }
}
