package kz.kaznu.nurali.HW6;

public class Dish {
    int max_capacity;
    int current_capacity=max_capacity;

    public Dish(int max_capacity) {
        this.max_capacity = max_capacity;
        this.current_capacity = max_capacity;
    }

    public int getMax_capacity() {
        return max_capacity;
    }

    public int getCurrent_capacity() {
        return current_capacity;
    }

    public void put(int x) {
        current_capacity += x;
        if (current_capacity >= max_capacity) {
            current_capacity = max_capacity;
            System.out.println("Тарелка полная еды.");
        }


    }
    public boolean reduce(int y){
        current_capacity-=y;
        if (current_capacity>=0){
            return true;
        }
        else {
            return false;
        }
    }

}
