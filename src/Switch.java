import java.util.Scanner;
public class Switch {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);
        int numDays = scan.nextInt();
        String monthName;
        switch (numDays) {
            case 30:  monthName = "September April June November";
                break;
            case 31:  monthName = "January, March, May, July, August, October, and December";
                break;
            case 28:  monthName = "February";
                break;
            default: monthName = "No month has exactly " + numDays + " days";
                break;
        }
        System.out.println(monthName);
    }
}
