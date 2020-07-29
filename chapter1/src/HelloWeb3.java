import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class HelloWeb3 extends Applet implements MouseMotionListener, ActionListener {
	int messageX = 125, messageY = 95;
	String theMessage;
	Button theButton;
	int colorIndex = 0;
	static Color[] someColors = {Color.black, Color.red, Color.green, Color.blue, Color.magenta};

	public void init() {
		theMessage = getParameter("message");
		// The new operator provides the general mechanism for instantiating objects.
		// It arranges for Java to allocate storage for the object and then call the
		// constructor method of the objects' class to initialize it.
		theButton = new Button("change Color");
		add(theButton);
		addMouseMotionListener(this);
		theButton.addActionListener(this);
	}

	public void paint( Graphics graphics ) {
		graphics.drawString( theMessage, messageX, messageY );
	}

	public void mouseDragged( MouseEvent e ) {
		messageX = e.getX();
		messageY = e.getY();
		repaint();
	}

	public void mouseMoved( MouseEvent e ) { }

	public void actionPerformed( ActionEvent e ) {
		if ( e.getSource() == theButton ) {
			changeColor();
		}
	}

	synchronized private void changeColor() {
		if ( ++colorIndex == someColors.length )
			colorIndex = 0;
		setForeground( currentColor() );
		repaint();
	}

	synchronized private Color currentColor() {
		return someColors[ colorIndex ];
	}

}
