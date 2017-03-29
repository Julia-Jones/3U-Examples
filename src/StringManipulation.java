
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jonej9442
 */
public class StringManipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create a scanner
        while (true) {
            Scanner input = new Scanner(System.in);
            //get word from user
            System.out.println("Please enter a word");
            String word = input.nextLine();

            //stop the program when END was entered
            if (word.equals("END")) {
                break;
            }

            //convert to lower care
            word = word.toLowerCase();
            //replace numbers to letter
            //fix 1337 (leet) speak 
            word = word.replace("3", "e");
            word = word.replace("@", "a");
            word = word.replace("0", "o");

            //find length of word(counts spaces too)
            int length = word.length();
            System.out.println("That word's length is " + length + ".");
            //walk through character by character (char = character)
            //cant get the letter if it is longer then the word \
            //can go lenght - 1
            char letter = word.charAt(0);
            System.out.println("Character at 0 is " + letter);
            //print out each letter in the word
            //start at 0 and go upu to the length -1
            for (int i = 0; i < length; i++) {
                // get character at position i
                char character = word.charAt(i);
                //print out 
                System.out.println(character);
                // see if it is a vowel
                if (character == 'a'
                        || character == 'e'
                        || character == 'i'
                        || character == 'o'
                        || character == 'u') {
                    //splittling string at vowel and after vowel 
                    String firstHalf = word.substring(0, i);
                    String secondHalf = word.substring(i);

                    //create the translated word
                    String tWord = secondHalf + firstHalf + "ay";
                    //show user the pig latin 
                    System.out.println("Your word in pig Latin is " + tWord);
                    //stop looking for more vowels
                    break;
                }
            }
        }

    }
}
