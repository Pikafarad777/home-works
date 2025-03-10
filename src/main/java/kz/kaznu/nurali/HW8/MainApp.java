package kz.kaznu.nurali.HW8;

import static kz.kaznu.nurali.HW8.ArrayUtils.checkArray;

public class MainApp {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] array1 = {
                {"1", "2", "3", "4"},
                {"5", "6", "t", "l"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] array2 = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15"}
        };

        try {
            ArrayUtils.checkArray(array);
            int result = ArrayUtils.calculateSum(array);
            System.out.println("Сумма элементов: " + result);
        } catch (AppArraySizeException | AppArrayDataException ex) {
            System.out.println("Ошибка: " + ex.getMessage());
        }

        try {
            ArrayUtils.checkArray(array1);
            int result = ArrayUtils.calculateSum(array1);
            System.out.println("Сумма элементов: " + result);
        } catch (AppArraySizeException | AppArrayDataException ex) {
            System.out.println("Ошибка: " + ex.getMessage());
        }

        try {
            ArrayUtils.checkArray(array2);
            int result = ArrayUtils.calculateSum(array2);
            System.out.println("Сумма элементов: " + result);
        } catch (AppArraySizeException | AppArrayDataException ex) {
            System.out.println("Ошибка: " + ex.getMessage());
        }
    }
}
