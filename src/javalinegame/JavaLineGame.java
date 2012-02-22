package javalinegame;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


/**
 * @author Jerimiah Gazla
 */
public class JavaLineGame extends JFrame 
{
    
    final int WIDTH = 1500, HEIGHT = 750;
    
    //create the rectangles needed for graphics
    Rectangle backGround = new Rectangle(0, 0, WIDTH, HEIGHT);
    Rectangle bottom = new Rectangle(0, (HEIGHT/9)*8, WIDTH, HEIGHT/8);
    Rectangle boxBottom = new Rectangle(WIDTH/2, (HEIGHT/8)*7, WIDTH/20, HEIGHT/55);
    Rectangle boxLeft = new Rectangle(WIDTH/2, (HEIGHT - 130), WIDTH/100, HEIGHT/20);
    Rectangle boxRight = new Rectangle(((WIDTH/2)+(WIDTH/25)), (HEIGHT - 130), WIDTH/100, HEIGHT/20);
    
    //the constructor
    public JavaLineGame()
    {
        //create the window
        super("JAVELIN GAME!");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        Move1 m1 = new Move1();
        Move2 m2 = new Move2();
        Move3 m3 = new Move3();
        m1.start();
        m2.start();
        m3.start();
        
    }
    
    public void paint(Graphics g)
    {
        super.paint(g);
        
        g.setColor(Color.blue);
        
        g.fillRect(backGround.x, backGround.y, backGround.width, backGround.height);
        
        g.setColor(Color.GREEN);
        
        g.fillRect(bottom.x, bottom.y, bottom.width, bottom.height);
        
        g.setColor(Color.BLACK);
        
        g.fillRect(boxBottom.x, boxBottom.y, boxBottom.width, boxBottom.height);
        g.fillRect(boxLeft.x, boxLeft.y, boxLeft.width, boxLeft.height);
        g.fillRect(boxRight.x, boxRight.y, boxRight.width, boxRight.height);
    }
    
    //created the Move1 Thread that will let the user control his box object
    private class Move1 extends Thread implements KeyListener
    {
        
        public void run()
        {
            
            //add the Keylistener to this Thread
            addKeyListener(this);
            
            //creates an infinite loop.
            while(true)
            {
                repaint();
                
                //start a try catch statement to allow the infinite loop to stop if there is an exception.
                try
                {
                    
                }
                catch (Exception e)
                {
                    //let the loop exit the program if there was an exception thrown.
                    break;
                }
                
                
            }
        }
        
        //imported this for KeyListener
        public void keyPressed(KeyEvent event)
        {            
        }
        
        //imported this for KeyListener
        public void keyReleased(KeyEvent event)
        {
        }
        
        //imported this for KeyListener. Most of the work will be done in this one.
        public void keyTyped(KeyEvent event)
        {
            
        }
        
    }
    
    //I created this Thread, but I do not remember what I was Planning on doing with it.
    private class Move2 extends Thread implements KeyListener
    {
        
        public void run()
        {
            
            addKeyListener(this);
            
            while(true)
            {
                repaint();
            }
        }
        public void keyPressed(KeyEvent event)
        {
        }
        
        public void keyReleased(KeyEvent event)
        {
        }
        
        public void keyTyped(KeyEvent event)
        {
            
        }
    }
    
    //This thread will control the Javelins falling from the sky.
    private class Move3 extends Thread
    {
        
    }
    
    
    
    
    public static void main(String[] args) 
    {
       JavaLineGame g = new JavaLineGame();
    }

}
