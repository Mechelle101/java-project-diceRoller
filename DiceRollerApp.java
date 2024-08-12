
import java.util.Scanner;

/**
 * @author mechellepresnell
 * Project using classes to roll a 6 sided dice
 * a simple console interface for the user to roll the dice. 
 * It uses a do-while loop to continue rolling as long as 
 * the user enters 'y' or 'Y'.

 */
public class DiceRollerApp {

    public static void main(String[] args) {
        //enter point of the program
        System.out.println("Welcome to the dice roller app.");
        
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            //Create a new Dice instance
            Dice dice = new Dice();

            //Roll the dice and print the results
            dice.roll();
            dice.printRoll();

            //Ask the user if they want to roll again
            System.out.print("Roll again? (y/n): ");
            input = sc.nextLine();

            // Continue only if the user enters "y" or "Y"
        } while (input.equalsIgnoreCase("y"));
    }
}














/*
How Everything Works Together:

Die and Dice Objects:
    The Die class encapsulates the behavior of a single die.
    The Dice class contains two instances of the Die class, 
    representing a pair of dice.

Rolling the Dice:
    The Dice class's roll method is responsible for rolling both dice. 
    It, in turn, calls the roll method of each individual die.

Printing Results:
    The printRoll method of the Dice class prints the face values of 
    both dice, their sum, and any special messages for certain combinations.

User Interaction:
    The Main class handles user input and controls the flow of the program.
    It prompts the user to roll again after each iteration of the do-while loop.

Randomization:
    The randomization of the dice values is handled in the 
    Die class's roll method, using the Random class.

Special Messages:
    Special messages for craps, snake eyes, and box cars are displayed 
    in the printRoll method of the Dice class.

The classes work together to create a simple dice rolling application 
that allows the user to roll the dice and see the results, 
with additional messages for specific combinations. 
The program continues to prompt the user to roll again 
until they choose to exit.

*/
