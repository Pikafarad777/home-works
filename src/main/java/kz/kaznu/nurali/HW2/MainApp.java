package kz.kaznu.nurali.HW2;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        printString(5, "The Amazing Spider man will be released in 2012");
        sumOfMassive();
        int[] massive1 = new int[5];
        massive1(7, massive1);
        newmassive();
        compareHalves();
    }

    public static void printString(int n, String s) {
        while (n-- > 0) System.out.println(s);
    }

    public static void sumOfMassive() {
        int[] array = {1, 7, -5, 15, 52};
        int sum = 0;
        for (int i = 0; i<array.length; i++) {
            if (array[i]> 5) {
                sum += array[i];
            }
        }
        System.out.println("summary of elements >5: "+sum);
    }

    public static void massive1(int n, int[] arr) {
        for (int i = 0; i< arr.length; i++) {
            arr[i]=n;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void newmassive() {
        int[] newarray = {2, 5, 7, 14, 52};
        for (int i = 0; i< newarray.length; i++) {
            newarray[i]+=2;
        }
        System.out.println(Arrays.toString(newarray));
    }

    public static void compareHalves() {
        int[] array3 = {2, 3, 4, 1, 32, 7, 1, 4};
        int mid = array3.length/2;
        int sum1 = 0, sum2=0;
        for (int i = 0; i<mid; i++) {
            sum1+=array3[i];
        }
        for (int i = mid; i<array3.length; i++) {
            sum2+=array3[i];
        }
        System.out.println(sum1>sum2? "First is bigger: " + sum1:
                sum1<sum2 ? "Second is bigger: " + sum2:
                "They are equal: " + sum1);
    }
}