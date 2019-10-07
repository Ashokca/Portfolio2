
/**
 * Write a description of class Randomness here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*; 
import apcslib.*; 
import java.util.Random;
public class Randomness
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Randomness
     */
    public static void Randomness()
    { 
        Random rand = new Random(); 
        ConsoleIO keyboard = new ConsoleIO(); //using consoleIO
        int number = 0, use_guess = 0, response = 0; 
        use_guess = 0;
        number = rand.nextInt(100); //getting a random number
        do {  
          while(use_guess != -1) 
          {  
              use_guess = mean_guess(use_guess, number); //invoking a method that gets the user's guess
            }
            System.out.println("Would you like to play again with a new number?(1/0)"); 
            response = keyboard.readInt();  //asking if the user wants to play again
        } 
        while(response == 1); //do while to let the user repeat as much as they want to
        
    }

    public static int mean_guess(int use_guess, int number)
    {
        ConsoleIO keyboard = new ConsoleIO();
         
            while(use_guess != -1) 
            { 
                System.out.println("Enter in your guess from 1-100(press -1 to quit)");
                use_guess = keyboard.readInt();  //getting user input for their guess 
                if (use_guess != -1) 
                {
                if (use_guess > number) 
                    System.out.println("Too High!"); //printing too high if the user's guess is too high
                else 
                    if (use_guess < number) 
                       System.out.println("Too Low!"); //printing too low if the user's guess is too low
                       else 
                       {
                            System.out.println("You got it!"); //printing You got it if the user's guess is right
                            use_guess = -1; 
                        } 
                }
            } 
            return -1;
    }
}
