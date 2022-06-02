package regex;

public class RegexReplace {
    public static void main(String[] args) {
        String s1 = "Privet     moi drug!     Kak     idet     izuchenie Java?";
        System.out.println(s1);

        s1 = s1.replace("Java", "SQL");
        System.out.println(s1);

        s1 = s1.replaceAll(" {2,}", " ");
        System.out.println(s1);

        s1 = s1.replaceAll("\\bi\\w+", "4444");
        System.out.println(s1);

        s1 = s1.replaceFirst("\\b4{2,}\\b", "22");
        System.out.println(s1);

    }
}
