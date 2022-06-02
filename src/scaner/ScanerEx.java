package scaner;

import java.util.Scanner;

public class ScanerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Vedite chislo");
//        int i = scanner.nextInt();
//        System.out.println("Vedennoe chislo "+ i);


//        System.out.println("Napishite 2 chisla");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//
//        System.out.println("Chastnoe = "+x/y);
//        System.out.println("Ostatok = "+x%y);


//        System.out.println("Napishite paru slov");
//        String s = scanner.nextLine();
//        System.out.println("Va napisali: "+s);


//        System.out.println("Napishite stroku");
//        String s = scanner.next();
//        System.out.println("Va napisali: "+s);


//        System.out.println("Vedite drobnoe chislo");
//        double d = scanner.nextDouble();
//        System.out.println("Va napisali: "+ d);

//        Scanner scanner1 = new Scanner("Privet moi drug");
//        System.out.println(scanner1.next());

        Scanner scanner1 = new Scanner("Privet moi drug\nKak pojivaesh?\nChto horoshego?");
//        System.out.println(scanner1.nextLine());
//        System.out.println(scanner1.nextLine());
//        System.out.println(scanner1.nextLine());

        while (scanner1.hasNextLine()) {
            System.out.println(scanner1.nextLine());
        }

        Scanner scanner2 = new Scanner("Privet moi drug\nKak pojivaesh?\nChto horoshego?");
        System.out.println(scanner2.next().charAt(2));


    }
}
