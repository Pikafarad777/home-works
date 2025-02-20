package kz.kaznu.nurali.HW5.animal;

public class Animal {
    String name;
    float runSpeed;
    float swimSpeed;
    float stamina;

    public Animal(String name, float runSpeed, float swimSpeed, float stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
    }

    public void info() {
        System.out.println(name + stamina);
    }

    public final float run(int distance) {
        float time = 0;
        int m = 0;
        for (int i = 0; i < distance; i++) {
            stamina -= 1;
            m+=1;
            if (stamina<0) {
                System.out.println(name+" пробежал(-а) "+(m-1)+" метров за "+time+" секунд, но устал. Дайте отдохнуть");
                break;
            }
            time+=1/runSpeed;
        }
        if (stamina>=0) {
        System.out.println(name+" пробежал(-а) "+m+" метров за "+time+" секунд");
        }
        return time;
    }

    public float swim(int distance) {
        float time = 0;
        int m = 0;
        for (int i = 0; i < distance; i++) {
            stamina -= 2;
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
