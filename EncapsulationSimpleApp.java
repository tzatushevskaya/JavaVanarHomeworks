import java.util.Random;

public class EncapsulationSimpleApp {
	
	public static void main(String[] args) {
		
		Player myCharacter = new Player("Dorix");
		Player enemyCharacter = new Player("Dorix");
		
        //enemyCharacter.setName("");
        myCharacter.setHp(1000);
		
		System.out.println( myCharacter.getName() );
		System.out.println( myCharacter.getHp() );
		System.out.println( myCharacter.getScore() );
		System.out.println( myCharacter.isAlive() );
		
		System.out.println("---------------------");
		
		System.out.println( enemyCharacter.getName() );
		
		Medic goodMedic = new Medic("Tolean");
		Medic badMedic = new Medic("Vovan");
		
		badMedic.setHp(50);
		goodMedic.heal(badMedic);
		
		goodMedic.printInfo();
		badMedic.printInfo();		
		
			
	}

}

class Player {
	
	private static String playerNames = "";
	
	private String name;
	private int score;
	private int hp;
	private boolean alive;
	
	Player () {
		// default constructor
	}
	
	// 1) CONVENTION! 
	// 2) ENCAPSULATION! 
	Player (String name) {
		setName(name);
		setHp(100);
		setScore(0);
		setAlive(true);
	}
	
	// setters & getters
	void setName(String name) {
		if( name.trim().equals("") ) {
			
			Random r = new Random();
			int number = r.nextInt(1000);
			String formattedString = String.format("%04d", number);
			this.name = "player_" + formattedString;			
		} else {
			
			if(name.trim().length()>2 && name.trim().length()<16) {
			this.name = name;
			if(playerNames.contains(this.name)) {
				Random r = new Random();
				int number = r.nextInt(100);
				this.name += "_" + String.format("%03d", number);
			}
			} else {
				System.err.println("Error! Name must contain from 3 up to 15 characters");
			}
		}
		playerNames += "|" + this.name;
	}
	
	String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	
	public void setScore(int score) {
		if(score >=0 && score <=10000)
		this.score = score;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		if(hp >=0 && hp <=100)
			this.hp = hp;
		if(hp == 0)
			setAlive(false);		
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public void printInfo() {
		System.out.println("################################################");
		System.out.printf("%18s %3dHP %5dPOINTS ????\n", name, hp, score ); // HW1: alive -> ok, dead -> X
		System.out.println("################################################");
	}
	
	public String playerRole() {
	Class role = this.getClass();
	return role.getName();
	}
	
//    public static void main(String[] args)   
//    {   
//        Object obj = new String("JavaTpoint");   
//        Class a = obj.getClass();   
//        System.out.println("Class of Object obj is : " + a.getName());   
//    } 
}

class Medic extends Player {
	
	Medic (String name) {
		super(name);
//		setName(name);
//		setHp(100);
//		setScore(0);
//		setAlive(true);
	}
	// overload -> polymorphysm
	// self heal
	public void heal() {
		setHp(100);
	}
	
	// heal somebody else
	public void heal(Medic other) {
		other.setHp(100);
		setScore(getScore()+50);
	}
	
	// override
	public void printInfo() { // HW2: -> user super
		
		//super.printInfo();

		System.out.println("#################################################");
		System.out.printf("%18s %5s %3dHP %5dPOINTS %5s\n", playerRole(), getName(), getHp(), getScore(), (isAlive() ? "ok" : "dead") ); // HW1: alive -> ok, dead -> X
		System.out.println("#################################################");
	}
}

class Sniper extends Player {
	
	Sniper (String name) {
		super(name);
	}
	
	public void shoot(Medic other) {
		other.setHp(0);
		setScore(getScore()+50);
	}
	
}


