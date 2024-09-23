import java.util.*;

public class peerlearning5 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int numbers = s.nextInt();

        while(true) {

            if (numbers > 0) {

                for (int i = 0; i <= numbers; i++) {
                    System.out.println(i);
                }

                break;

            } else {
                System.out.print("Please try again: ");
                numbers = s.nextInt();
            }
        }
    }
}