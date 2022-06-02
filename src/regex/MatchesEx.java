package regex;

import java.util.Arrays;

public class MatchesEx {
    public static void main(String[] args) {
        String s = "Ivanov Vasilii, Rusia, Moskow, Lenin street, 51, Flat 48, email:vivanov@mail.ru, Postcode AA99, Phone Number: +123456789;" +
                "Petrova Maria, Rusia, Perm, Mira street, 21, Flat 22, email:mpetrova@mail.ru, Postcode 225588, Phone Number: +12354548789;" +
                "Chuck Noris, Rusia, New orleano, Test street, 53, Flat 49, email:nchuck@mail.com, Postcode 85857, Phone Number: +6666498722;";


        String s2 = "chuck@mail.com";

        boolean result = s2.matches("\\w+@\\w+\\.(com|ru)");
        System.out.println(result);

        String[] array = s.split(" ");
        System.out.println(Arrays.toString(array));


    }
}
