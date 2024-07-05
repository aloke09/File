package CSVFile;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.util.List;

public class ReadCsv
{
    public static void main(String[] args)
    {
        CSVReader reader = null;
        try
        {
            reader = new CSVReader(new FileReader("C:\\Users\\Aloke\\Downloads\\price_total.csv"));
            String [] nextLine;
            while ((nextLine = reader.readNext()) != null)
            {
                for(String token : nextLine)
                {
                    System.out.print(token);
                }
                System.out.print("\n");
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}