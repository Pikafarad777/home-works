package kz.kaznu.nurali.HW2;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        printString(5, "The Amazing Spider man will be released in 2012");
        int[] arr1 = {1,2,3,4,5,6};
        sumOfMassive(5, arr1);
        massive1(7, arr1);
        newmassive(arr1);
        compareHalves(arr1);
    }

    public static void printString(int n, String s) {
        while (n-- > 0) System.out.println(s);
    }

    public static void sumOfMassive(int n, int[] array) {
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
    public static void newmassive(int [] arr) {
        for (int i = 0; i< arr.length; i++) {
            arr[i]+=2;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void compareHalves(int [] array3) {
        int mid = array3.length/2;
        if (array3.length%2!=0) {
            mid=mid+1;
        }
        int sum1 = 0, sum2=0;
        for (int i = 0; i<mid; i++) {
            sum1+=array3[i];
        }
        for (int i = mid; i<array3.length; i++) {
            sum2+=array3[i];
        }
        System.out.println("Сумма первой половины: " + sum1);
        System.out.println("Сумма второй половины: " + sum2);
        System.out.println(sum1>sum2? "First is bigger: " + sum1:
                sum1<sum2? "Second is bigger: " + sum2:
                "They are equal: " + sum1);
    }
}