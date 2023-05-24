package concepts.designpatterns.structural.adapter;

public class WildTurkey implements Turkey{
    @Override
    public void gooble() {
        System.out.println("Gooble gooble");
    }

    @Override
    public void fly() {
        System.out.println("Flying short distance");
    }
}
