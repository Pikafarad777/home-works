package kz.kaznu.nurali.HW1;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        greetings();
        checkSign();
        selectColor();
        compareNumbers();
        addOrSubtractAndPrint(4, 7, false);
    }

    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }


    public static void checkSign() {
        int a = -3;
        int b = -3;
        int c = 10;
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }


    }

    public static void selectColor() {
        Scanner Red = new Scanner(System.in);
        System.out.print("Введите число");
        int data = Red.nextInt();
        if (data <= 10) {
            System.out.println("КРАСНЫЙ");
        } else if (data > 10 && data <= 20) {
            System.out.println("ЖЕЛТЫЙ");
        } else if (data > 20) {
            System.out.println("ЗЕЛЕНЫЙ");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 6;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");

        }


    }

    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta);
        } else {
            System.out.println(initValue - delta);
        }
    }

}
