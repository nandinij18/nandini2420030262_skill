package skill3;

public class addOfMatrix {
	 public static void main(String[] args) {
	        int[][] a = {
	            {8, 7},
	            {1, 6}
	        };

	        int[][] b = {
	            {2, 3},
	            {9, 0}
	        };
	        int[][] sum = new int[2][2];

	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                sum[i][j] = a[i][j] + b[i][j];
	            }
	        }
	        System.out.println("Result of matrix addition:");
	        for (int i = 0; i < 2; i++) {
	            for (int j = 0; j < 2; j++) {
	                System.out.print(sum[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}