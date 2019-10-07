
import chn.util.*; 
/**
 * Write a description of class Drawingtool here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Faren
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Drawingtool
     */
    public static void farenmain()
    {
       ConsoleIO keyboard = new ConsoleIO(); //Initilizing consoleio
        int response, repeat; //initilizing variables
        double faren, cel; 
        do 
        {
        System.out.println("1. Do you want to convert from farenhieght to celsious"); //printing questions
        System.out.println("2.Do you want to convert from celsius");
        response = keyboard.readInt();  //getting user inputted integer
        
      
        switch (response) 
        { 
            case 1:  
                System.out.println("How much farenhieght"); 
                faren = keyboard.readDouble();  //getting user input for farenhieght
                cel = (5.0/9) * (faren - 32.0); //calculating celsius from the user inputted farenhieght
                System.out.println(cel);
                break; 
            case 2:  
                System.out.println("How much Celsius"); 
                cel = keyboard.readDouble(); //getting user input for celsius
                faren = (cel * 9/5.0) + 32;  //calculating farenhieght for the user inputted celsius
                System.out.println(faren);
                break; 
            default: 
                System.out.println("Not a valid number"); 
            }
        System.out.println("Would you like to repeat the program?");  //letting the user repeat the program with a do-while
        System.out.println("1. Yes"); 
        System.out.println("2. No");
        repeat = keyboard.readInt();  
    } 
    while(repeat == 1);
        
    }


    public static void sampleMethod(String[] args)
    {
    }
        
        
}   
    

