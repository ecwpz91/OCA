import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class HelloWeb4 extends Applet implements MouseMotionListener, ActionListener, Runnable {
	int messageX = 125, messageY = 95;
	String theMessage;
	Button theButton;
	int colorIndex = 0;
	static Color[] someColors = {Color.black, Color.red, Color.green, Color.blue, Color.magenta};
	Thread blinkThread;
	boolean blinkState;

	public void init() {
		theMessage = getParameter("message");
		theButton = new Button("change Color");
		add(theButton);
		addMouseMotionListener(this);
		theButton.addActionListener(this);
	}

	public void paint( Graphics graphics ) {
		graphics.setColor( blinkState ? Color.white : currentColor() );
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

	public void run() {
		while ( true ) {
			blinkState = !blinkState;
			repaint();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// Handle error condition here ...
			}
		}
	}

	public void start() {
		if ( blinkThread == null) {
			blinkThread = new Thread(this);
			blinkThread.start();
		}
	}

	public void stop() {
		if ( blinkThread != null) {
			blinkThread.stop();  // UNSAFE! --> https://docs.oracle.com/javase/8/docs/technotes/guides/concurrency/threadPrimitiveDeprecation.html
			blinkThread = null;
		}
	}
}
