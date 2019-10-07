import chn.util.*; 
import apcslib.*; 
import java.util.Random;
/**
 * Write a description of class RandomDice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomDice
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class RandomDice
     */
    public static void RandomDice()
    {
        // initialise instance variables
        ConsoleIO keyboard = new ConsoleIO(); //using ConsoleIO
        int dice = 0, player_1 = 0, x = 0, cpu = 0, round_counter = 1, response = 0;
        int player_win = 0, cpu_win= 0;
        do //do-while to let the user repeat as many times as they want
        {
         player_1 = 0; 
         cpu = 0;   
        System.out.println("Begin Round" + " " + round_counter); //printing the round number
        while (dice <= 0) 
        {
        System.out.println("How many dice would you like to roll?");
        dice = keyboard.readInt(); //getting user input for how many dice the user wants to roll
    } 
    Random rand = new Random(); 
    for (x = 1; x <= dice; x++) 
    { 
        player_1 += rand.nextInt(6); //adding to player_1's value based on how many dice the user wanted
        cpu += rand.nextInt(6); //adding to cpu's value based on how many dice the user wanted
    }
    System.out.println("The amount you have was" + " " + player_1); //printing player_1's value
    System.out.println("The amount the cpu has was" + " " + cpu); //printing cpu's value
    if (player_1 > cpu) 
    { 
        System.out.println("You win!"); //printing out you win if the user had a higher value than the cpu
        player_win++; //adding to player_win if cpu's value was lower than player_1's
    } 
    if (cpu > player_1) 
    { 
        System.out.println("The Cpu Wins!");  //printing out the cpu wins if the user had a lower value than the cpu
        cpu_win++; //adding to cpu_win if cpu's value was higher than player_1's
    } 
    System.out.println("Would you like to begin another round?[1/0]");
    response = keyboard.readInt();  //asking the user if they want to begin another round
    round_counter++; //incrementing round_counter to show that it is a different round
}
 while(response != 0); //while statement for do-while
       if (player_win > cpu_win) 
       {
           System.out.println("You had more wins, therefore you are the winner!"); //printing out that the user won if they had more wins than the cpu
       } 
       else 
        if (cpu_win > player_win) 
        { 
            System.out.println("The cpu had more wins, therefore the cpu is the winner!"); //printing out that the cpu won if they had more wins than the player
        } 
        else 
         { 
             System.out.println("You and the cpu had the same amount of points, therefore it is a tie!"); //printing out that it is a tie if player_win and cpu_win are equal
         }
    } 
}

