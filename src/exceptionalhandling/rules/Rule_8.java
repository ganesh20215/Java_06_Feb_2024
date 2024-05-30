package exceptionalhandling.rules;

public class Rule_8 {

    public static void main(String[] args) {

        //we can define child class exception first then we can define parent class exception below.

        String[] array = {"Hello", "Java"};

        try {
            System.out.println(array[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }catch (Exception a){
            a.printStackTrace();
        }
    }
}
