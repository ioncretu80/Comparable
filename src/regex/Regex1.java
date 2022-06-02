package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
        String s = "Ivanov Vasilii, Rusia, Moskow, Lenin street, 51, Flat 48, email:vivanov@mail.ru, Postcode AA99, Phone Number: +123456789;" +
                "Petrova Maria, Rusia, Perm, Mira street, 21, Flat 22, email:mpetrova@mail.ru, Postcode 225588, Phone Number: +12354548789;" +
                "Cuck Noris, Rusia, New orleano, Test street, 53, Flat 49, email:nchuck@mail.com, Postcode 85857, Phone Number: +6666498722;";


        //   Pattern pattern = Pattern.compile("\\w+");
        //   Pattern pattern = Pattern.compile("\\b\\d{2}\\b"); //se verifica granita
        Pattern pattern = Pattern.compile("\\+\\d{9}"); //se verifica granita
        Pattern mailPatern = Pattern.compile("\\w+@\\w+\\.(ru|com)");


        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        Matcher matcher_mail = mailPatern.matcher(s);
        while (matcher_mail.find()) {
            System.out.println(matcher_mail.group());
        }


        String s1 = "Anul   acesta am cumparat casa   !";
        Pattern s_Pattern = Pattern.compile("\\w\\s+\\w");  //[\t\n\r\f]
        Matcher s_matcher = s_Pattern.matcher(s1);
        while (s_matcher.find()) {
            System.out.println(s_matcher.group());
        }


    }
}
