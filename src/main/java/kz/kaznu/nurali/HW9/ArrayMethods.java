package kz.kaznu.nurali.HW9;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayMethods {
    public static ArrayList<Integer> generateRange(int min, int max) {
        ArrayList<Integer> range = new ArrayList<>();
        for (int i=min; i<=max; i++){
            range.add(i);
        }
        return range;
    }

    public static int sumElementsGreaterThanFive(ArrayList<Integer> numbers){
        int sum=0;
        for (int num:numbers){
            if (num>5){
                sum+=num;
            }
        }
        return sum;
    }

    public static ArrayList<Integer> createRange() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Put numbers");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                arrayList.add(number);
            }
            else{
                break;
            }
        }
        return arrayList;
    }

    public static ArrayList<Integer> replaceElementsWithNumber(int number, ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, number);
        }
        return list;
    }

    public static ArrayList<Integer> increaseElementsWithNumber(int number, ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)+number);
        }
        return list;
    }

    public static ArrayList<Employee> createStuff(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        System.out.println("Put employees");
        while(true){
            System.out.println("name: ");
            String name = scanner.nextLine();
            if(name.equals("stop")){
                break;
            }
            System.out.println("age");
            int age;
            try {
                age = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Возраст должен быть числом. Попробуйте снова.");
                continue;
            }

            employees.add(new Employee(name, age));
            System.out.println("Сотрудник добавлен!\n");
        }
        return employees;
    }

    public static ArrayList<String> getEmployeeNames(ArrayList<Employee> employees) {
        ArrayList<String> employeeNames = new ArrayList<>();
        for (Employee employee : employees) {
            employeeNames.add(employee.getName());
        }
        System.out.println("Список всех сотрудников: ");
        return employeeNames;
    }


    public static ArrayList<Employee> filterEmployees(ArrayList<Employee> employees, int minAge){
        ArrayList<Employee> filteredEmployees = new ArrayList<>();
        for (Employee employee : employees){
            if (employee.getAge()>minAge){
                filteredEmployees.add(employee);
            }
        }
        System.out.println("Список сотрудников, чей возраст больше "+minAge+": ");
        return filteredEmployees;
    }

    public static void isAverage(ArrayList<Employee> employees, int minAvgAge){
        if (employees==null||employees.isEmpty()){
            System.out.println("Список пустой");
            return;
        }
        int totalAge=0;
        for (Employee employee:employees){
            totalAge+=employee.getAge();
        }
        double avgAge = (double) totalAge/employees.size();
        System.out.println("Средний возраст сотрудников: " + avgAge);
        if (avgAge>=minAvgAge){
            System.out.println("Средний возраст сотрудников соответствует требованиям");
        }
        else{
            System.out.println("Средний возраст сотрудников меньше минимального требуемого");
        }
    }
    public static Employee getYoungestEmployee(ArrayList<Employee> employees){
        if (employees==null||employees.isEmpty()){
            System.out.println("The list is empty");
            return null;
        }
        System.out.println("Самый молодой сотрудник: ");
        Employee youngest = employees.get(0);
        for (Employee employee:employees){
            if (employee.getAge()< youngest.age){
                youngest=employee;
            }
        }
        return youngest;
    }

}
