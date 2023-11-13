package OOPs._2.ecapsulation.accessModifiers.police;

public class Cop {

    private int gun;

    public Cop(int gun){
        this.gun = gun;
    }

    public int getGuns(){
        return gun;
    }

    protected void canIShoot(){
        System.out.println("Ofcourse, Shoot");
    }
}
