public class Shelf extends Thing {
	
	public Thing contains;
	
    public Shelf () {    	
    }
	
    public Shelf (String name, Thing thing) {
		setName(name);
		setContains(thing);		
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
	
	public void setContains(Thing contains) {
		this.contains = contains;
	}
	
	public Thing getContains() {
		return contains;
	}

}
