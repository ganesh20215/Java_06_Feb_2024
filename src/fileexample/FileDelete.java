package fileexample;

import java.io.File;

public class FileDelete {

    public static void main(String[] args) {

        File file = new File("E:\\classes\\Edso\\AutomationTesting\\Java\\Test730MorningBatchFile.txt");

        file.delete();

        System.out.println(file.getName());

    }
}
