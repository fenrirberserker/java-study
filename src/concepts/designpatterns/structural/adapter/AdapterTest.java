package concepts.designpatterns.structural.adapter;

public class AdapterTest {


    public static void main(String[] args) {

        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new AdapterTurkey(turkey);//adapts the interfaces acting as a bridge

        System.out.println("The turkey says: ");
        turkey.gooble();
        turkey.fly();

        System.out.println("\nThe Duck says:");
        testDuck(duck);

        System.out.println("\nThe turkey adapter says");
        testDuck(turkeyAdapter);


        System.out.println();
    }

    static void testDuck(Duck duck){

        duck.quack();
        duck.fly();

    }
}
