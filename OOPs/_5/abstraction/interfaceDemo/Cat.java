package OOPs._5.abstraction.interfaceDemo;

// multiple inheritance
public class Cat extends Bird implements ICanFly{
    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+"can't fly");
    }
}
