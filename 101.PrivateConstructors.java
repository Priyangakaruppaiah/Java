//Java program to implement private constructors
class test{
    private test(){
        System.out.println("This is a private constructors");
    }
    public static void instancemethod(){
        test s=new test();
    }
}    

class Main
{
	public static void main(String[] args) {
	test.instancemethod();
	}
}


