package kz.kaznu.nurali.HW10;

public class MainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivan Ivanov", "123-456");
        phoneBook.add("Ivan Ivanov", "789-012");
        phoneBook.add("Nurali", "777-777");

        System.out.println("Номера Ivan Ivanov: " + phoneBook.find("Ivan Ivanov"));
    }
}
