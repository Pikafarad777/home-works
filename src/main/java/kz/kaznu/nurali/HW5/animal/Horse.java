package kz.kaznu.nurali.HW5.animal;

public class Horse extends Animal {
    public Horse(String name, float runSpeed, float swimSpeed, float stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }
    public float swim(int distance) {
        float time = 0;
        int m = 0;
        for (int i = 0; i < distance; i++) {
            stamina -= 4;
            m+=1;
            if (stamina<0) {
                System.out.println(name+" проплыл(-а) "+(m-1)+" метров за "+time+" секунд, но устал. Дайте отдохнуть");
                break;
            }
            time+=1/swimSpeed;
        }
        if (stamina>=0) {
            System.out.println(name+" проплыл(-а) "+m+" метров за "+time+" секунд.");
        }
        return time;
    }
}