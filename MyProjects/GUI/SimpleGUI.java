package simplegui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleGUI implements ActionListener {

    private int count = 0;
    private JLabel label = new JLabel("Number of clicks: 0");
    private JFrame frame = new JFrame();
    private JPanel panel;
    
    public SimpleGUI() {
        
        // clickable button.
        JButton button = new JButton("Click me");
        button.addActionListener(this);
        
        // panel with the button and text.
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        
        // set up the frame and display it.
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();
        frame.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        new SimpleGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
    
}