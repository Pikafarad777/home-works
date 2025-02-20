package kz.kaznu.nurali.HW5.animal;

public class Cat extends Animal{
    public Cat(String name, float runSpeed, float swimSpeed, float stamina){
        super(name, runSpeed, swimSpeed, stamina);
    }
    @Override
    public float swim(int distance) {
        System.out.println("Кот не умеет плавать! Не проверять.");
        return 0;
    }
}
