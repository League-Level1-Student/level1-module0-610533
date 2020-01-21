package _01_houses;
import org.jointheleague.graphical.robot.Robot;
public class Houses {
	public void run() {
			Robot Rob = new Robot();
			Rob.setX(-99);
			Rob.setY(-99);
			Rob.penDown();
			Rob.move(100);
			Rob.turn(180/2);
			Rob.move(50);
		}
	}
