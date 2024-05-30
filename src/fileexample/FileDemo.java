package fileexample;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) throws IOException {

        File file = new File("E:\\classes\\Edso\\AutomationTesting\\Java\\Test730MorningBatchFile.txt");

        file.createNewFile();

        System.out.println(file.canRead());     //true
        System.out.println(file.canWrite());    //true
        System.out.println(file.isAbsolute());  //true
        System.out.println(file.isDirectory()); //false
        System.out.println(file.isFile());      //true
        System.out.println(file.getName());     //Test730MorningBatchFile
        System.out.println(file.getParent());   //E:\classes\Edso\AutomationTesting\Java\
        System.out.println(file.toPath());
        System.out.println(file.toURI());
    }
}
