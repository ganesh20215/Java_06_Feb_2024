package stringdemo;

public class StringWithMemoryAllocation {

    public static void main(String[] args) {

        //String Literal always store in a String Constant pool

        String name1 = "Anushaka";     //String Literal
        String name2 = "Anushaka";
        name1 = "Mohammad";          //Immutable

        System.out.println(name1 == name2);     //== symbol use for address comparison


/*        String name3 = "Edso Services";                         //SCP
        String name4 = "Edso Services";        //HP

        System.out.println(name3 == name4);
        System.out.println(name3.equals(name4));*/
    }
}
