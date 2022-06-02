package work_with_files.nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesEx3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
//        Files.createFile(filePath);
//
//        String dialog = "-Privet\n-Privet\n-KAk u tebia dela?\n-Horosho. U tebia?\n-Toje horosho";
//        Files.write(filePath,dialog.getBytes());
//        System.out.println("Done!");

        List<String> list = Files.readAllLines(filePath);

        for (String s : list
        ) {
            System.out.println(s);
        }
    }
}
