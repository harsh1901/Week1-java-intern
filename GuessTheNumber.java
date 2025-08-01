import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("\n\t\t\tWelcome to GuessTheNumber game!");
        System.out.println("You have to guess a number between 1 and 100. "
                + "You'll have limited choices based on the level you choose. Good Luck!");

        while (true) {
            System.out.println("\nEnter the difficulty level: ");
            System.out.println("1 for easy!\t2 for difficult!\t0 for ending the game!");
            System.out.print("Enter the number: ");
            int difficultyChoice = scanner.nextInt();

            int secretNumber = 1 + random.nextInt(100);
            int playerChoice;

            // Easy Mode
            if (difficultyChoice == 1) {
                System.out.println("\nYou have 10 choices for finding the secret number between 1 and 100.");
                int choicesLeft = 10;

                for (int i = 1; i <= 10; i++) {
                    System.out.print("\nEnter the number: ");
                    playerChoice = scanner.nextInt();

                    if (playerChoice == secretNumber) {
                        System.out.println("Well played! You won, " + playerChoice + " is the secret number");
                        System.out.println("\t\t\tThanks for playing....");
                        System.out.println("Play the game again with us!!\n");
                        break;
                    } else {
                        System.out.println("Nope, " + playerChoice + " is not the right number");
                        if (playerChoice > secretNumber) {
                            System.out.println("The secret number is smaller than the number you have chosen");
                        } else {
                            System.out.println("The secret number is greater than the number you have chosen");
                        }
                        choicesLeft--;
                        System.out.println(choicesLeft + " choices left.");
                        if (choicesLeft == 0) {
                            System.out.println(
                                    "You couldn't find the secret number, it was " + secretNumber + ", You lose!!");
                            System.out.println("Play the game again to win!!!\n");
                        }
                    }
                }

                // Difficult Mode
            } else if (difficultyChoice == 2) {
                System.out.println("\nYou have 5 choices for finding the secret number between 1 and 100.");
                int choicesLeft = 5;

                for (int i = 1; i <= 5; i++) {
                    System.out.print("\nEnter the number: ");
                    playerChoice = scanner.nextInt();

                    if (playerChoice == secretNumber) {
                        System.out.println("Well played! You won, " + playerChoice + " is the secret number");
                        System.out.println("\t\t\tThanks for playing....");
                        System.out.println("Play the game again with us!!\n");
                        break;
                    } else {
                        System.out.println("Nope, " + playerChoice + " is not the right number");
                        if (playerChoice > secretNumber) {
                            System.out.println("The secret number is smaller than the number you have chosen");
                        } else {
                            System.out.println("The secret number is greater than the number you have chosen");
                        }
                        choicesLeft--;
                        System.out.println(choicesLeft + " choices left.");
                        if (choicesLeft == 0) {
                            System.out.println(
                                    "You couldn't find the secret number, it was " + secretNumber + ", You lose!!");
                            System.out.println("Play the game again to win!!!\n");
                        }
                    }
                }

                // Exit Game
            } else if (difficultyChoice == 0) {
                System.out.println("Thanks for playing!");
                break;
            } else {
                System.out.println("Wrong choice, Enter valid choice to play the game! (0,1,2)");
            }
        }

        scanner.close();
    }
}
