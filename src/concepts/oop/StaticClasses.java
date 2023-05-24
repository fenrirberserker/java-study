package concepts.oop;

public class StaticClasses {

    public static int value=1;

    public static void main(String[] args) {

//        doThing();//error

        value=+1;//can call static from static
        new StaticClasses().doThing();


    }

    public void doThing(){
        value=+1;//can call static from non static
    }

    public static void staticMethod(){
//        doThing();//error calling non static
        value=+1;//can call static from static
    }


}
