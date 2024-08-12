
/**
 * @author mechellepresnell
 The Dice class represents a pair of dice.
 It contains two instances of the Die class (die1 and die2).
 The constructor Dice() instantiates the two dice objects.
 Methods like getDie1Value(), getDie2Value(), and getSum() 
 are provided to retrieve values of individual dice and their sum.
 The roll() method rolls both dice.
 The printRoll() method prints the results of the roll, 
 including special messages for specific combinations.
 */
public class Dice {

    private Die die1;
    private Die die2;

    public Dice() {
        this.die1 = new Die();
        this.die2 = new Die();
    }

    public int getDie1Value() {
        return this.die1.getValue();
    }

    public int getDie2Value() {
        return this.die2.getValue();
    }

    public int getSum() {
        return getDie1Value() + getDie2Value();
    }

    public void roll() {
        die1.roll();
        die2.roll();
    }

    public void printRoll() {
        System.out.println("Die 1: " + getDie1Value());
        System.out.println("Die 2: " + getDie2Value());
        System.out.println("Total: " + getSum());

        // Display special messages
        if (getSum() == 7) {
            System.out.println("Craps! Sum is 7.");
        } else if (getDie1Value() == 1 && getDie2Value() == 1) {
            System.out.println("Snake Eyes! Double 1's.");
        } else if (getDie1Value() == 6 && getDie2Value() == 6) {
            System.out.println("Box Cars! Double 6's.");
        }
    }
}
