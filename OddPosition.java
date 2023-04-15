//Program to print the elements of an array present on odd position
public class Main{  
    public static void main(String[] args) {  
        int[] arr = new int [] {1, 2, 3, 4, 5};  
        System.out.println("Elements of given array present on odd position: ");  
        for (int i = 0; i < arr.length; i = i+2) {  
            System.out.println(arr[i]);  
        }  
    }  
}  
/*
OUTPUT:
Elements of given array present on odd position: 
1
3
5
*/
