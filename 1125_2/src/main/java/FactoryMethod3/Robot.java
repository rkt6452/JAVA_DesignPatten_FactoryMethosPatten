package FactoryMethod3;

public abstract class Robot {
	public void fireMissile() {
		prepare();
		Missile m = loadMissile();
		m.launch();
		cleanUp();
	}

	protected abstract Missile loadMissile();

	private void cleanUp() {
		// TODO Auto-generated method stub

		System.out.println("Cleaning");
	}

	private void prepare() {
		// TODO Auto-generated method stub
		System.out.println("PreParing");
	}
}
