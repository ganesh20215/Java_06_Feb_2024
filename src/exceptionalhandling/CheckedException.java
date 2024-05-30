package exceptionalhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

    public static void main(String[] args) {

        //Checked Exception
        try {
            FileReader file = new FileReader("E:\\classes\\Edso\\AutomationTesting\\Java\\Exception Handling.pptx");
        }catch (FileNotFoundException f){
            f.printStackTrace();
        }

    }
}
