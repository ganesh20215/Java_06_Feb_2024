package fileexample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {

    public static void main(String[] args) throws IOException {

        //File file = new File("E:\\classes\\Edso\\AutomationTesting\\Java\\Test730MorningBatchFile.txt");

        FileWriter fw = new FileWriter("E:\\classes\\Edso\\AutomationTesting\\Java\\Test730MorningBatchFile.txt");

        fw.write("Hello Everyone... Good Morning, How Are you??");

        fw.flush();

        fw.close();
    }
}
