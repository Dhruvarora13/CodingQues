class MatrixTranspose{

    //Write a code ion java to print Transpose of the given matrix?    --MatrixTranspose.java
    public static void main(String[] args) {

        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };
        int row = matrix.length, column = matrix[0].length;
        display(matrix);

        // Transpose the matrix
        int[][] transpose = new int[column][row];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        display(transpose);
    }

    public static void display(int[][] matrix) {
        System.out.println("The matrix is: ");
        for(int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}