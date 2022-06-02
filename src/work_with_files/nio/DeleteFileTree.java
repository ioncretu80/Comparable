package work_with_files.nio;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DeleteFileTree {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("\\\\srvk3dc1\\redirectedfolders$\\i.cretu\\Desktop\\CopyHere");

        Files.walkFileTree(path, new MyFileVisitors3());

        System.out.println("Done!!");
    }


}

class MyFileVisitors3 extends SimpleFileVisitor<Path> {


    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        System.out.println("delete Directory " + dir.getFileName());
        Files.delete(dir);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("delete File " + file.getFileName());
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Vhod v directorii " + dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}