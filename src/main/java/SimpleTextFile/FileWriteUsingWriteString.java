package SimpleTextFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileWriteUsingWriteString
{
    public static void main(String[] args) throws IOException {
        String s="This is an example to write into String using write string...";
        String fileloc="C:\\Users\\Aloke\\IdeaProjects\\File\\src\\main\\java\\SimpleTextFile\\simpletextfile.txt";
        Path filenameWithpath=Path.of(fileloc);
        Files.writeString(filenameWithpath,s);
        String fileContent=Files.readString(filenameWithpath);
        System.out.println(fileContent);
    }
}
