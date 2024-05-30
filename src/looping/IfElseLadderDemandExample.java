package looping;

public class IfElseLadderDemandExample {

    public static void main(String[] args) {

        int cetMarks = 90;

        if (cetMarks >= 185) {
            System.out.println("He is eligible for MBBS");
        } else if (cetMarks >= 170) {
            System.out.println("He/She should be eligible for IIT && MBBS");
        } else if (cetMarks >= 140 && cetMarks <= 170) {
            System.out.println("He/She should be eligible for Engineering");
        } else if (cetMarks >= 100 && cetMarks <= 140) {
            System.out.println("He/she should be eligible for pharmacy");
        } else {
            System.out.println("Candidate is eligible for BSC");
        }
    }
}
