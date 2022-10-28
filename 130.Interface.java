//Java Program to Implement multiple inheritance
interface Backend{
    public void connectServer();
}
class frontend{
    public void responsive(String str) {
        System.out.println(str + " can also be used as frontend.");
     }
}
class language extends frontend implements  Backend{
    String language="java";
    public void connectServer() {
        System.out.println(language + " can be used as backend language.");
  }
 
  public static void main(String[] args) {
	    language java=new language();
	    java.connectServer();
	    java.responsive(java.language);
	

  }
}


