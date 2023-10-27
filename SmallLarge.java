import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.print("Enter integer "+(i+1)+": ");
            arr[i] = sc.nextInt();sc.nextLine();
        }
        Arrays.sort(arr);
        System.out.println("Smallest integer: "+arr[0]);
        System.out.println("Largest integer: "+arr[n-1]);
    }    
}
/*
OUTPUT:
Enter the number of integers: 5
Enter integer 1: 4
Enter integer 2: -0
Enter integer 3: -4
Enter integer 4: 10
Enter integer 5: 6
Smallest integer: -4
Largest integer: 10
*/
