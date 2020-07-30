package robo;

public class CharlieRobot extends BetaRobot{

	private int x;
	private int y;
	private byte charge;
	
	protected CharlieRobot(String name, String model) {
		super(name, model);
		this.x = 0;
		this.y = 0;
		this.charge = 0;
	}
	
	public boolean moveDownRight() {
		
		if (x <= 99 && y <= 99 && charge>= 5) {
			this.x+= 1;
			this.y+= 1;
			if (x%2 == 0 && y%2 == 0) this.charge-= 1;
			return true;
		} else {
			return false;
		}
		
	}
	
	public boolean moveDownLeft() {
		if (x >= 1 && y <= 99 && charge>= 5) {
			this.x-= 1;
			this.y+= 1;
			if (x%2 == 0 && y%2 == 0) this.charge-= 1;
			return true;
		} else {
			return false;
		}
		
	}

	public boolean moveUpRight() {
		if (x <= 99 && y <= 99 && charge>= 5) {
			this.x+= 1;
			this.y+= 1;
			if (x%2 == 0 && y%2 == 0) this.charge-= 1;
			return true;
		} else {
			return false;
		}
		
	}

	public boolean moveUpLeft() {
		if (x >= 1 && y >= 1 && charge>= 5) {
			this.x-= 1;
			this.y-= 1;
			if (x%2 == 0 && y%2 == 0) this.charge-= 1;
			return true;
		} else {
			return false;
		}
		
	}
	
}
