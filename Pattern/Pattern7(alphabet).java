class Main  
{  
    public static void main(String[] args)  
    {  
        int n = 4;  
        for(int i = 1;i<=n;i++)  
        {  
        for(int j=1;j<=i;j++)  
        {  
            System.out.print(" "+(char)(65 + i));  
        }  
            System.out.println("");  
        }  
    }  
} 
/*
OUTPUT:
A
B B
C C C
D D D D
E E E E E
*/
