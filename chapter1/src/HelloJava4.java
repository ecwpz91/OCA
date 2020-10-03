
//file: HelloJava4.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJava4 extends JComponent implements MouseMotionListener, ActionListener, Runnable {

    // Coordinates for the message
    int messageX = 125, messageY = 95;
    String theMessage;

    JButton theButton;

    int colorIndex; // Current index into someColors.
    static Color[] someColors = { Color.black, Color.red, Color.green, Color.blue, Color.magenta };

    boolean blinkState;

    public HelloJava4(String message) {
        theMessage = message;
        theButton = new JButton("Change Color");
        setLayout(new FlowLayout());
        add(theButton);
        theButton.addActionListener(this);
        addMouseMotionListener(this);
        Thread t = new Thread(this);
        t.start();
    }

    public void paintComponent(Graphics g) {
        g.setColor(blinkState ? getBackground() : currentColor());
        g.drawString(theMessage, messageX, messageY);
    }

    public void mouseDragged(MouseEvent e) {
        messageX = e.getX();
        messageY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void actionPerformed(ActionEvent e) {
        // Did somebody push our button?
        if (e.getSource() == theButton)
            changeColor();
    }

    synchronized private void changeColor() {
        // Change the index to the next color.
        if (++colorIndex == someColors.length)
            colorIndex = 0;
        setForeground(currentColor()); // Use the new color.
        repaint(); // Paint again so we can see the change.
    }

    synchronized private Color currentColor() {
        return someColors[colorIndex];
    }

    public void run() {
        try {
            while (true) {
                blinkState = !blinkState; // Toggle blinkState.
                repaint(); // Show the change.
                Thread.sleep(500);
            }
        } catch (InterruptedException ie) {
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("HelloJava4");
        // Make the application exit when the window is closed.
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
        f.setSize(300, 300);
        f.getContentPane().add(new HelloJava4("Hello, Java!"));
        f.setVisible(true);
    }
}
