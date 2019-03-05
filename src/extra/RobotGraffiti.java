package extra;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot y = new Robot();
		y.setSpeed(50);
		y.penDown();
		y.move(100);
		y.turn(90);
		y.move(100);
		y.move(-100);
		y.turn(90);
		y.move(100);
		y.turn(-90);
		y.move(100);
		y.penUp();
		y.move(100);
	}
}
