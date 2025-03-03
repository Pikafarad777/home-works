package kz.kaznu.nurali.HW7.transport;

import kz.kaznu.nurali.HW7.Terrain;
import kz.kaznu.nurali.HW7.transport.Transport;

public class Crossover extends Transport {
    private int fuel = 100;
    @Override
    public boolean canMove(Terrain terrain) {
        return true;
    }
    @Override
    public void move(int distance) {
        if (fuel >= distance) {
            fuel -= distance;
            System.out.println("Вездеход перемещается на " + distance + " км. Осталось бензина: " + fuel);
        } else {
            System.out.println("Недостаточно бензина.");
        }
    }
}