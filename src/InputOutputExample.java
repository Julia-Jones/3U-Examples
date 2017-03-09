
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonej9442
 */
public class InputOutputExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //tells you what youre supposed to do
        System.out.println("Please enter your name");
        
        //scanner allows you to scan in stuff
       Scanner input = new Scanner(System.in);
       //allows to scan in a line 
       String name2 = input.nextLine();
        //print line
        //putting in "" = a string, stores things
       //scanning name into variable 
        String name = "Julia";
         System.out.println("Hello world!");
         //adds name 
         System.out.println("Hello " + name2);
                
        //ask the user what year they were born
         //use this to calculate the age
         //short cut is sout then click tab
         System.out.println("What year were you born");
         int year = input.nextInt();
         int age = 2017 - year;
         //if u have been born
         if(age > 0){
         System.out.println("You are " + age + " years old!");
         }else{
             System.out.println("I think you are lying...");
         }
         
         // + for adding, - subrating, * is multiplying and / is divideing
         // % - remainder(divide the remainder?)(exists to get a decimal answer)
         System.out.println(99.0/100.0); 
        System.out.println(5%2);
        
    }
}
