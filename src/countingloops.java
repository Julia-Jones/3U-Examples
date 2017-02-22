
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jonej9442
 */
public class countingloops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();

        //add SE tp robot to turn right
        RobotSE bob = new RobotSE(kw, 1, 1, Direction.EAST);

        //make a counter (starts at 0)(primative) 
        int counter = 0;

        while (counter < 5) {
            //move 
            bob.move();
            //increase the counter! (can add, - ,/, *)
            counter = counter + 1;
            //add one
            //counter++;
            //subtract one
            //counter--;
            //adds one to counter (can use other signs too)
            // counter += 1;

        }

        bob.turnAround();

        //using a for loop to count
        //for (define a variable; condition to loop; change variable)
        for (int i = 0; i < 5; i = i + 1) {
            bob.move();
}
            
        //Compound conditions 
        // && is an AND statement (both must be true) 
        //|| is an OR statement (one of them must be true)
        if(bob.frontIsClear()){
        if(bob.countThingsInBackpack()==5) {
           // do something
        }
        }
        
        if(bob.frontIsClear() && bob.countThingsInBackpack()==5){
            //do something
        }
        
        if(bob.frontIsClear()){
            //do something
        }else if(bob.countThingsInBackpack()==5){
            //do same thing as above if statement 
        }

        //both dont have to be true 
        if(bob.frontIsClear() || bob.countThingsInBackpack()==5){
            //do something
        }




    }
}
