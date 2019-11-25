package FactoryMethod3;

public class MyRobot extends Robot {

	@Override
	protected Missile loadMissile() {
		// TODO Auto-generated method stub
		return new HansungMissile();
	}

}
