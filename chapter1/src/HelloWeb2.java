import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

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
