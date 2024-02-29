import java.util.Scanner;

public class _14Matrix {
    public static boolean matSearch(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("Key Found at " + "[ " + i + "," + j + " ]");
                    return true;
                }
            }
        }
        System.out.println("Key Not Found");
        return false;
    }

    public static void printSpiral(int spiral[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = spiral.length - 1;
        int endCol = spiral[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            //top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(spiral[startRow][j] + " ");
            }
            //right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(spiral[i][endCol] + " ");
            }
            //bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(spiral[endRow][j] + " ");
            }
            //left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(spiral[i][startCol] + " ");
            }

            startCol++;
            startRow++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    public static int diagonalSum(int spiral[][]) {
        int sum = 0;
        //Brute force method--O(n^2)
//        for (int i = 0; i < spiral.length; i++) {
//            for (int j = 0; j < spiral[0].length; j++) {
//                if (i == j) {
//                    sum += spiral[i][j];
//                } else if (i + j == spiral.length - 1) {
//                    sum += spiral[i][j];
//                }
//            }
//        }
        //oprimised Way --O(n)
        for (int i = 0; i < spiral.length; i++) {
            sum += spiral[i][i];//Primary diagonal
            if (i != spiral.length - i - 1) {
                sum += spiral[i][spiral.length - i - 1];//Secondary Diagonal
            }
        }
        return sum;
    }

    public static boolean scMatrix(int Matrix[][], int Key) {
        int row = 0, col = Matrix[0].length - 1;
        while (row < Matrix.length && col >= 0) {
            if (Matrix[row][col] == Key) {
                System.out.println("Found Key at index : (" + row + "," + col + ")");
                return true;
            } else if (Key < Matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("KEY NOT FOUND");
        return false;
    }


    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

//        Scanner sc = new Scanner(System.in);
//        //2-D Array
//        for (int i = 0; i < n; i++) {                                                                                                                                                                                                                                 
//            for (int j = 0; j < m; j++) {
//                matrix[i][j] = sc.nextInt();
//            }
//        }
//
//        //output
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

        //Search
//        matSearch(matrix, 9);

        //Spiral matrix
//        int spiral[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
//        printSpiral(spiral);

        //Diagonal Sum
//        System.out.println(diagonalSum(spiral));

        //StairCase Search Matrix
        int Matrix[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};
        int Key = 50;
        scMatrix(Matrix, Key);
    }
}
