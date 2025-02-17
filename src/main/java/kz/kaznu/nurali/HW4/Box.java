package kz.kaznu.nurali.HW4;

public class Box {
    private int a;
    private int b;
    private int c;
    private String color;
    private boolean open;
    private boolean empty;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void isOpen() {
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void isEmpty() {
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public Box(int a, int b, int c, String color, boolean open, boolean empty) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.color = color;
        this.open = open;
        this.empty = empty;
    }

    public void info() {
        System.out.println("Информация о коробке:"+"\nSize of box: " + a + "*" + b + "*" + c + "\nColor: " + color + "\nОткрыта? " + open + "\nСвободна? " + empty);
        System.out.println();
    }

    public void put() {
        if (open) {
            if (empty) {
                empty = false;
                System.out.println("Предмет положили");
            } else {
                System.out.println("Коробка открыта, но полная. Нельзя положить предмет!");
            }
        } else {
            System.out.println("Коробка закрыта. Нельзя положить предмет!");
        }
        System.out.println();
    }

    public void abort() {
        if (open) {
            if (!empty) {
                empty = true;
                System.out.println("Предмет выбросили");
            } else {
                System.out.println("Коробка открыта, но пустая. Нечего выбрасывать!");
            }
        } else {
            System.out.println("Коробка закрыта. Нельзя достать предмет!");
        }
        System.out.println();
    }
}
