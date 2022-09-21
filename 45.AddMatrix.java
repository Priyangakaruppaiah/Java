//Java program to add the matrix using multi-dimensional arrays
public class Main
{
	public static void main(String[] args) {
	   int rows=2,columns=3;
	   int[][] firstmatrix={{2,3,4},{5,2,3} };
	   int[][] secondmatrix={{4,2,3},{2,4,4} };
	   int[][] sum=new int[rows][columns];
	   for(int i=0;i<rows;i++){
	        for(int j=0;j<columns;j++){
	            sum[i][j]= firstmatrix[i][j]+secondmatrix[i][j];
	         }
	     }
	     System.out.println("Sum of two matrices is:");
	     for(int[] row : sum){
	         for(int column : row){
	             System.out.print(column+"   ");
	         }
	         System.out.println();
	     }
	   
	}
}

