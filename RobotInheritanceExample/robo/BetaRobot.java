package robo;

public class BetaRobot extends AlphaRobot{

	private int x;
	private int y;
	private byte charge;
	
	public BetaRobot(String name, String model) {
		super(name, model);
		this.x = 0;
		this.y = 0;
		this.charge = 0;
	}
	
	public void setCharge(int charge) {
		if(charge >= 0 && charge <= 100) {
			this.charge = (byte)charge;
			} else {
				System.err.println("Error! Charge cannot be outside 0..100 ");
				}
	}

	public int getCharge() {
		return charge;
	}
	
	@Override
	public boolean moveRight() {
		if (x <= 99 && charge>= 5) {
			this.x+= 1;
			if (x%2 == 0) this.charge-= 1;
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean moveLeft() {
		if (x >= 1 && charge>= 5) {
			this.x-= 1;
			if (x%2 == 0) this.charge-= 1;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean moveDown() {
		if (y <= 99 && charge>= 5) {
			this.y+= 1;
			if (y%2 == 0) this.charge-= 1;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean moveUp() {
		if (y >= 1 && charge>= 5) {
			this.y-= 1;
			if (y%2 == 0) this.charge-= 1;
			return true;
		} else {
			return false;
		}
	}
	
}
