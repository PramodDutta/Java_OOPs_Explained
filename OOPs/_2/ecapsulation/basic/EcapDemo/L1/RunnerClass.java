package OOPs._2.ecapsulation.basic.EcapDemo.L1;

public class RunnerClass {

    public static void main(String[] args) {

        Books java = new Books();
        java.setTitle("Head First Java");

        System.out.println(java);

        // Add more copies
        java.numberOfCopies = -1;
        System.out.println(java);


    }
}
