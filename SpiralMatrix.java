class SpiralMAtrix{


    //Write the code in Java to Print the Spiral Matrix from a 4x4 Matrix?
    public static void main(String[] args) {
        int[][] mattrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10, 11, 12},
                {13,14, 15, 16}};
        Printspiral(mattrix);
    }
    public static void Printspiral(int [][] matrix){
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length-1;
        int endcol = matrix[0].length-1;
        while(startrow<=endrow && startcol<=endcol) {

            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j]+" ");
            }
            for (int i = startrow+1; i < endrow; i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            for(int k = endcol ;k>startcol;k--){
                System.out.print(matrix[endrow][k]+" ");
            }
            for (int l = endrow; l >startrow ; l--) {
                System.out.print(matrix[l][startcol]+" ");
            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }
    }
}