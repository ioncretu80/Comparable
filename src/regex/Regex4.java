package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {
    public static void main(String[] args) {
//        String s1 = "ABCABABDAbABABABABABAB";
//        Pattern pattern = Pattern.compile("(AB){2,3}");
//
//
//        String s1 = "ABCABABDABABABABABABABDABAB";
//        Pattern pattern = Pattern.compile("D(AB){2,}");
//

//        String s1 = "ABCABABDABABABABABABABDABABDACAB";
//        Pattern pattern = Pattern.compile("D(AB)?");
//
//        String s1 = "ABCABABDABABABABABABABDABABDACAB";
//        Pattern pattern = Pattern.compile("D(AB)*");

//        String s1 = "abcd abce abcfabcgabch";
//        Pattern pattern = Pattern.compile("\\Aabcd");
//
//        String s1 = "abcd abce abcfabcgabch";
//        Pattern pattern = Pattern.compile("bch\\Z");

        String s1 = "abcd abce abcfabcgabch c8";
        Pattern pattern = Pattern.compile("[abcd][efgh3-8]");


        Matcher matcher = pattern.matcher(s1);
        while (matcher.find()) {
            System.out.println("Position: " + matcher.start() + "  " + matcher.group());
        }

    }
}
