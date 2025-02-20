package kz.kaznu.nurali.HW5;

import kz.kaznu.nurali.HW5.animal.Cat;
import kz.kaznu.nurali.HW5.animal.Dog;
import kz.kaznu.nurali.HW5.animal.Horse;

public class MainApp {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 10, 10, 100);
        Dog dog = new Dog("Rex", 9, 5, 200);
        Horse horse = new Horse("Maximus", 15, 3, 400);

        cat.swim(50);
        cat.run(10);
        dog.swim(400);
        horse.swim(200);



    }
}
