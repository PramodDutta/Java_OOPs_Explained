package OOPs._5.abstraction.abstracMethodDemo;

public class Meow extends Animal{
    @Override
    void say() {
        System.out.println(getClass().getSimpleName()+" says Meow");
    }
}
