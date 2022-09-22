//Java program to multiply two matrices by passing matrix to a function
public class Main
{
	public static void main(String[] args) {
	    int r1=2,c1=3;
	    int r2=3,c2=2;
		int[][] firstmatrix={{1,-2,2},{1,2,3}};
		int[][] secondmatrix={{2,-1},{1,2},{2,3}};
		int[][] product=multiplymatrices(firstmatrix,secondmatrix,r1,c1,c2);
		displayproduct(product);
	}
	public static int[][] multiplymatrices(int[][] firstmatrix, int[][] secondmatrix,int r1,int c1,int c2){
	  	int[][] product = new int[r1][c2];
	  	for(int i=0;i<r1;i++){
		    for(int j=0;j<c2;j++){
		        for(int k=0;k<c1;k++){
		            product[i][j] += firstmatrix[i][k] * secondmatrix[k][j];
		            
		        }
		    }
		}
		return product;
	}
	public static void displayproduct(int[][] product){
	    System.out.println("Product of two matrices is:");
	    for(int[] row:product){
	        for(int column:row){
	            System.out.print(column+"  ");
	        }
	        
	    System.out.println();
	}
	
	}
}

