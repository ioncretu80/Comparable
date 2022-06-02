package scaner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = null;
        Set<String> set = new TreeSet<>();


        try {
            scanner = new Scanner(new FileReader(new File("\\\\srvk3dc1\\redirectedfolders$\\i.cretu\\Desktop\\java\\test1.txt")));
            scanner.useDelimiter("\\W");
            while (scanner.hasNext()) {
                String s = scanner.next();
                set.add(s);
            }
            for (String word : set
            ) {
                System.out.println(word);
            }

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }


        } catch (FileNotFoundException e) {
            System.out.println("We have a problem");
        } finally {
            scanner.close();
        }

    }
}
