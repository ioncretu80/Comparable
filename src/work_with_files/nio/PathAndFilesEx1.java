package work_with_files.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class PathAndFilesEx1 {

    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("\\\\srvk3dc1\\redirectedfolders$\\i.cretu\\Desktop\\M");

        System.out.println("-------getFileName()----------------------");
        System.out.println("filePath.getFileName() " + filePath.getFileName());
        System.out.println("directoryPath.getFileName() " + directoryPath.getFileName());

        System.out.println();
        System.out.println("-------getParent()----------------------");
        System.out.println("filePath.getParent() " + filePath.getParent());
        System.out.println("directoryPath.getParent() " + directoryPath.getParent());


        System.out.println();
        System.out.println("-------getRoot()----------------------");
        System.out.println("filePath.getRoot() " + filePath.getRoot());
        System.out.println("directoryPath.getRoot() " + directoryPath.getRoot());

        System.out.println();
        System.out.println("-------isAbsolute()----------------------");
        System.out.println("filePath.isAbsolute() " + filePath.isAbsolute());
        System.out.println("directoryPath.isAbsolute() " + directoryPath.isAbsolute());

        System.out.println();
        System.out.println("-------toAbsolutePath()----------------------");
        System.out.println("filePath.toAbsolutePath() " + filePath.toAbsolutePath());
        System.out.println("directoryPath.toAbsolutePath() " + directoryPath.toAbsolutePath());


        System.out.println();
        System.out.println("-------getParent de la toAbsolutePath()----------------------");
        System.out.println("filePath.getParent() " + filePath.toAbsolutePath().getParent());
        System.out.println("directoryPath.getParent() " + directoryPath.toAbsolutePath().getParent());


        System.out.println();
        System.out.println("-------getRoot de la toAbsolutePath()----------------------");
        System.out.println("filePath.getRoot() " + filePath.toAbsolutePath().getRoot());
        System.out.println("directoryPath.getRoot() " + directoryPath.toAbsolutePath().getRoot());


        System.out.println();
        System.out.println("-------resolve()----------------------");
        System.out.println("directoryPath.resolve(filePath) " + directoryPath.resolve(filePath));

        System.out.println();
        Path anotherPath = Paths.get("\\\\srvk3dc1\\redirectedfolders$\\i.cretu\\Desktop\\M\\N\\Z\\test20.txt");
        System.out.println("-------relativize()----------------------");
        System.out.println("directoryPath.relativize(anotherPathth) " + directoryPath.relativize(anotherPath));


        if (!Files.exists(filePath)) {

            Files.createFile(filePath);
        }

        if (!Files.exists(directoryPath)) {

            Files.createDirectory(directoryPath);
        }

        //control
        System.out.println();
        System.out.println("-------createFile(), createDirectory()----------------------");
        System.out.println(Files.exists(filePath));
        System.out.println(Files.exists(directoryPath));

        System.out.println();
        System.out.println("-------isReadable()----------------------");
        System.out.println(Files.isReadable(filePath));
        System.out.println(Files.isReadable(directoryPath));

        System.out.println();
        System.out.println("-------isWritable()----------------------");
        System.out.println(Files.isWritable(filePath));
        System.out.println(Files.isWritable(directoryPath));

        System.out.println();
        System.out.println("-------isExecutable()----------------------");
        System.out.println(Files.isExecutable(filePath));
        System.out.println(Files.isExecutable(directoryPath));

        System.out.println();
        System.out.println("-------isSameFile()----------------------");
        Path filePath2 = Paths.get("C:\\javas\\Comparable\\test15.txt");
        System.out.println(Files.isSameFile(filePath, filePath2));


        System.out.println();
        System.out.println("-------size()----------------------");
        System.out.println(Files.size(filePath));

        System.out.println();
        System.out.println("-------getAttribute()----------------------");
        System.out.println(Files.getAttribute(filePath, "creationTime"));
        System.out.println(Files.getAttribute(filePath, "size"));

        System.out.println();
        System.out.println("-------readAttribute()----------------------");
        Map<String, Object> attributes = Files.readAttributes(filePath, "*");

        for (Map.Entry<String, Object> entry : attributes.entrySet()
        ) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
