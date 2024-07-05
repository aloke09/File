package SimpleTextFile;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UsingFileReader
{
    public static void main(String[] args) throws IOException {
        String fileloc="C:\\Users\\Aloke\\IdeaProjects\\File\\src\\main\\java\\SimpleTextFile\\simpletextfile.txt";
        FileReader f=new FileReader(fileloc);
        ArrayList<String> result=new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        while (f.ready()) {
            char c = (char) f.read();
            if (c == '\n') {
                result.add(sb.toString());
                sb = new StringBuilder();
            } else {
                sb.append(c);
            }
        }
        if (!sb.isEmpty()) {
            result.add(sb.toString());
        }
        System.out.println(result);
    }
}
