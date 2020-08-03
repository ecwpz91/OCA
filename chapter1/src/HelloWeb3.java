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

	// The synchronied keyword has to do with threads and indicates that these two methods 
	// can never be running at the same time. They must always run one after the other.
	//
	// The reason for this is that in changeColor() we increment colorIndex befroe testing
	// its value. That means that for some brief period of time while Java is running
	// through our code, colorIndex can have a value that is past the end of our array. If our
	// currentColor() method happened to run at that same moment, we would see a runtime 
	// "array out of bounds" error. This is an example of Java making it easy to deal
	// with this type of problem easily without having to think about ways we could fudge around
	// how to deal with this in a if/then/case scenario.
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
