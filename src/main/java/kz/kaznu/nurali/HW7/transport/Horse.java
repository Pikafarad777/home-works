package kz.kaznu.nurali.HW7.transport;

import kz.kaznu.nurali.HW7.Terrain;
import kz.kaznu.nurali.HW7.transport.Transport;

public class Horse extends Transport {
    private int energy = 100;
    @Override
    public boolean canMove(Terrain terrain){
        return terrain!=Terrain.SWAMP;
    }
    @Override
    public void move(int distance){
        if (energy>=distance){
            energy-=distance;
            System.out.println("Лошадь перемещается на "+distance+" км.Осталось сил: " + energy);
        } else {
            System.out.println("Лошадь устала передвигаться");
        }
    }
}