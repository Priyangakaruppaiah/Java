//Java program to convert a list to array and vice versa
import java.util.ArrayList;
class Main
{
	public static void main(String[] args){
	ArrayList lan=new ArrayList<>();
	
	lan.add("java");
	lan.add("Python");
	lan.add("JavaScript");
	System.out.println("ArrayList: " + lan);
	String[] arr=new String[lan.size()];
	lan.toArray(arr);
	System.out.println("Array:");
	for(String item:arr){
	    System.out.println(item+" ,");
	}
	
	}
}

