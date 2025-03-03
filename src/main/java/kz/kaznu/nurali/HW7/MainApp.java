package kz.kaznu.nurali.HW7;

import kz.kaznu.nurali.HW7.transport.Bicycle;
import kz.kaznu.nurali.HW7.transport.Car;
import kz.kaznu.nurali.HW7.transport.Crossover;
import kz.kaznu.nurali.HW7.transport.Horse;

public class MainApp {
    public static void main(String[] args) {
        Human human = new Human("Иван");
        Car car = new Car();
        Horse horse = new Horse();
        Bicycle bike = new Bicycle();
        Crossover crossover = new Crossover();

        human.setCurrentTransport(car);
        human.move(Terrain.PLAIN, 10);
        human.setCurrentTransport(bike);
        human.move(Terrain.SWAMP, 10);
        human.removeTransport();
        human.move(Terrain.PLAIN, 10);

    }
}
