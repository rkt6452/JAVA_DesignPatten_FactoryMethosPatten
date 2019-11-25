package FactoryMethod2;

public abstract class Room {
	private RobotCleaner robotcleaner;
	public void clean(RoomStatus status) {
		robotcleaner = getRobotCleaner(status);
		robotcleaner.wash();
	}
	protected abstract RobotCleaner getRobotCleaner(RoomStatus status);
}
