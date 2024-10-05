import acm.graphics.*;
import acm.program.*;
import javax.swing.*;
import java.awt.event.*;
public class MyFirstTimer extends GraphicsProgram implements ActionListener {
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	Timer someTimerVar = new Timer(1000, this);
	private GLabel myLabel;
	private int numTimes = 0;
	//private TimerBall ball;
	

	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus(); 
	}
	
	public void run() {
		myLabel = new GLabel("# of times called?", 0, 100);
		add(myLabel);
		setInitialDelay(3);
		someTimerVar.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		numTimes++;
		myLabel.move(5, 0);
		myLabel.setLabel("times called? " + numTimes);
		stopTimer();
	}
	
	public void setInitialDelay(int i) {
		int j = i;
	}
	
	public void stopTimer() {
		if (numTimes == 10) {
			someTimerVar.stop();
		}
	}
	
	public static void main(String[] args) {
		new MyFirstTimer().start();
	}
}