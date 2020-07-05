package kitchen;

public class SmallCup extends Cup {
	
	public SmallCup(int liquidVolume, String liquidName) {
		super(liquidVolume, liquidName);
	}

    public void setVolume(int liquidVolume) {
		capacity += liquidVolume;
		if(capacity >=0 && capacity <=200) {
			this.liquidVolume += liquidVolume;
			} else {
				System.err.println("Error! The capacity does not allow this operation");
				}
	}
	
}
