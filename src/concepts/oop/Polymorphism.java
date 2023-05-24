package concepts.oop;

public class Polymorphism {

    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassA ab = new ClassB();//upcast is always valid
        ClassB b = new ClassB();
//        ClassB ba = new ClassA();//will fail because B has methods not existing in A
//        ClassB ba = (ClassB) new ClassA();//downcasting invalid
//        ba.doThing();//fails at runtime ClassCastException
        ClassB b2 = (ClassB) ab;// downcasting valid ref ClassA -> ref ClassB
        b2.doThing();//invokes ClassB method

        a.doThing();
        ab.doThing();
        b.doThing();
//        ab.doBThing();//error, ClassA has no doBThing method

        /*The compiler sees only the methods in the ref class (left assign)
        * But executes the instance's method (right assign)*/

        /*When working with objects
        * The overriden methods run the instance method (runtime)
        * The overloaded methods take the reference method (compile time)*/
    }


}
