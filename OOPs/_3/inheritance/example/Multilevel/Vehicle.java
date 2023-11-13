package OOPs._3.inheritance.example.Multilevel;

public class Vehicle {

    int seats;
    String engineType;
    int speed;

    Vehicle(int speed){
        this.speed = speed;
    }

    // Meethods
    void topSpeed(){
        System.out.println("Top Speed"+this.speed);
    }
}


