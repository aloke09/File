package SimpleTextFile;

import java.io.*;
import java.util.*;

public class FileReaderAndBuffereader
{
    public static void main(String[] args) {
        String fileloc = "C:\\Users\\Aloke\\IdeaProjects\\File\\src\\main\\java\\SimpleTextFile\\simpletextfile.txt";
        ArrayList<String> result = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileloc))) {
            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(result);
    }
}
