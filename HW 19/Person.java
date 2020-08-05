

public class Person {
	
    private String name;
    private Person friend;

    
    public Person () {}
    
	public Person (String name) {
		this.name = name;	
	}


	public String getName() {
		return name;
	}

	public Person getFriend() {
		return friend;
	}
    
    public boolean addFriend (Person friend) {
    	if ( friend != null ) {
    		if ( friend.name.equals(this.name) ) {
    			return false;
    		} else {
    			this.friend = friend;
    			return true;
    		}
    	} else {
    		System.err.println("Error!");
    		return false;
    	}
    }
    
    public boolean removeFriend() {
    	if ( friend != null) {
		friend = null;
		return true;
    	} else {
    		return false;
    	}
    }
    
    public boolean isLonely() {
    	if (friend == null) {
    	return true;
    	} else {
    		return false;
    	}
    }
    
    String getFriendName() {
    	if ( friend != null) {
    		return friend.name;
    	} else {
    		return null;
    	}
    	}
    
}
