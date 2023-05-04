class Pattern 
{
  public void display() 
   {
    for (int i = 0; i < 2; i++)
    {
      System.out.print("Today students are tomorrow builders");
    }
  }

   public void display(char symbol)
   {
    for (int i = 0; i < 2; i++) 
    {
      System.out.print(symbol);
    }
  }
}

class Main 
{
  public static void main(String[] args) 
  {
    Pattern d1 = new Pattern();
    d1.display();
    System.out.println("\n");
    d1.display('*');
  }
}
/*
OUTPUT:
Today students are tomorrow buildersToday students are tomorrow builders

**
*/
