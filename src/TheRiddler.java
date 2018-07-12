import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {
		JOptionPane.showInputDialog(null,"welcome to teh quiz.");
		JOptionPane.showInputDialog(null,"dont worry, there will be no CAPITALS and no punctuation.");
		JOptionPane.showInputDialog(null,"your score will not be told to you after each riddle, the score will pop up to you at the end of the quiz.good luck!!!!!!!!!!!!!!!!");

		// 1. Make a variable to hold the score
              int score=0;   
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String a = JOptionPane.showInputDialog(null,"what is greater than gods,is more evil than the devil, the poor have it, the rich need it,AND, if you eat it you die. (very hard, 3pts)");
if(a.equals("nothing")) {
	score+=3;
	
		
	}
else {
	score-=1;
}
String b=JOptionPane.showInputDialog(null,"what travels around the world but at the same time always stays in one corner....");
if(b.equals("a stamp")) {
	score+=1;
}
else {
	score-=1;
}
String c=JOptionPane.showInputDialog(null,"what did the football coach say to the vending machine..............");
if(c.equals("give me my quarterback")) {
	score+=2;
}
else {
	score-=1;
}

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
		
	}
}

