package FactoryMethod1;

public class CleanerFactory {
	public static RobotCleaner getCleaner(RoomStatus status) {
		RobotCleaner robot = null;
		switch (status) {
		case DIRTY:
			robot = new SeoulRobot();
			break;
		case MESS:
			robot = new HansungRobot();
			break;
		}//OCP관점에서는 이부분을 계속 추가해야되기 때문에 위배되지만 
		//하나만 변경하게 집중하는것 . 이게 factoryMethod.
		return robot;
	}
}
