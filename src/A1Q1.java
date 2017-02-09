
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonej9442
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Creating a new City called Kitchener
        City kitchener = new City();
        
        //Creating a robot (living where, what place, diection) 
        Robot karel = new Robot(kitchener, 0, 2, Direction.WEST);
         //  Building the walls into a square 
        new Wall(kitchener,1,1,Direction.WEST);
        new Wall(kitchener, 2,1,Direction.WEST);
        new Wall(kitchener, 1,1, Direction.NORTH);
        new Wall(kitchener, 1,2, Direction.NORTH);
        new Wall(kitchener, 1,2, Direction.EAST);
        new Wall(kitchener, 2,2, Direction.EAST);
        new Wall(kitchener, 2,1,Direction.SOUTH);
        new Wall(kitchener, 2,2, Direction.SOUTH);
        
        
        //karel moving around counter clockwise 
        karel.move();
        karel.move();
        karel.turnLeft(); 
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        
        
                
 
    }
}
