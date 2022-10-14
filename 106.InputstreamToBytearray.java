//Java program to convert the InputStream into ByteArray
import java.io.InputStream;
import java.util.Arrays;
import java.io.ByteArrayInputStream;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		try{
		   
		    Scanner sc=new Scanner(System.in);
		    byte n1=sc.nextByte();
		    byte input[]=new byte[5];
		    for(int i=0;i<n1;i++){
		        input[i]=sc.nextByte();
		    }
		    InputStream stream =new ByteArrayInputStream(input);
		    System.out.println("Input stream:"+stream);
		    byte[] array=stream.readAllBytes();
		   
		    System.out.println("Byte array:"+Arrays.toString(array));
		    stream.close();
		}
		catch(Exception e){
		    e.getStackTrace();
		}
	}
}



