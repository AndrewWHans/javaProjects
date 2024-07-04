package main;

public class Main {

    public static void main(String[] args) {
        
        // JFrame = A GUI window to add components to.
        /*
        JFrame frame = new JFrame(); // creates a frame.
        frame.setTitle("JFrame title goes here."); // sets title of frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of app.
        frame.setResizable(false); // prevent frame from being resized.
        frame.setSize(420,420); // sets the x and y dimension of the frame.
        frame.setVisible(true); // make frame visible.
        
        ImageIcon image = new ImageIcon(Main.class.getResource("/psychlogo.jpg")); // get image icon
        frame.setIconImage(image.getImage()); // change icon of frame.
        //frame.getContentPane().setBackground(Color.green); 
        //frame.getContentPane().setBackground(new Color(123,50,250)); // 1st val is red, 2nd is green, 3rd is blue
        frame.getContentPane().setBackground(new Color(0xFFFFFF)); // hex works too, turns white
        */
        
        MyFrame myFrame = new MyFrame();
        
    }
    
}

