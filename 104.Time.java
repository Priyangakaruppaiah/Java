//Java program to calculate the execution time of methods
class Main
{ 
    public void display(){
    System.out.println("Calculating Method exexcution time:");
    }
	public static void main(String[] args) {
	    Main obj=new Main();
	    long start=System.nanoTime();
	    obj.display();
	    long end=System.nanoTime();
	    long execution=end-start;
		System.out.println("execution time:"+execution+"nanoseconds");
	}
}
