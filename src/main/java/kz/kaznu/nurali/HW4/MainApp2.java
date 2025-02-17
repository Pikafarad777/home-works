package kz.kaznu.nurali.HW4;

public class MainApp2 {
    public static void main(String[] args) {
        Box box = new Box(5, 4, 7, "Red",true, true);
        box.setEmpty(false);

        box.put();

        box.info();
    }
}
