package collection.map;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

    public static void main(String[] args) throws IOException {

        FileReader fileReader = new FileReader("E:\\classes\\Edso\\AutomationTesting\\Java\\test.properties");
        Properties properties = new Properties();
        properties.load(fileReader);

        System.out.println(properties.getProperty("Company"));
    }
}
