import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class Checkpoint { public static void main(String[] args) {
	String question= JOptionPane.showInputDialog("What's your favorite color?");
	JOptionPane.showMessageDialog(null,question+ "is also my favorite color!");
	Robot ignis = new Robot();
	if (color.equals("red")) {
		ignis.setPenColor(red);
	}
	else {
	ignis.setSpeed(10);
	ignis.move(100);
	ignis.turn(120);
	ignis.move(100);
	ignis.turn(120);
	ignis.move(100);
	ignis.turn(120);
	
}   

}
