package kz.kaznu.nurali.HW7.transport;

import kz.kaznu.nurali.HW7.Terrain;
import kz.kaznu.nurali.HW7.transport.Transport;

import java.util.EnumSet;

public class Car extends Transport {
    private int fuel = 100;
    @Override
    public boolean canMove(Terrain terrain){
        return !EnumSet.of(Terrain.FOREST, Terrain.SWAMP).contains(terrain);
    }

    @Override
    public void move(int distance) {
        if (fuel>=distance){
            fuel-=distance;
            System.out.println("Машина перемещается на " + distance + " км. Осталось бензина: " + fuel);
        } else {
            System.out.println("Не хватает бензина");
        }
    }
}
