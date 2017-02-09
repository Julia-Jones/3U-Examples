
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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kitchener = new City();
//Robots      
        Robot karel = new Robot(kitchener,0,0,Direction.SOUTH);
        Robot bob = new Robot(kitchener, 0,1,Direction.SOUTH);
       //walls
        new Wall(kitchener,0,1,Direction.WEST);
        new Wall(kitchener,1,1,Direction.WEST);
        new Wall(kitchener,1,1,Direction.SOUTH);
        
        //Moving the robots
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        bob.move();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        
        
        
        
       
        
        
        
        
    }
}
