package main;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    MyFrame() {
        this.setTitle("JFrame title goes here."); // sets title of frame.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of app.
        this.setResizable(false); // prevent frame from being resized.
        this.setSize(420,420); // sets the x and y dimension of the frame.
        this.setVisible(true); // make frame visible.
        
        
        ImageIcon image = new ImageIcon(Main.class.getResource("/psychlogo.jpg")); // get image icon
        this.setIconImage(image.getImage()); // change icon of this.
        this.getContentPane().setBackground(new Color(175, 53, 25)); 
        
    }
}
