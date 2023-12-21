package eleven;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class TestWalk {
    public static void main(String[] args)throws IOException{
        File file = new File("./src");
        Path path = file.toPath();
        Stream<Path> filedata = Files.walk(path,Integer.MAX_VALUE,FileVisitOption.FOLLOW_LINKS);
        filedata.forEach((p)->System.out.println(p.getFileName()));
        filedata.close();
    }
}
