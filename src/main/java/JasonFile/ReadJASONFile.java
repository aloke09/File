package JasonFile;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ReadJASONFile
{
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            JsonNode rootNode = objectMapper
                    .readTree(new File("C:\\Users\\Aloke\\Downloads\\dwsample1-json.json"));
            System.out.println(rootNode.toPrettyString());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
