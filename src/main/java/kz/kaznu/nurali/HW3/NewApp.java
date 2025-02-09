package kz.kaznu.nurali.HW3;

import java.util.Arrays;

public class NewApp {
    public static void main(String[] args) {
        //для первого
        int[][] matrix = {
                {1, -2, 7},
                {8, 4, -3},
                {3, -4, -1}
        };
        System.out.println("Sum of positive elements: " + sumOfPositiveElements(matrix));
        //второе
        System.out.println("square: ");
        square(5);
        //четвертое
        System.out.println("max: "+findMax(matrix));
        //пятое
        System.out.println("second row's sum:" + sumOfSecondRow(matrix));

        //третье
        System.out.println("new matrix with zero on diagonals:");
        diagonal(matrix);
        System.out.println(Arrays.deepToString(matrix));
        for (int[] row:matrix) {
            for (int num:row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int num : row) {
                if (num > 0) sum += num;
            }
        }
        return sum;
    }

    public static void square(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void diagonal(int[][] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            array[i][i] = 0;
            array[i][n - 1-i] = 0;
        }
    }

    public static int findMax(int[][] array) {
        int max=array[0][0];
        for (int[] row:array) {
            for (int num:row) {
                if (num>max) {
                    max=num;
                }
            }
        }
        return max;
    }

    public static int sumOfSecondRow(int[][] array) {
        int sum=0;
        if (array.length>1){
            for (int i = 0; i < array[1].length; i++) {
                sum += array[1][i];
            }
        }
        else {
            sum=1;
        }
        return sum;
    }
}
