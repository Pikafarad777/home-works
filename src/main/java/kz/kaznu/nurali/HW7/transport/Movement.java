package kz.kaznu.nurali.HW7.transport;

import kz.kaznu.nurali.HW7.Terrain;

public interface Movement {
    boolean canMove(Terrain terrain);
    void move(int distance);

}
