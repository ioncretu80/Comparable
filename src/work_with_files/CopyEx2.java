package work_with_files;

import java.io.*;

public class CopyEx2 {
    public static void main(String[] args) {


        try (
                FileInputStream inputStream = new FileInputStream("\\\\srvk3dc1\\redirectedfolders$\\i.cretu\\Desktop\\1.jpg");
                FileOutputStream outputStream = new FileOutputStream("1.jpg")

        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Done!");
    }
}
