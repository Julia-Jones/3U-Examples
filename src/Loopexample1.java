
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonej9442
 */
public class Loopexample1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        
        Robot karel = new Robot(kw,1,1,Direction.EAST);
        
        new Wall(kw,1,5,Direction.EAST);
        
        // infinity loop for what is in the curly brackets (while(true) goes forever and crashes
        // while(karel.frontIsClear() will move and stop before wall
        while(karel.frontIsClear()){
        karel.move();
    }
        //when stopped or something in front. then turns
        karel.turnLeft();
        
       //standing on something that it can pick up.(multiple objects loop to pick up all) 
        karel.pickThing();
        
        //standing on something that it can pick up.(multiple objects loop to pick up all at one time) 
        karel.pickThing();
        
        //if statement (only checks once for an action that needs to be done once)
        if(karel.canPickThing());
            
        //stops after picking 5 things up. 
            while(karel.countThingsInBackpack()<5);
            
            //can break loop put break; after it does one thing
            //stops while loop completely 
            //breaks and justs out of loop and to the stuff after
            
            //did karel hit a wall? yes and no questions (! is making it do the opposite)
            //if(karel.frontIsClear()==false){
            if(!(karel.frontIsClear() )){
               //as soon as hits wall it turns left and keeps going straight
             karel.turnLeft();   
            
            }
            
            
            
            
            
        
  }  
  }  
    
    
 

