

	import java.awt.KeyEventDispatcher; 
	import java.awt.KeyboardFocusManager; 
	import java.awt.event.KeyEvent; 
	import java.io.File;
	import javax.sound.sampled.AudioInputStream; 
	import javax.sound.sampled.AudioSystem; 
	import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

	
	public class RobotInSpace implements KeyEventDispatcher {
		
	Robot rob = new Robot("mini");
	
	/*  
	  Make the Robot move around the screen when the arrow keys are pressed... 
	  
	 1. IMPORTANT: For this recipe, use rob.microMove(distance) to move your Robot and rob.setAngle(angle) to change the direction of your Robot.
	  	//Do not add code here - go to step 2
	 */

	private void moveRobot(int keyPressed) throws InterruptedException {
	    // 2. Print out the keyPressed variable and write down the numbers for each arrow key
System.out.println(keyPressed);
	    // 3. If the up arrow is pressed, move the Robot up the screen.
if(keyPressed==38) {
              	rob.setAngle(0);
		rob.microMove(5);}
		
	    // 4. If the down arrow is pressed, move the Robot down.
else if(keyPressed==40) {
          rob.setAngle(180);
          rob.microMove(5);}
	    // 5. If the left arrow is pressed, make the Robot go left.
else if(keyPressed==37) {
	   rob.setAngle(-90);
	   rob.microMove(5);}
	    // 6. If right is pressed, move the Robot right.
else if(keyPressed==39) {
	    	rob.setAngle(90);
	    	rob.microMove(5);
	    }
	    // 7. Run your program and move the Robot to R2-D2 for a surp                                                                                                                                                                                                     																																																		                         rise! 
	}

	private void checkIfR2D2Found() throws Exception {
	    int robotLocationX = rob.getX();
	    int robotLocationY = rob.getY();

		if (robotLocationX <= 7300 && robotLocationX >= 720 && robotLocationY >= 150 && robotLocationY <= 160)
	        playEureka();
	}

	public static void main(String[] args) {
	    new RobotInSpace().controlTheRobot();
	}


	private void controlTheRobot() {
	    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
	    rob.setWindowImage("planet.jpg");
	    rob.penUp();
	    rob.setSpeed(10);
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
	    if (e.getID() == KeyEvent.KEY_PRESSED) {
	        try {
				moveRobot(e.getKeyCode());
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        try {
	            checkIfR2D2Found();
	        } catch (Exception exception) {
	        }
	    }
	    return false;
	}

	public void playEureka() {
	    System.out.println("EUREKA!");
	    try {
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/r2d2-eureka.wav"));
	        Clip clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        clip.start();
	    } catch (Exception ex) {
	        ex.printStackTrace();
	    }
	}
	}


