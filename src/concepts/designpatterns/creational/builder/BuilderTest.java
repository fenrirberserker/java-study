package concepts.designpatterns.creational.builder;

public class BuilderTest {

    public static void main(String[] args) {

        MyObject.Builder builder = new MyObject.Builder();

        builder.name("mope").lastName("baby").age(37).build();

        MyObject object = builder.build();

        System.out.println(object);
    }
}
