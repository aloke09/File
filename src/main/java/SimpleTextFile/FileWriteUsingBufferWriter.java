package SimpleTextFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteUsingBufferWriter
{
    public static void main(String[] args) throws IOException {
        String content="write into file using buffer reader";
        String fileloc="C:\\Users\\Aloke\\IdeaProjects\\File\\src\\main\\java\\SimpleTextFile\\simpletextfile.txt";
        FileWriter fw=new FileWriter(fileloc);
        BufferedWriter bfw=new BufferedWriter(fw);
        bfw.write(content);
        bfw.close();

    }
}
