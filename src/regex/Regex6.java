package regex;

import java.util.regex.Pattern;

public class Regex6 {
    void checkIP(String ip) {
        String regex = "((25[0-5] | 2[0-4]\\d | [01]?\\d?\\d)(\\.){3} (25[0-5] | 2[0-4]?\\d\\d))";
        //    250-255
        //    25[0-5]  | 2[0-4]\d |  [01]?\d?\

        System.out.println(ip + " is Ok? " + Pattern.matches(regex, ip));
    }

    public static void main(String[] args) {

        String ip1 = "255.255.192.99";
        String ip2 = "255.262.192.99";
        Regex6 r6 = new Regex6();
        r6.checkIP(ip1);
        r6.checkIP(ip2);

    }
}
