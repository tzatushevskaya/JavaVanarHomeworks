public class Phone extends Thing {

	public Phone (String name) {
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
