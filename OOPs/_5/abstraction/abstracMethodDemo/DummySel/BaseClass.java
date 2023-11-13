package OOPs._5.abstraction.abstracMethodDemo.DummySel;

public abstract class BaseClass {

    BaseClass(){

    }
    // openBrowser
    abstract String openBrowser();
    //closeBrowser
    abstract void closeBrowser();

    void printlogs(){
        System.out.println("I am printing logs");
    }
}
