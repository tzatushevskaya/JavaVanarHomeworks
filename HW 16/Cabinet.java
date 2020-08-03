public class Cabinet {
	
	public static void main (String[] args) {
		Cabinet library = new Cabinet();
		Book sciFi = new Book("Dimension of Miracles");
		library.put("top", sciFi);
		System.out.println(library.whatIsOn("top"));
		System.out.println(library.take("top"));
		System.out.println(library.whatIsOn("top"));
		
	}
		  	
    private Shelf topShelf;
    private Shelf middleShelf;
    private Shelf bottomShelf;
    
    public Cabinet() {}

    void put( String shelfName, Thing thing ) {
    		switch(shelfName) {
    		  case "top":
    		    topShelf.setContains(thing);
    		    break;
    		  case "middle":
    			middleShelf.setContains(thing);
    		    break;
    		  case "bottom":
    			bottomShelf.setContains(thing);
      		    break;  
    		  
    		  default:
    		    System.err.println("No shelves matching your name criteria!");
    		} 
    	
    }
    
    Thing take( String shelfName) {
    	Shelf keep = new Shelf();
		switch(shelfName) {
		  case "top":
		    keep.setContains(topShelf.getContains());
		    topShelf.setContains(null);
		    break;
		  case "middle":
			keep.setContains(middleShelf.getContains());
			middleShelf.setContains(null);
		    break;
		  case "bottom":
			keep.setContains(bottomShelf.getContains());
			bottomShelf.setContains(null);
		    break;  
		  
		  default:
		    System.err.println("No shelves matching your name criteria!");
		}
    	return keep.getContains();
    }
    
    Thing whatIsOn( String shelfName ){
    	Shelf keep = new Shelf();
		switch(shelfName) {
		  case "top":
		    keep.setContains(topShelf.getContains());
		    break;
		  case "middle":
			keep.setContains(middleShelf.getContains());
		    break;
		  case "bottom":
			keep.setContains(bottomShelf.getContains());
		    break;  
		  
		  default:
		    System.err.println("No shelves matching your name criteria!");
		}
    	return keep.getContains();
    }
    
}