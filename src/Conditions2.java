
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonej9442
 */
public class Conditions2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //city
        City kw = new City();
        
        //Robot
        Robot karel = new Robot(kw,4,1,Direction.EAST);
        
        //shows how many things are in each place
       kw.showThingCounts(true);
        
        //1-move forward 2- turn left 3- turn right 4-stop
        //creating a path
        new Thing(kw,4,2);
        
        new Thing(kw,4,3);
        new Thing(kw,4,3);
        
        new Thing(kw,3,3);
        
        new Thing(kw,2,3);
        new Thing(kw,2,3);
        new Thing(kw,2,3);
        new Thing(kw,2,3);
        
        //step on 2 first part of path
       karel.move();
        
       //loop 
       while(true){
           
       //if there are things 
       //pick them all up
       while(karel.canPickThing()){
           karel.pickThing();
       }
           
       //if holding one thing, move
       if(karel.countThingsInBackpack()== 1 ){
           //drop everything
           karel.putThing();
           karel.move();
           
           //if holding 2 things, turn left
       }else if(karel.countThingsInBackpack()== 2){
           //drop thing
           karel.putThing();
           karel.putThing();
           karel.turnLeft();
           karel.move();
       }else if(karel.countThingsInBackpack()==3){
           karel.putThing();
           karel.putThing();
           karel.putThing();
           karel.turnLeft();
           karel.turnLeft();
           karel.turnLeft();
           karel.move();
       }else if(karel.countThingsInBackpack()== 4){
           
          
       }
           
       //if holding 3 things, turn right
           
       //if holding 4 things, stop 
           
          
           
           
           
           
           
       }
       
        
        
        
        
        
    }
}
