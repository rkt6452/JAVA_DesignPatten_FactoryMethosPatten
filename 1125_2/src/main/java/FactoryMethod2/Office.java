package FactoryMethod2;

public class Office extends Room{	
	@Override
	protected RobotCleaner getRobotCleaner(RoomStatus status) {
		// TODO Auto-generated method stub
		return new HansungRobot();
	}
}
