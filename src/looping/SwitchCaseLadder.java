package looping;

public class SwitchCaseLadder {

    public static void main(String[] args) {

        String name1 = "ANUSHKA";
        String name2 = "anushka";
        String name3 = "Anushka";

        String day = "Test";

        switch (day){
            case "Monday":
                System.out.println("Monday is very energetic day");
                break;
            case "Tuesday":
                System.out.println("Tuesday is very beutiful day");
                break;
            case "Wednesday":
                System.out.println("Wednesday is very colorful day");
                break;
            case "Thursday":
                System.out.println("Thursday is very silent day");
                break;
            case "Friday":
                System.out.println("Friday is very Amazing day");
                break;
            case "Saturday":
                System.out.println("Saturday is very Party day");
                break;
            default:
                System.out.println("Please select correct day");
                break;
        }
    }
}
