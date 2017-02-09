
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
public class A1Q2 {
    private static City kitchener;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Building City
        City kitchener = new City();
        //Building Karel
        Robot karel = new Robot(kitchener,1,2, Direction.SOUTH);
        //building the walls
        new Wall(kitchener, 1,2,Direction.NORTH);
        new Wall(kitchener, 1,2,Direction.SOUTH);
        new Wall(kitchener, 1,2,Direction.EAST);
        new Wall(kitchener, 1,1, Direction.NORTH);
        new Wall(kitchener, 1,1,Direction.WEST);
        new Wall(kitchener, 2,1,Direction.WEST);
        new Wall(kitchener, 2,1,Direction.SOUTH);
        //building the ball/dot
        new Thing(kitchener,2,2);
        
        //moving karel to get newspaper
        karel.turnLeft(); 
        karel.turnLeft();  
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        //karel picking the newspaper
        karel.pickThing();
       //going back
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft(); 
        karel.move();
        //karel putting down thing
        karel.putThing();
              
        
        
        
   
        
    }
}
