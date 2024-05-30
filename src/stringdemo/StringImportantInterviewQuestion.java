package stringdemo;

public class StringImportantInterviewQuestion {

    public static void main(String[] args) {

        String name1 = "Shivam";                        //SCP
        String name2 = new String("Shivam");      //HP

        System.out.println(name1 == name2);     //false
        System.out.println(name1.equals(name2));    //true
    }
}
