package jellybean;

import javax.swing.*;
import java.awt.*;
import sunw.demo.jelly.JellyBean; 

public class Main extends JFrame {
    private JellyBean jellyBean;

    public Main() {
        // Create JellyBean instance
        jellyBean = new JellyBean();
        
        // Create buttons
        JButton redButton = new JButton("Red");
        JButton greenButton = new JButton("Green");

        // Set button actions
        redButton.addActionListener(e -> jellyBean.setColor(Color.RED));
        greenButton.addActionListener(e -> jellyBean.setColor(Color.GREEN));

        // Add components to frame
        this.setLayout(new BorderLayout());
        this.add(jellyBean, BorderLayout.CENTER);
        this.add(redButton, BorderLayout.WEST);
        this.add(greenButton, BorderLayout.EAST);

        // Set frame properties
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
