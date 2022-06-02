package work_with_files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) throws IOException {
        String luceafarul = "A fost odată ca-n poveşti,\n" +
                "A fost ca niciodată.\n" +
                "Din rude mari împărăteşti,\n" +
                "O prea frumoasă fată.\n";


        String s = "Privet";

        FileWriter writer = null;

        try {
            writer = new FileWriter("test2.txt", true);

            //Varianta 1
//            for (int i = 0; i < luceafarul.length(); i++) {
//                writer.write(luceafarul.charAt(i));
//            }

            //Varianta 2

            //  writer.write(luceafarul);
            writer.write(s);

            System.out.println("DONE!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            writer.close();
        }


    }
}
