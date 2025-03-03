package kz.kaznu.nurali.HW7.transport;

import kz.kaznu.nurali.HW7.Terrain;

public abstract class Transport {
    public abstract boolean canMove(Terrain terrain);
    public abstract void move(int distance);

}
