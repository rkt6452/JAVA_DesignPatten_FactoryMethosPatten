package FactoryMethod1;

public class Office {
	private RobotCleaner robot;
	public void clean(RoomStatus status) {
		robot = CleanerFactory.getCleaner(status);
		
		robot.wash();
	}
}
