package work_with_files.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Map;

public class PathAndFilesEx2 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("\\\\srvk3dc1\\redirectedfolders$\\i.cretu\\Desktop\\M");
        Path directoryBPath = Paths.get("\\\\srvk3dc1\\redirectedfolders$\\i.cretu\\Desktop\\B");


        //   Files.copy(filePath, directoryPath.resolve(filePath), StandardCopyOption.REPLACE_EXISTING);
        // Files.copy(filePath, directoryPath.resolve("test16.txt"));

        // copy B in M
        //   Files.copy(directoryBPath, directoryPath.resolve("B"));

        //move
        //    Files.move(filePath, directoryPath.resolve("test15.txt"));
        //   Files.move(Paths.get("test10.txt"), Paths.get("test11.txt"));

        //delete()
        //  Files.delete(Paths.get("test5.txt"));


        Files.delete(directoryPath);

        System.out.println("Done!");


    }
}
