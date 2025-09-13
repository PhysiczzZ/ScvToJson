import java.io.FileWriter;
import java.io.IOException;

public class XmlGenerator {

    public static void generateXml(String fileName) {
        String xmlContent = "<staff>\n" +
                "    <employee>\n" +
                "        <id>1</id>\n" +
                "        <firstName>John</firstName>\n" +
                "        <lastName>Smith</lastName>\n" +
                "        <country>USA</country>\n" +
                "        <age>25</age>\n" +
                "    </employee>\n" +
                "    <employee>\n" +
                "        <id>2</id>\n" +
                "        <firstName>Inav</firstName>\n" +
                "        <lastName>Petrov</lastName>\n" +
                "        <country>RU</country>\n" +
                "        <age>23</age>\n" +
                "    </employee>\n" +
                "</staff>";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(xmlContent);
            System.out.println("XML файл успешно создан: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
