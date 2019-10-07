import chn.util.*;
import java.util.Scanner; 
import java.util.*;
public class CountdownSong
{ // everything in Java is a class, we will learn more latter
    
    public static void countmain(String[] args)
    { // code blocks are in curly braces {}
        // initialise control variables for program  
        int repeat = 0;
        String name2;  
        do 
        {
        System.out.println("How many monkeys do you want jumping on the bed?"); 
     
        Scanner reader = new Scanner(System.in); 
         int countdown = reader.nextInt(); 
         //getting user inputed integer
        System.out.println("what is the doctor's name?"); 
        
        Scanner scanner = new Scanner(System.in);
                   // integrer variable assignment, statements end in semi colon
        String bedJumpers = "monkeys";     
        String doctor = scanner.next();// string of characters  
        System.out.println("What is the animal's name");
        String animal = scanner.next(); 
        //getting user inputted animal

        // prepare for countdown loop
        int i = countdown; 
        countdown = 0;
        String space = " ";
        while (i > -1) { // while is a control flow statement, observe blocks of code

   
                // messages print each time through loop,  println prints a line to console, plus sign (i + space...) concatonates
             
                System.out.println(i + space + "little" + space + animal + space + "jumping on the bed");
                System.out.println("One fell off and broke his head");
                System.out.println("Mama called doctor" + space +  doctor + space + "and doctor" + space + doctor + space + "said");
                System.out.println("no more" + space + animal + space + "jumping on the bed."); 
          //using + operator to add strings like doctor and animal
       i--;
    } 
    System.out.println("Do you want to go again?"); 
    System.out.println("1. Yes"); 
    System.out.println("0. No"); 
    repeat = reader.nextInt(); 
            // decrement i at end of loop
        // this is equivalent to i = i - 1, -- is a shorthand
            
        }     
        while(repeat != 0);
    } 
}