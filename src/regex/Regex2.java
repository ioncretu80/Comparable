package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {

        String s1 = "ABCD ABCE ABCFABCGABCH";
        Pattern pattern1 = Pattern.compile("ABC");
        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "    " + matcher.group());

        }

        System.out.println();
        System.out.println("=================================");
        System.out.println("[abc]");
        String s2 = "OPABMNCD";

        Pattern pattern2 = Pattern.compile("[ABC]");

        Matcher matcher2 = pattern2.matcher(s2);
        while (matcher2.find()) {
            System.out.println("Position: " + matcher2.start() + "    " + matcher2.group());

        }


        System.out.println();
        System.out.println("=================================");

        String s3 = "ABDOPABFOP";
        System.out.println("String: " + s3);

        Pattern pattern3 = Pattern.compile("AB[C-F]OP");
        System.out.println("Regex: AB[C-F]OP");

        Matcher matcher3 = pattern3.matcher(s3);
        while (matcher3.find()) {
            System.out.println("Position: " + matcher3.start() + "    " + matcher3.group());

        }

        System.out.println();
        System.out.println("=================================");

        String s4 = "abcd abce abc5abcg6abchabcA";
        System.out.println("String: " + s4);

        Pattern pattern4 = Pattern.compile("abc[e-g4-7A-Z]");
        System.out.println("Regex: abc[e-g4-7]");

        Matcher matcher4 = pattern4.matcher(s4);
        while (matcher4.find()) {
            System.out.println("Position: " + matcher4.start() + "    " + matcher4.group());

        }

        System.out.println();
        System.out.println("=================================");

        String s5 = "abcd abce abc5abcg6abchabcA";
        System.out.println("String: " + s5);

        Pattern pattern5 = Pattern.compile("abc[^e-g4-7A-Z]");
        System.out.println("Regex: abc[^e-g4-7]");

        Matcher matcher5 = pattern5.matcher(s5);
        while (matcher5.find()) {
            System.out.println("Position: " + matcher5.start() + "    " + matcher5.group());

        }


        System.out.println();
        System.out.println("=================================");

        String s6 = "abcd abce abc5abcg6abchabcA";
        System.out.println("String: " + s6);

        Pattern pattern6 = Pattern.compile("abc(e|5)");
        System.out.println("Regex: abc(e|5)");

        Matcher matcher6 = pattern6.matcher(s6);
        while (matcher6.find()) {
            System.out.println("Position: " + matcher6.start() + "    " + matcher6.group());

        }


    }
}
