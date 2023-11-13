package OOPs._3.inheritance.example.practice.multilvl;

public class Car extends Vehicle {
    Car(int speed) {
        super(speed);
    }

    void topSpeed() {
        System.out.println("Top speed in car!");
    }
}
