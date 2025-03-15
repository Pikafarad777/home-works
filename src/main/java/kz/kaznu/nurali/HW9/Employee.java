package kz.kaznu.nurali.HW9;

public class Employee {
    String name;
    int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }

    public String toString(){
        return name;
    }
}
