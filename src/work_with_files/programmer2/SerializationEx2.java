package work_with_files.programmer2;

import work_with_files.programmer1.Employee;

import java.io.*;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee bestemployee;

        try (
                ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("employee2.bin"));
        ) {
            bestemployee = (Employee) objectInputStream.readObject();
            System.out.println(bestemployee.toString());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}