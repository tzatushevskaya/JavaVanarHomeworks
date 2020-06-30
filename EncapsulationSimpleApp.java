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
			
	}

}

class Player {
	
	private static String playerNames = "";
	
	private String name;
	private int score;
	private int hp;
	private boolean alive;
	
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

}


