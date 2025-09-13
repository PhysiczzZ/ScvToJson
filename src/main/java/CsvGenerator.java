import java.io.FileWriter;
import java.io.IOException;

public class CsvGenerator {

    public static void generateCsv(String fileName) {
        String[] lines = {
                "1,John,Smith,USA,25",
                "2,Inav,Petrov,RU,23"
        };

        try (FileWriter writer = new FileWriter(fileName)) {
            for (String line : lines) {
                writer.write(line + System.lineSeparator());
            }
            System.out.println("CSV файл успешно создан: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
