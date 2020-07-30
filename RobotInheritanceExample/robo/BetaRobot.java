package robo;

public class BetaRobot extends AlphaRobot{

	private byte charge;
	
	public BetaRobot(String name, String model) {
		super(name, model);
		setCharge(0);
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
		if (getX() <= 99 && charge>= 5) {
			setX(getX()+1);
			if (getX()%2 == 0) setCharge(getCharge()-1);
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public boolean moveLeft() {
		if (getX() >= 1 && charge>= 5) {
			setX(getX()-1);
			if (getX()%2 == 0) setCharge(getCharge()-1);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean moveDown() {
		if (getY() <= 99 && charge>= 5) {
			setY(getY()+1);
			if (getY()%2 == 0) setCharge(getCharge()-1);
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean moveUp() {
		if (getY() >= 1 && charge>= 5) {
			setY(getY()-1);
			if (getY()%2 == 0) setCharge(getCharge()-1);
			return true;
		} else {
			return false;
		}
	}
	
}
