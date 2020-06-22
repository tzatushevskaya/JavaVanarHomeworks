  // main class
  public class MoneyWireApp {
      public static void main(String[] args) {
    	  
//    	  Bank.transferFromJuridicToPhysical(3990);
//    	  Bank.transferFromJuridicToPhysical(3990);
//    	  Bank.transferFromJuridicToPhysical(3990);
//    	  Bank.transferFromJuridicToPhysical(3990);
//    	  Bank.transferFromJuridicToPhysical(3990);
//    	  Bank.transferFromJuridicToPhysical(3990);
//    	  Bank.transferFromJuridicToPhysical(3990);
//    	  Bank.transferFromJuridicToPhysical(3990);
//    	  Bank.transferFromJuridicToPhysical(3990);
//    	  Bank.transferFromJuridicToPhysical(3990);
//    	  Bank.transferFromJuridicToPhysical(150);
    	  Bank.transferFromJuridicToPhysical(4000);
    	  Bank.transferFromJuridicToPhysical(4000);
    	  Bank.transferFromJuridicToPhysical(4000);
    	  Bank.transferFromJuridicToPhysical(4000);
    	  Bank.transferFromJuridicToPhysical(4000);
    	  Bank.transferFromJuridicToPhysical(4000);
    	  Bank.transferFromJuridicToPhysical(4000);
    	  Bank.transferFromJuridicToPhysical(4000);
    	  Bank.transferFromJuridicToPhysical(4000);
    	  Bank.transferFromJuridicToPhysical(1000);
    	  Bank.transferFromJuridicToPhysical(1000);
    	  Bank.transferFromJuridicToPhysical(1000);
    	  Bank.transferFromJuridicToPhysical(150);

      }
  }

  // secondary class
  class Bank {

    static int money = 0;

    static class PhysicalPersonClient {
        static int money = 100;
    }
    static class JuridicPersonClient {
        static int money = 1000000;
    }
    
    static void transferFromJuridicToPhysical(int amount){
    	if (amount > 99 && amount < 5001) {
	    	for ( int i = amount; i < 5001; i++) {
	    		if ((JuridicPersonClient.money-=amount) > 0) {
			    	if ( amount < 500 ) {
			    		PhysicalPersonClient.money+= amount - 10;	
			    		money+= 10;
			    		} else {
			    		PhysicalPersonClient.money+= amount * 0.99;
			    		money+= amount * 0.01;
			    		}
		    		i = 5001;
	        	} else {
	    			System.out.println("Error! Insufficient funds to perform this transaction");
		    		i = 5001;
	        	}
	    	}
		  System.out.println(Bank.JuridicPersonClient.money);
		  System.out.println(Bank.PhysicalPersonClient.money);
		  System.out.println(Bank.money);
	    } else {
	    	System.out.println("Error! The amount must be in range between 100 and 5000");
	    }
    	
    }

  }
