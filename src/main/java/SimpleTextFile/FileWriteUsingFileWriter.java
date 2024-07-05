package SimpleTextFile;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteUsingFileWriter
{
    public static void main(String[] args) throws IOException {
        String content="Write into file using filewriter";
        String fileloc="C:\\Users\\Aloke\\IdeaProjects\\File\\src\\main\\java\\SimpleTextFile\\simpletextfile.txt";
        FileWriter fw=new FileWriter(fileloc);
        fw.write(content);
        fw.close();
    }
}
