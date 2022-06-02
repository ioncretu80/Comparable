package work_with_files.nio;

import javax.crypto.spec.PSource;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class CopyFileTree {

    public static void main(String[] args) throws IOException {
        Path source = Paths.get("\\\\srvk3dc1\\redirectedfolders$\\i.cretu\\Desktop\\X");
        Path pathDestination = Paths.get("\\\\srvk3dc1\\redirectedfolders$\\i.cretu\\Desktop\\CopyHere");
        Files.walkFileTree(source, new MyFileVisitors2(source, pathDestination));
        System.out.println("Done!!");
    }


}

class MyFileVisitors2 extends SimpleFileVisitor<Path> {
    Path source;
    Path destination;


    public MyFileVisitors2(Path source, Path destination) {
        this.source = source;
        this.destination = destination;
    }


    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {

        Path newDestination = destination.resolve(source.relativize(dir));
        Files.copy(dir, newDestination, StandardCopyOption.REPLACE_EXISTING);

        return FileVisitResult.CONTINUE;
    }


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        Path newDestination = destination.resolve(source.relativize(file));
        Files.copy(file, newDestination, StandardCopyOption.REPLACE_EXISTING);
        return FileVisitResult.CONTINUE;
    }
}