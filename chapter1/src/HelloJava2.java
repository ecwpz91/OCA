
//file: HelloJava2.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJava2 extends JComponent implements MouseMotionListener {

    // Coordinates for the message
    int messageX = 125, messageY = 95;
    String theMessage;

    public HelloJava2(String message) {
        theMessage = message;
        addMouseMotionListener(this);
    }

    public void paintComponent(Graphics g) {
        g.drawString(theMessage, messageX, messageY);
    }

    public void mouseDragged(MouseEvent e) {
        // Save the mouse coordinates and paint the message.
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("HelloJava2");
        // Make the application exit when the window is closed.
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        f.setSize(300, 300);
        f.getContentPane().add(new HelloJava2("Hello, Java!"));
        f.setVisible(true);
    }
}
