package kitchen;

public class BigCup extends Cup {
	
	public BigCup(int liquidVolume, String liquidName) {
		super(liquidVolume, liquidName);
	}

    public void setVolume(int liquidVolume) {
		capacity += liquidVolume;
		if(capacity >=0 && capacity <=1000) {
			this.liquidVolume += liquidVolume;
			} else {
				System.err.println("Error! The capacity does not allow this operation");
				}
	}
	
}