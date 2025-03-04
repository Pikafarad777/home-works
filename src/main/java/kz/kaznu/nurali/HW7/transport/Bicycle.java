package kz.kaznu.nurali.HW7.transport;

import kz.kaznu.nurali.HW7.Terrain;

public class Bicycle implements Movement {
    @Override
    public boolean canMove(Terrain terrain) {
        return terrain != Terrain.SWAMP;
    }
    @Override
    public void move(int distance) {
        System.out.println("Велосипед перемещается на " + distance + " км.");
    }
}
