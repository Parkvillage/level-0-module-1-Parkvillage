//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0




import javax.swing.JOptionPane;

/*
* Everyone has a superpower. Mine is writing recipes. This program will store
* the superpowers of all the people in the classroom. E.g. When I type "June",
* your program should say "June's superpower is writing recipes".
*/
public class XGeeks {

	public static void main(String[] args) {
	
	String Keith = "the power to teach";
	String Michael = "the power to sa I.D.K";

		// 1. Save the superpower for each person in a variable.
		// 2. Ask the user to enter a name. Store their answer in a variable.
	String name=JOptionPane.showInputDialog("whats yo name");
	 if(name.equals("keith")) {
	 		
			JOptionPane.showMessageDialog(null,Keith ); 
}
	 if(name.equals("Michael")){
		 JOptionPane.showMessageDialog(null,Michael );
	 }
	 

		// 3. Show the superpower in a pop-up, depending on the name entered. 

	}

}


