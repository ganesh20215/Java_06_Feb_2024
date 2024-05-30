package exceptionalhandling.rules;

public class ThrowsKeyword {
    public static void marriageAge(int age) throws Exception{

    if (age >= 18) {
        System.out.println("Candidate is eligible for Marriage");
    } else {
        throw new Exception("User isn't eligible for Marriage");
    }
}

    public static void main(String[] args) throws Exception {
        marriageAge(17);
    }
}
