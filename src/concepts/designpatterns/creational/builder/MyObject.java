package concepts.designpatterns.creational.builder;

public class MyObject {

    public static class Builder{

        private String name;
        private String lastName;
        private int age;

        public Builder(){

        }

        public MyObject build(){
            return new MyObject(this);
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }



    }

    private String name;
    private String lastName;
    private int age;

    public MyObject(Builder builder){
        this.name = builder.name;
        this.lastName = builder.lastName;
        this.age = builder.age;

    }


    public String name() {
        return name;
    }

    public String lastName() {
        return lastName;
    }

    public int age() {
        return age;
    }


    @Override
    public String toString() {
        return "MyObject{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
