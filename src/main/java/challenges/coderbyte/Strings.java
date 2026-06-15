package challenges.coderbyte;

public class Strings {

    public static void main(String[] args) {

        Stringchallenge("mundo world hello uno dos mil ochomil");

    }

    public static void Stringchallenge(String sen){

        String[] array = sen.split(" ");

        String longestString = "";
        int max = 0;

        for (String str : array) {
            if (str.length() > max) {
                max = str.length();
                longestString = str;
            }
        }

        System.out.println(array.length);
        System.out.println("longest "+longestString);

    }
}
