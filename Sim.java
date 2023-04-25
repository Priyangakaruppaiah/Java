/*

Create a class Sim with below attributes:

simId - int
customerName - String
balance - double
ratePerSecond - double
circle - String

Write getters, setters and parameterized constructor as required. 

Public class Solution is already created with main method.
Code inside main method should not be altered else your solution might be scored as zero.
You may copy the code from main method in eclipse to verify your implementation. 

Implement static method - transferCustomerCircle in Solution class.

This method will take first parameter as array of Sim class objects, second parameter as circle to be transferred (which is String parameter circle1) and third parameter as new circle (which is String parameter circle2).

Method will transfer the customer to new circle (circle2), where the circle attribute would match second parameter (circle1). Method will return array of Sim objects for which circle is transferred. Return array should be sorted in descending order of ratePerSecond (assuming ratePerSecond is not same for any of the Sim objects).


This method should be called from main method and display the simId,customerName,circle and ratePerSecond of returned objects (as per sample output).

Main method mentioned above already has Scanner code to read values, create objects and test above methods. Hence do not modify it.

Consider below sample input and output:

Input:
1
raj
100
1.5
KOL
2
chetan
200
1.6
AHD
3
asha
150
1.7
MUM
4
kiran
50
2.2
AHD
5
vijay
130
1.8
AHD
AHD
KOL

Output:
4 kiran KOL 2.2
5 vijay KOL 1.8
2 chetan KOL 1.6


*/

import java.util.Scanner;
public class MyClass
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        s.close();
        input = input.toLowerCase();
        int vowelCount = 0, consonantCount = 0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)>='a' && input.charAt(i)<='z'){
                if(input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u')
                    vowelCount += 1;
                else
                    consonantCount += 1;
            }
        }
        System.out.println("Number of Vowels: "+vowelCount);
        System.out.println("Number of Consonants: "+consonantCount);
    }
}
              
