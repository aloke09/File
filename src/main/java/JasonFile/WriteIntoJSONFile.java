package JasonFile;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;
public class WriteIntoJSONFile
{
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Aloke\\IdeaProjects\\File\\src\\main\\java\\JasonFile\\example.json";

        ObjectMapper objectMapper = new ObjectMapper();

        // Create a JSON object
        ObjectNode person = objectMapper.createObjectNode();
        person.put("name", "John Doe");
        person.put("age", 30);
        person.put("city", "New York");

        try {
            // Write JSON object to file
            objectMapper.writeValue(new File(filePath), person);

            // Read JSON file back to a JsonNode
            JsonNode rootNode = objectMapper.readTree(new File(filePath));

            // Print JSON content
            System.out.println(rootNode.toPrettyString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
