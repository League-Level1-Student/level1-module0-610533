package _01_houses;
import javax.swing.Box.Filler;

import org.jointheleague.graphical.robot.Robot;
public class Houses {

	
	public void run() {
		
			Robot Rob = new Robot();
			Rob.moveTo(50, 550);
			Rob.setSpeed(200);
			Rob.penDown();
			for (int i = 0; i < 5; i++) {
				//flat house
			Rob.move(100);
			Rob.turn(180/2);
			Rob.move(50);
			Rob.turn(180/2);
			Rob.move(100);
			Rob.turn(-90);
			Rob.setPenColor(0,255,0);
			Rob.move(10);
			Rob.setRandomPenColor();
			//very pointy house
			Rob.turn(-90);
			Rob.move(100);
			Rob.turn(45);
			Rob.move(25);
			Rob.turn(90);
			Rob.move(25);
			Rob.turn(45);
			Rob.move(100);
			Rob.turn(-90);
			Rob.setPenColor(0,255,0);
			Rob.move(10);
			Rob.setRandomPenColor();
			Rob.turn(-90);
			}
		}
	}
