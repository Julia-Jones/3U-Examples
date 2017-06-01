
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jonej9442
 */
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating scanner 
        Scanner input = new Scanner(System.in);

        //create a list of 5 numbers
        //[] = list of doubles 
        //[5] = 5 numbers so 5 spots available
        double[] marks = new double[5];

        //scan in some marks
        System.out.println("Please enter in 5 marks.");

        //stupid way to do this

        //puts number in position 0
        //marks[0] = input.nextDouble();
        //second numb
        //marks[1] = input.nextDouble();

        //better way to do this
        //marks.length tells u how many letters
        for (int i = 0; i < marks.length; i++) {
            //i is counting 
            marks[i] = input.nextDouble();
        }
        //use a for loop to determine sum
        //start with an accumulator
        //just keeps adding numbers together
        double sum = 0;
        //for loop to go through each number
        for (int i = 0; i < marks.length; i++) {
            //add whatever number in on to sum 
            sum = sum + marks[i];
        }
        System.out.println(" ");
        System.out.println("The sum is " + sum);

        double avg = sum / marks.length;
        // finding average
        System.out.println(" ");
        System.out.println("The average is " + avg);

        // print out the numbers again
        for (int i = 0; i < marks.length; i++) {
            System.out.println(" ");
            System.out.println(marks[i]);
        }
        //enhanced for loop pulls out number but no access individually and cant change
        for (double num : marks) {
            
        }
    }
}
