package kz.kaznu.nurali.HW7;

import kz.kaznu.nurali.HW7.transport.Movement;

public class Human {
    private String name;
    private Movement currentTransport;
    private int energy = 10;


    public Human(String name) {
        this.name = name;
    }

    public void setCurrentTransport(Movement transport) {
        this.currentTransport = transport;
        System.out.println(name + " сел на " + transport.getClass().getSimpleName());
    }

    public void removeTransport() {
        if (currentTransport != null) {
            System.out.println(name + " слез с " + currentTransport.getClass().getSimpleName());
            this.currentTransport = null;
        } else {
            System.out.println(name + " не находится в транспорте.");
        }
    }

    public void move(Terrain terrain, int distance) {
        if (currentTransport!=null){
            if (currentTransport.canMove(terrain)){
                currentTransport.move(distance);

            }
            else {
                System.out.println(name+" не сможет проехать на этой местности");
            }
        }
        else {
            if (energy>=distance){
                energy-=distance;
                System.out.println("Человек перемещается на "+distance+" км.Осталось сил: " + energy);
            } else {
                System.out.println("Человек устал идти");
            }
        }
    }
}
