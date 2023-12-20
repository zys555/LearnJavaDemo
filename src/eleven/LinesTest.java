package eleven;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class LinesTest {
    public static void main(String[] args)throws Exception{
        File file = new File("d:" + File.separator + "1.txt");
        BufferedReader in = new BufferedReader(new FileReader(file));
        Stream<String> lines = in.lines();
        lines.forEach((L) ->System.out.println(L));
        in.close();
    }
}
