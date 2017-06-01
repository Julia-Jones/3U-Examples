/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jonej9442
 */
public class MethodsExample {
        // method to say hello
    public static void sayHello(){
        System.out.println("Hello!");
    }
    /**
     * say hello to a specific user
     * @param name - the name of the user
     */
    //same sting name just different peramiters
    public static void sayHello(String name){
        System.out.println("Hello " + name + ".");
    }
    
    /**
     * Calculates the volume of a cylinder
     * @param radius - the radius of the cylinder
     * @param height - the height of the cylinder
     * @return - the volume of cylinder with the radius and height
     */
    public static double volumeOfCylinder(double radius, double height){
        
        //squaring (base, power) 
        double rSquared = Math.pow(radius,2);
        //multiplying all together
        double volume = Math.PI*rSquared*height;
        return volume; //sends back an answer
    }
    //adding five
    public static void addFive(int[] num){
        num[0] = num[0] + 5;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //calling the sayHello method
        sayHello();
        
        //adding sting name 
        String n = "Fred";
        sayHello(n);
        //or
        sayHello("Fred");
       
        //radius =10, height = 15
        //answer will be stored in answer variable
        double answer = volumeOfCylinder(10,15);
        System.out.println(answer);
        
        int[] num = {10,15,25};
        addFive(num);
        System.out.println(num[0]);
        
        
        
        
        
        
    }
}
