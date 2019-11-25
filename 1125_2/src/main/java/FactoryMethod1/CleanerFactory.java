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
		}//OCP���������� �̺κ��� ��� �߰��ؾߵǱ� ������ ��������� 
		//�ϳ��� �����ϰ� �����ϴ°� . �̰� factoryMethod.
		return robot;
	}
}
