import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean replay = true;
        while(replay == true) {
            System.out.println("Pick a random number between 1 and 5");
            int computerNumber = (int) (Math.random() * 6);
            Scanner input = new Scanner(System.in);
            int userNumber = Integer.parseInt(input.nextLine());
            System.out.println("computer picked " + computerNumber + " while you picked " + userNumber);

            if (computerNumber == userNumber) {
                System.out.println("Congrats, you won");
            } else if (computerNumber != userNumber) {
                System.out.println("Game over, you lost");

            }
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
