package tests;

import robo.BetaRobot;

public class ChargeTest {
    public static int runCase(BetaRobot robot){
        int percentage = 0;    

        robot.setCharge(-100);
        if( robot.getCharge() < (byte)0 ) {
            System.err.println("Charge test failed\nREASON: Values less than 0 not allowed!");
            return percentage;
        }
        percentage+=20;
        
        robot.setCharge(1000);
        if( robot.getCharge() > (byte)100 ) {
            System.err.println("Charge test failed\nREASON: Values more than 100 not allowed!");
            return percentage;
        }
        percentage+=20;

        robot.setCharge(50);
        while (robot.moveRight()) {
        	robot.moveRight();
        }
        if( robot.getCharge() < 4 ) {
            System.err.println("Charge test failed\nREASON: Robot did not stop when low battery!");
            return percentage;
        }
        percentage+=60;
        
        return percentage;
    }
    
}
