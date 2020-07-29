import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

// A class in Java can extend only one class but can implement as many 
// interfaces as it wants. The interfaces specify only the methods this
// class must have. That's why we need a mouseMoved() method, even though
// the one we supplied does not do anything. The MouseMotionListener
// interface says we have to have one.
//
// In other languages, you'd handle this problem by passing a function
// pointer. For a variety of reasons, the Java language has eliminted
// function pointers. Instead, we use interfaces to make contract between
// classes and the compiler.
public class HelloWeb2 extends Applet implements MouseMotionListener {
	int messageX = 125, messageY = 95;
	String theMessage;

	public void init() {
		theMessage = getParameter("message");
		addMouseMotionListener(this);
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
}
