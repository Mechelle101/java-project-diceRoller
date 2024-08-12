
import java.util.Random;

/**
 @author mechellepresnell
 The Die class represents a single six-sided die.
 It has an instance variable value to store the current face value of the die.
 The constructor Die() initializes the value to zero.
 The roll() method simulates rolling the die by generating 
 a random number between 1 and 6 (inclusive) using Random class.
 The getValue() method retrieves the current face value of the die.
 */
public class Die {
    
    private int value;

    //constructor that sets the initial value of the die to zero.
    public Die () {
        this.value = 0;    
    }
    
    //method to simulate rolling the die and 
    public void roll() {
        Random rand = new Random();
        this.value = rand.nextInt(6) + 1;
    }
    
    //method to get the current value of the die
    public int getValue () {
        return this.value;
    }
    
}
