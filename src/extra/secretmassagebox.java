package extra;

import javax.swing.JOptionPane;

public class secretmassagebox {
public static void main(String args[]) {
	String pass=JOptionPane.showInputDialog("INSERT SECRET MESSAGE HERE");
	String qwer=JOptionPane.showInputDialog("whats the pass?");
	if(qwer.equals("u r a dork")) {
		JOptionPane.showInputDialog(pass);
		
	}
	else {
		JOptionPane.showInputDialog("INTRUDER INTRUDER!!!!!!!!!!!!!!!!!!!!!!!!!!");
	}
}
}
