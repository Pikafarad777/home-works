package kz.kaznu.nurali.HW6;

public class Cat {
    String name;
    int appetite;
    static boolean satiety=false;

    public Cat(String name, int appetite){
        this.name=name;
        this.appetite=appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
    public static void feed(Cat[] cats, Dish dishes) {
        for (int i=0; i < cats.length; i++){
            System.out.println(dishes.current_capacity);
            if (cats[i].appetite<=dishes.current_capacity){
                satiety=true;
                dishes.current_capacity-=cats[i].appetite;
                System.out.println(cats[i].getName()+" удовлетворил(-а) аппетит");
            }
            else {
                System.out.println(cats[i].getName()+" не удовлетворил(-а) аппетит");
            }
        }
    }


}
