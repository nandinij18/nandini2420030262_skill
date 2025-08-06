package skill3;
public class multipicationOfMatrix {
	public static void main(String[] args) {
        int[][] a = {
            {0, 2},
            {1, 4}
        };
        int[][] b = {
            {6, 3},
            {5, 7}
        };
        int[][] product = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                product[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    product[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(product[i][j] + " ");
            }
            System.out.println();
        }
    }
}

