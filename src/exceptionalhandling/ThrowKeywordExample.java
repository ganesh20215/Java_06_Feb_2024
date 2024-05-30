package exceptionalhandling;

public class ThrowKeywordExample {
    public static void votingForElection(int age) {

        if (age >= 18) {
            System.out.println("Candidate is eligible for voting");
        } else {
            throw new RuntimeException("Use isn't eligible for voting");
        }
    }

    public static void main(String[] args) {
        votingForElection(17);
    }
}
