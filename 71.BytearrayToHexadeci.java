//Java program to convert Byte Array to HexaDecimal
public class Main
{
	public static void main(String[] args) {
	    byte[] bytes = {10,2,15,11};
	    for(byte b : bytes){
	        String st = String.format("O2X",b);
	        System.out.print(st);
	    }
	
	}
}
