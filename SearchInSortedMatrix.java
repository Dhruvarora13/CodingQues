class SearchInSortedMatrix {

    //Write a code in java to search the given element in Sorted matrix?    Complexity is O(n) || O(m)   -- n is row & m is col
    public static void main(String[] args) {
       int [][] mat = {{10,20,30,40},
                       {15,25,35,45},
                       {27,29,37,48},
                       {32,34,39,50},
                       {33,36,42,55}};
       int key = 33;
       SearchElement(mat,key);
    }

    public static boolean SearchElement(int [] [] mat,int key) {
        int row = 0, col = mat[0].length - 1;
        if (mat.length <= mat[0].length) {
            while (row < mat.length && col >= 0) {
                if (key == mat[row][col]) {
                    System.out.println("The element " + key + " found at " + row + " & " + col);
                    return true;
                } else if (key < mat[row][col]) {
                    col--;
                } else {
                    row++;
                }
            }
        }
        else{
            row = mat.length-1;
            col = 0;
            while ( row >= 0 && col < mat[0].length ) {
                if (key == mat[row][col]) {
                    System.out.println("The element " + key + " found at " + row + " & " + col);
                    return true;
                } else if (key < mat[row][col]) {
                    row--;
                } else {
                    col++;
                }
            }
        }
        System.out.println("Key not found ");
        return false;
    }
}