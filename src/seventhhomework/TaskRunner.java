package seventhhomework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class TaskRunner {

    public static void main(String[] args) throws IOException {
        File file1 = Path.of("src", "seventhhomework", "items-price.csv").toFile();
        File file2 = Path.of("src", "seventhhomework", "items-name.csv").toFile();
        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));
        BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
        BufferedWriter writer = new BufferedWriter(new FileWriter("src/seventhhomework/result.csv"));
        writer.write("ID,NAME,DESCRIPTION,PRICE" + "\n");
        bufferedReader1.readLine();
        bufferedReader2.readLine();
        Map<String, String> prices = new HashMap<>();
        String currentLine;
        while ((currentLine = bufferedReader1.readLine()) != null) {
            String[] strings1 = currentLine.split(",");
            prices.put(strings1[0], strings1[1]);
        }
        while ((currentLine = bufferedReader2.readLine()) != null) {
            String[] strings2 = currentLine.split(",");
            String id = strings2[0];
            String name = strings2[1];
            String description = strings2[2];
            String price = prices.get(id);

            writer.write(id + "," + name + "," + description + "," + price + "\n");
        }
        prices.entrySet().forEach(System.out::println);
        writer.close();
    }
}
