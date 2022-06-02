package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex3 {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("=================================");

        String s1 = "abcd abce abc5abcg6abchabcA abc\n abc.";
        System.out.println("String: " + s1);

        Pattern pattern1 = Pattern.compile("abc.");
        System.out.println("Regex: abc(e|5)");

        Matcher matcher1 = pattern1.matcher(s1);
        while (matcher1.find()) {
            System.out.println("Position: " + matcher1.start() + "    " + matcher1.group());
        }

        //inceputul liniei
        System.out.println();
        System.out.println("=================================");
        String s2 = "abcd abce abc5abcg6abchabcA abc\n abc.";
        System.out.println("String: " + s2);

        Pattern pattern2 = Pattern.compile("^abc");
        System.out.println("Regex: ^abc");

        Matcher matcher2 = pattern2.matcher(s2);
        while (matcher2.find()) {
            System.out.println("Position: " + matcher2.start() + "    " + matcher2.group());
        }


        //sfirsitul liniei
        System.out.println();
        System.out.println("=================================");
        String s3 = "abcd abce abc5abcg6abchabcA abc\n abc.";
        System.out.println("String: " + s3);

        Pattern pattern3 = Pattern.compile("abc.$");
        System.out.println("Regex: abc.$");

        Matcher matcher3 = pattern3.matcher(s3);
        while (matcher3.find()) {
            System.out.println("Position: " + matcher3.start() + "    " + matcher3.group());
        }


        //metasimboluri /d /D
        System.out.println();
        System.out.println("=================================");
        String s4 = "abcd abce abc5abcg6abchabcA abc\n abc.";
        System.out.println("String: " + s4);

        Pattern pattern4 = Pattern.compile("\\d");
        System.out.println("Regex: \\d");      //[1-9]

        Matcher matcher4 = pattern4.matcher(s4);
        while (matcher4.find()) {
            System.out.println("Position: " + matcher4.start() + "    " + matcher4.group());
        }


        //metasimboluri /w /W
        System.out.println();
        System.out.println("=================================");
        String s5 = "abcd    abce   abc5abcg6abchabcA    abc\n abc.";
        System.out.println("String: " + s5);

        Pattern pattern5 = Pattern.compile("\\w");       //[A-Za-z0-9_]            \\W = [^A-Za-z0-9_]
        System.out.println("Regex: \\w");      //[1-9]

        Matcher matcher5 = pattern5.matcher(s5);
        while (matcher5.find()) {
            System.out.println("Position: " + matcher5.start() + "    " + matcher5.group());
        }


        //metasimboluri /w /W
        System.out.println();
        System.out.println("=================================");
        String s6 = "poka abc Zaur dom abstractionism";
        System.out.println("String: " + s6);

        Pattern pattern6 = Pattern.compile("\\w{4}");       //[A-Za-z0-9_]            \\W = [^A-Za-z0-9_]
        System.out.println("Regex: \\w");      //[1-9]

        Matcher matcher6 = pattern6.matcher(s6);
        while (matcher6.find()) {
            System.out.println("Position: " + matcher6.start() + "    " + matcher6.group());
        }


    }
}
