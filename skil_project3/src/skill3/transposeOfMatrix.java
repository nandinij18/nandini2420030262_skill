package skill3;
public class transposeOfMatrix {
public static void main(String[] args) {
        int[][] original = {
            {0, 5, 9},
            {4, 3, 2}
        };
        int rows = 2, cols = 3;
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = original[i][j];
            }
        }
        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
