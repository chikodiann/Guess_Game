import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //firstly ensure game can restart by including a boolean
        boolean replay = true;
        // if boolean condition is true, game should restart, else game should terminate
        while(replay == true) {
            // promt computer to pick a number
            System.out.println("Pick a random number between 1 and 5");
            //streamline choices to 1-5
            int computerNumber = (int) (Math.random() * 6);
            // user should be able to input number
            Scanner input = new Scanner(System.in);
            int userNumber = Integer.parseInt(input.nextLine());
            //print computer choice and user choice
            System.out.println("computer picked " + computerNumber + " while you picked " + userNumber);
            // announce win or loss
            if (computerNumber == userNumber) {
                System.out.println("Congrats, you won");
            } else if (computerNumber != userNumber) {
                System.out.println("Game over, you lost");

            }
            //give user option to restart or end game
            System.out.println("Enter 1 to play again or enter 2 to quit");

            int userNumber1 = input.nextInt();
            if (userNumber1 == 1) {
                replay = true;
            } else if (userNumber1 == 2) {
                replay = false;
            }
        }
    }
}
