package kz.kaznu.nurali.HW6;

public class MainApp {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 50),
                new Cat("Murka", 40),
                new Cat("Leo", 60),
        };
        Dish dishes = new Dish(120);

        dishes.put(110);
        Cat.feed(cats, dishes);

    }
}
