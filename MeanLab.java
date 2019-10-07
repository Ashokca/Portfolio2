import chn.util.*; 
import apcslib.*; 
import java.util.Random;
/**
 * Write a description of class MeanLab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MeanLab
{
    // instance variables - replace the example below with your own
    private int x; 


    /**
     * Constructor for objects of class MeanLab
     */
    public static void MeanLab()
    {
        // initialise instance variables
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void main_mean()
    { 
       int x, z, rand_num;  
       float mean = 0;
       Random rand = new Random(); 
       z = rand.nextInt(50); //getting a random number to see how many values willbe in the array
       int[] intArray = new int[z]; 
       for(x = 0; x < z; x++)  //traversing through the array
       { 
          rand_num = rand.nextInt(50); 
          intArray[x] = rand_num; //adding a random number to the array 
          System.out.print(intArray[x] + " "); //printing out the random number
       } 
       System.out.println(); //making a new line
       mean = mean(intArray, z);  
       System.out.println("The mean is" + " " + mean);
    } 
    public static float mean(int array[], int rand_num) 
    { 
        int x; 
        float mean = 0, total = 0;
        for (x = 0; x < rand_num; x++) //adding up all of the values in the array
        { 
            total += array[x]; 
        } 
        mean = total/rand_num; //doing the operation to find the mean
        return mean;
    }
}
