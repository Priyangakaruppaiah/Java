//Java program to call one constructor from another
class Main{
    int sum;
    Main(){
      
        this(5,2);
    }
    Main(int arg1,int arg2){
        this.sum=arg1+arg2;
    }
    void display(){
        System.out.println("sum is:"+sum);
    }
    public static void main(String ar[]){
        Main ob=new Main();
        ob.display();
    }
}

