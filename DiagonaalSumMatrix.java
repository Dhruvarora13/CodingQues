class DiagonalSumMatrix{

    //Write the code in Java to Print the Sum of Diagonal Element of nxn Matrix?   
    public static void main(String[] args) {
        int[][] mattrix = {{1, 2, 3,4},
                {5, 6, 7,8},
                {9,10, 11,12},
                {13,14,15,16}};
        Diagonal(mattrix);
    }
    public static void Diagonal(int [][] matrix){
        int sum = 0;

        //BruteForce
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                if (i == j) {         //PrimaryDiagonal
//                    sum += matrix[i][j];
//                }
//                if ((i + j) == matrix.length - 1) {   //SecondaryDiagonal
//                    sum += matrix[i][j];
//                }
//            }
//        }
        //  System.out.println(sum);
        //OptimizedApproah

        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];

            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];

            }
        }
        System.out.println(sum);

    }
}