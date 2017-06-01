

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 *
 * @author jonej9442
 */
public class DrawingExample extends JComponent {

    // Height and Width of our game 
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;


    // GAME VARIABLES WOULD GO HERE
    //colorpicker.com will tell u what to put in the ()
    //red green blue in order 
    Color purple = new Color(175,35,200);
    int pacmanX = 50;
    // +1 means right and -1 means left
    int pacmanDirection = 1;

    // GAME VARIABLES END HERE   

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE 
        //draw line on the screen
        g.drawLine(200,100,400,500);
        
        //drawing rectangle 
        g.drawRect(400,300,100,50);
        //changing colour 
        g.setColor(Color.CYAN);
        //filling in rectangle 
        g.fillRect(400, 300, 100, 50);
        
        //drawing an oval/circle. top at 400,100 and 100 long and 50 wide
        g.fillOval(400,100,100,50);
        
        //drawing a triangle
        int[] xPoints = {500,750,700};
        int[] yPoints = {375,300,100};
        
        g.setColor(purple);
        //drawing a polygon
        //x points, y points, hwo many points there are all together
        g.fillPolygon(xPoints, yPoints, 3);
        
        //drawing packman
        g.setColor(Color.YELLOW);
        //angle u want to start and and then how much u want to fully rotate(last 2 are angles)
        g.fillArc(pacmanX,500,75,75,45, 270);
        
        // GAME DRAWING ENDS HERE
    }


    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    // how controls work, how things hit eachother ect.
    public void  preSetup(){
       // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
            //moving pacman but making him stop in the screen
            if(pacmanX > WIDTH - 75){
             pacmanDirection = -1;
            }
            if(pacmanX < 0){
                pacmanDirection = +1;
            }
            pacmanX = pacmanX + pacmanDirection;
            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates a windows to show my game
        JFrame frame = new JFrame("My Game");

        // creates an instance of my game
        DrawingExample game = new DrawingExample();
        // sets the size of my game
        game.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(game);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);
        
        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        game.addMouseListener(new Mouse());
        
        // starts the game loop
        game.run();
    }

    // Used to implement any of the Mouse Actions
    private static class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e){
            
        }
        
        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e){
            
        }
        
        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e){
            
        }
    }
    
    // Used to implements any of the Keyboard Actions
    private static class Keyboard extends KeyAdapter{
        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e){
            
        }
        
        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e){
            
        }
    }
}