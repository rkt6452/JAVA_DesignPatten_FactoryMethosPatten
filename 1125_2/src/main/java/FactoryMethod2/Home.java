package FactoryMethod2;

public class Home extends Room{
	@Override
	protected RobotCleaner getRobotCleaner(RoomStatus status) {
		// TODO Auto-generated method stub
		RobotCleaner robot = null;
		switch (status) {
		case DIRTY:
			robot = new SeoulRobot();
			break;
		case MESS:
			robot = new HansungRobot();
			break;
		}
		return robot;
	}
}
