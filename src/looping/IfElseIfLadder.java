package looping;

public class IfElseIfLadder {

    public static void main(String[] args) {

//1 to 15 [Check for is number is divisible by 3 & 5]
// 1, 2, divided by 3, 4, divided by 5, divided by 3, 7, 8, divided by 3, divided by 5, 11, divided by 3, 13, 14, divided by 3 & 5


        int marks = 40;
        int practical = 10;

        if (marks <= 30){
            System.out.println("Candidate is passed.");
        } else if (practical <= 9) {
            System.out.println("candidate is passed");
        }else {
            System.out.println("candidate is failed");
        }
    }
}
