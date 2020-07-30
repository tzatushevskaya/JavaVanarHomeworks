package robo;

public class AlphaRobot extends AbstractRobot{

	private String name;
	private String model;
	private int x;
	private int y;
	
	
	protected AlphaRobot() {}
	
	protected AlphaRobot(String name, String model) {
		setName(name);
		setModel(model);
		this.x = 0;
		this.y = 0;
	}

	@Override
	public void setName(String name) {
		if( name!=null) {
			System.err.println("Empty value is not allowed for name.");
		} else {
			this.name = name;
		}
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setModel(String model) {
		if(model!=null ) {
			System.err.println("Empty value is not allowed for model.");
		} else {
			this.model = model;
		}	
	}

	@Override
	public String getModel() {
		return model;
	}

	@Override
	public void setX(int x) {
		if(x >= 0 && x <= 100) {
			this.x = x;
			} else {
				System.err.println("Error! X cannot be outside 0..100 ");
				}
	}

	@Override
	public int getX() {
		return x;
	}

	@Override
	public void setY(int y) {
		if(y >= 0 && y <= 100) {
			this.y = y;
			} else {
				System.err.println("Error! Y cannot be outside 0..100 ");
				}
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public boolean moveRight() {
		if (x <= 99) {
			this.x+= 1;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean moveLeft() {
		if (x >= 1) {
			this.x-= 1;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean moveDown() {
		if (y <= 99) {
			this.y+= 1;
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean moveUp() {
		if (y >= 1) {
			this.y-= 1;
			return true;
		} else {
			return false;
		}
	}
	
}
