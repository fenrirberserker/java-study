package concepts.optional;

import java.util.Optional;

public class OptionalNull {

    public static void main(String[] args) {

        String value = null;

        //Optional o = (value==null)?Optional.empty():Optional.of(value);
        Optional o  = Optional.ofNullable(value);//the same
        System.out.println(o);
        Optional p = Optional.ofNullable(1);
        System.out.println(p);

    }
}
