//file: HelloJava3.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJava3
    extends JComponent
    implements MouseMotionListener, ActionListener {

  // Coordinates for the message
  int messageX = 125, messageY = 95;
  String theMessage;

  JButton theButton;

  // Current index into someColors
  int colorIndex;
  static Color[] someColors = { Color.black, Color.red,
      Color.green, Color.blue, Color.magenta };

  public HelloJava3(String message) {
    theMessage = message;
    theButton = new JButton("Change Color");
    setLayout(new FlowLayout(  ));
    add(theButton);
    theButton.addActionListener(this);
    addMouseMotionListener(this);
  }

  public void paintComponent(Graphics g) {
    g.drawString(theMessage, messageX, messageY);
  }

  public void mouseDragged(MouseEvent e) {
    // Save the mouse coordinates and paint the message.
    messageX = e.getX(  );
    messageY = e.getY(  );
    repaint(  );
  }

  public void mouseMoved(MouseEvent e) {}

  public void actionPerformed(ActionEvent e) {
    // Did somebody push our button?
    if (e.getSource(  ) == theButton)
      changeColor(  );
  }

  synchronized private void changeColor(  ) {
    // Change the index to the next color.
    if (++colorIndex == someColors.length)
      colorIndex = 0;
    setForeground(currentColor(  )); // Use the new color.
    repaint(  ); // Paint again so we can see the change.
  }

  synchronized private Color currentColor(  ) {
    return someColors[colorIndex];
  }

  public static void main(String[] args) {
    JFrame f = new JFrame("HelloJava3");
    // Make the application exit when the window is closed.
    f.addWindowListener(new WindowAdapter(  ) {
      public void windowClosing(WindowEvent we) { System.exit(0); }
    });
    f.setSize(300, 300);
    f.getContentPane(  ).add(new HelloJava3("Hello, Java!"));
    f.setVisible(true);
  }
}
