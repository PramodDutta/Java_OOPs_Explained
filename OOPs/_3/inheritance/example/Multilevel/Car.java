package OOPs._3.inheritance.example.Multilevel;

public class Car extends Vehicle{
    public Car(int i) {
        super(i);
    }

    void topSpeed(){
        System.out.println("Yo I am Car");
    }
}
