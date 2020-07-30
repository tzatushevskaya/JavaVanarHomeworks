package robo;

public class RobotFactory {
	
	public static AbstractRobot getRobot(String model, String name) {
		
	      if(model.equals("alpha")){
	         return new AlphaRobot();
	         
	      } else if(model.equals("beta")){
	         return new BetaRobot(model, name);
	         
	      } else if(model.equals("charlie")){
	         return new CharlieRobot(model, name);
	      } else return null;
	   }
	}
