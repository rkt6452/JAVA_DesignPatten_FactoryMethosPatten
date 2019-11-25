package FactoryMethod2;

public class MyRoom extends Room {
	@Override
	protected RobotCleaner getRobotCleaner(RoomStatus status) {
		// TODO Auto-generated method stub
		return new SamsungRobot();
	}
}