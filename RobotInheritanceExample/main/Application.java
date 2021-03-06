package main;

import robo.AlphaRobot;
import robo.BetaRobot;
import robo.CharlieRobot;
import robo.RobotFactory;
import tests.ChargeTest;
import tests.DiagonalWalkTest;
import tests.SimpleTest;

public class Application {

	public static void main (String[] args) {
		
//		System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new AlphaRobot("Robik","alpha") ) );
 		System.out.printf( "Simple test passed %d%%\n", ChargeTest.runCase( new BetaRobot("Robik","beta") ) );
		System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( new CharlieRobot("First","charlie") ) );
		System.out.printf( "Simple test passed %d%%\n", ChargeTest.runCase( new CharlieRobot("Second","charlie") ) );
		System.out.printf( "Simple test passed %d%%\n", DiagonalWalkTest.runCase( new CharlieRobot("Third","charlie") ) );
		
		System.out.printf( "Simple test passed %d%%\n", SimpleTest.runCase( RobotFactory.getRobot("alpha", "Robik")));
	}
}
