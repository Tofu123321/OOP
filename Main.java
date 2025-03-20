class Car {
    private int id;
    private static int staticId;
    private String color;
    private int speed;

    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
        
    }

    public void increaseId() {
        id++;
        staticId++;
    }

    public void printid() {
        System.out.println("Id: " + this.id);
        System.out.println("staticId: " + staticId);
    }

    public void increaseSpeed() {
        speed += 10;
    }

    public void decreaseSpeed() {
        speed -= 10;
    }

    public void printSpeed() {
        System.out.println("Speed: " + speed);
    }
}


public class Main {
    public static void main(String[] args) {
        
    }
}