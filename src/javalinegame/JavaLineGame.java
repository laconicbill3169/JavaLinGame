package javalinegame;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


/**
 * @author Jerimiah Gazlay
 * Page 
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
    
    
    
    
    public static void main(String[] args) 
    {
       JavaLineGame g = new JavaLineGame();
    }

}
