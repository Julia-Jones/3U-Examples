
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kitchener = new City();
        
        Robot karel = new Robot(kitchener, 3,3,Direction.EAST);
        //building the grocery items
        new Thing(kitchener,0,0);
        new Thing(kitchener,1,0);
        new Thing(kitchener,1,1);
        new Thing(kitchener,1,2);
        new Thing(kitchener,2,2);
        //Building the walls
          new Wall(kitchener,3,3,Direction.SOUTH);
          new Wall(kitchener,3,3,Direction.EAST);
          new Wall(kitchener,2,3,Direction.EAST);
          new Wall(kitchener,2,3,Direction.NORTH);
          new Wall(kitchener,2,3,Direction.WEST);
        
          Robot maria = new Robot(kitchener,0,1,Direction.WEST);
          //setting the name(M and K) for the Robots
          karel.setLabel("K");
          maria.setLabel("M");
          //moving Karel and Maria
          karel.turnLeft(); 
          karel.turnLeft(); 
          maria.move();
          maria.pickThing();
          karel.move();
          karel.turnLeft(); 
          karel.turnLeft(); 
          karel.turnLeft();
          maria.turnLeft();
          maria.move();
          karel.move();
          maria.pickThing();
          karel.pickThing();
          maria.turnLeft();
          maria.move();
          karel.move();
          karel.pickThing();
          maria.pickThing();
          karel.turnLeft();
          
          
        
        
    }
}
