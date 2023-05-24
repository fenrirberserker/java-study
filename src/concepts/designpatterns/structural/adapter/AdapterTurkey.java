package concepts.designpatterns.structural.adapter;

public class AdapterTurkey implements Duck{

    Turkey turkey;

    public AdapterTurkey(Turkey turkey){//passing a turkey
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gooble();
    }

    @Override
    public void fly() {//simulating duck behaviour
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }

    }
}
