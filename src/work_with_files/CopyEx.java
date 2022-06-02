package work_with_files;

import java.io.*;

public class CopyEx {
    public static void main(String[] args) {


        try (
                BufferedReader reader = new BufferedReader(new FileReader("test2.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("test3.txt"))

        ) {
//Var1
//            int character ;
//            while ((character= reader.read())!=-1){
//                writer.write(character);
//            }


            //Var2

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.write("\n");
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Done!");
    }
}
