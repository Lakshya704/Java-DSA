public class _15Matrix_Exercise {
    //QUES_1
    public static void printof(int array[][]) {
        int countof = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 7) {
                    countof++;
                }
            }
        }
        System.out.println("Count of 7 is : " + countof);
    }

    //QUES_2
    public static void sumNum(int nums[][]) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[1][i];
        }
        System.out.println("Sum of 2nd row is : " + sum);
    }
    //QUES_3

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //Q1
//        int array[][] = {{4, 7, 8}, {8, 8, 7}};
//        printof(array);

        //Q2
//        int nums[][] = {{1, 4, 9}, {11, 4, 3}, {2, 2, 3}};
//        sumNum(nums);

        //Q3
        int matrix[][] = {{11, 12, 13}, {21, 22, 23}};
        printMatrix(matrix);
        int row = 2, col = 3;
        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);
    }
}