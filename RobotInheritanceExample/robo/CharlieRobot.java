package robo;

public class CharlieRobot extends BetaRobot{
	
	public CharlieRobot(String name, String model) {
		super(name, model);
	}
	
	public boolean moveDownRight() {
		
		if (getX() <= 99 && getY() <= 99 && getCharge() >= 5) {
			setX(getX()+1);
			setY(getY()+1);
			if (getX()%2 == 0) setCharge(getCharge()-1);
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean moveDownLeft() {
		if (getX() >= 1 && getY() <= 99 && getCharge() >= 5) {
			setX(getX()-1);
			setY(getY()+1);
			if (getX()%2 == 0) setCharge(getCharge()-1);
			return true;
		} else {
			return false;
		}
		
	}

	public boolean moveUpRight() {
		if (getX() <= 99 && getY() >= 1 && getCharge() >= 5) {
			setX(getX()+1);
			setY(getY()-1);
			if (getX()%2 == 0) setCharge(getCharge()-1);
			return true;
		} else {
			return false;
		}
		
	}

	public boolean moveUpLeft() {
		if (getX() >= 1 && getY() >= 1 && getCharge() >= 5) {
			setX(getX()-1);
			setY(getY()-1);
			if (getX()%2 == 0) setCharge(getCharge()-1);
			return true;
		} else {
			return false;
		}
		
	}
	
}
