package SimpleTextFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        String fileloc="C:\\Users\\Aloke\\IdeaProjects\\File\\src\\main\\java\\SimpleTextFile\\simpletextfile.txt";
        File f=new File(fileloc);
        ArrayList<String>result=new ArrayList<>();
        Scanner sc=new Scanner(f);
        while (sc.hasNext())
        {
            result.add(sc.next());
        }
        System.out.println(result);


    }
}
