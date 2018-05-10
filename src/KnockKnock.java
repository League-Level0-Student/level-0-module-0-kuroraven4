import javax.swing.JOptionPane;

public class KnockKnock {public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null, "Knock Knock");
String who=	JOptionPane.showInputDialog("Who's There?");
String response= JOptionPane.showInputDialog(who+"who?");
}

}
