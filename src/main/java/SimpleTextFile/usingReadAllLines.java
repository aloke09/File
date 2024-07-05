package SimpleTextFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class usingReadAllLines
{
    public static void main(String[] args) throws IOException {
        String fileloc="C:\\Users\\Aloke\\IdeaProjects\\File\\src\\main\\java\\SimpleTextFile\\simpletextfile.txt";
        List<String> result = Files.readAllLines(Paths.get(fileloc));
        System.out.println(result);
    }
}
