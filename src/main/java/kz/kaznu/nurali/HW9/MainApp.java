package kz.kaznu.nurali.HW9;

import java.util.ArrayList;

import static kz.kaznu.nurali.HW9.ArrayMethods.*;

public class MainApp {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        ArrayList<Integer> range = generateRange(min, max);
        System.out.println(range);

        ArrayList<Integer> myList=createRange();
        System.out.println(myList);
        System.out.println(sumElementsGreaterThanFive(myList));
        var newList = (ArrayList<Integer>) myList.clone();

        System.out.println(ArrayMethods.replaceElementsWithNumber(7, myList));
        System.out.println(increaseElementsWithNumber(5, newList));

        ArrayList<Employee> employees = createStuff();
        System.out.println(getEmployeeNames(employees));

        System.out.println(filterEmployees(employees, 20));

        isAverage(employees, 25);

        System.out.println(getYoungestEmployee(employees));








    }
}
