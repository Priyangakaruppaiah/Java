//Java program to pass method call as arguements to another method
class Main
{
    public int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    public void square(int num){
        int result=num*num;
        System.out.println(result);
    }
	public static void main(String[] args) {
	    Main obj=new Main();
	    obj.square(obj.add(34,8));
		
	}
}

