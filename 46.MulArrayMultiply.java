//Java program to multiply two matrix using multi-dimensional arrays
public class Main
{
	public static void main(String[] args) {
		int r1=2,c1=3;
		int r2=3,c2=2;
		int[][] firstmatrix={{1,-2,2},{1,2,3}};
		int[][] secondmatrix={{2,-1},{1,2},{2,5}};
		int[][] product=new int[r1][c2];
	    for(int i=0;i<r1;i++){
		    for(int j=0;j<c2;j++){
		        for(int k=0;k<c1;k++){
		            product[i][j] += firstmatrix[i][k] * secondmatrix[k][j];
		            
		        }
		    }
		System.out.println("Multiplication of two matrices is:");
		for(int[] row:product){
		    for(int column : row){
		        System.out.print(column + " ");
		    }
		    System.out.println();
		}
		}
	
	}
}


