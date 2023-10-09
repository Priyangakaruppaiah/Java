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
Enter the number of integers: 6
Enter integer 1: 12
Enter integer 2: 5 
Enter integer 3: 67
Enter integer 4: 90
Enter integer 5: 1
Enter integer 6: 4
Smallest integer: 1
Largest integer: 90
*/
