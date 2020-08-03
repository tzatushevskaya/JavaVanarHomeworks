public class Tablet extends Thing {

	public Tablet (String name) {
		setName(name);	
	}

	@Override
	public void setName(String name) {
		if ( name != null ) {
    		this.name = name;
    	} else {
    		System.err.println("Error!");
    	}
	}

	@Override
	public String getName() {
		return name;
	}
	
}
