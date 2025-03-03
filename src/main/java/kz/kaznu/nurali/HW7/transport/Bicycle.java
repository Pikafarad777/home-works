package kz.kaznu.nurali.HW7.transport;

import kz.kaznu.nurali.HW7.Terrain;
import kz.kaznu.nurali.HW7.transport.Transport;

public class Bicycle extends Transport {
    @Override
    public boolean canMove(Terrain terrain) {
        return terrain != Terrain.SWAMP;
    }
    @Override
    public void move(int distance) {
        System.out.println("Велосипед перемещается на " + distance + " км.");
    }
}
