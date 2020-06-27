  public class MoneyWireApp {
      public static void main(String[] args) {
    	Solver.solve();
    	//Bank.transferFromJuridicToPhysical(500);
    	Bank.show();
      }
  }
  

  
  class Solver {
	  static void solve() {
		  
		  for(int a1=100; a1 <= 5000; a1++) {
			  
			  
			  for(int a2=100; a2 <= 5000; a2++) {
				  Bank.PhysicalPersonClient.money = 100;
				  Bank.JuridicPersonClient.money = 1000000;
				  Bank.BankScore.money = 0;
				  
				  int t1 = 40050 / a1;
				  for (int i=1; i<=t1; i++) {
					  Bank.transferFromJuridicToPhysical(a1);
					}
				  int t2 = (40050 - Bank.PhysicalPersonClient.money)/a2;
				  for (int i=1; i<=t2; i++) {
					  Bank.transferFromJuridicToPhysical(a2);					  
				  }
				  if (
					  Bank.PhysicalPersonClient.money == 39740 &&
					  Bank.JuridicPersonClient.money == 959950 &&
					  Bank.BankScore.money == 410
				  ) {
					  System.out.println("------------- SOLUTION -------------");
					  System.out.println("transfer " + t1 + " times x " + a1 + " money + " + t2 + " times x " + a2 + " money" );
					  System.out.println("------------------------------------");
					  return;
				  }
			  }
			  
			  
		  }
		  
	  }
	  
	  
  }

  class Bank {

	static class BankScore {
	    static int money = 0;
	}

    static class PhysicalPersonClient {
        static int money = 100;
    }
    static class JuridicPersonClient {
        static int money = 1000000;
    }
    
    static void transferFromJuridicToPhysical(int amount){
    	if (amount > 99 && amount < 5001) {
	    		if ((JuridicPersonClient.money-=amount) > 0) {
			    	if ( amount < 500 ) {
			    		PhysicalPersonClient.money+= amount - 10;	
			    		BankScore.money+= 10;
			    		} else {
			    		PhysicalPersonClient.money+= amount * 0.99;
			    		BankScore.money+= amount * 0.01;
			    		}
	        	} else {
	    			System.out.println("Error! Insufficient funds to perform this transaction");
	        	}	    	
	    } else {
	    	System.out.println("Error! The amount must be in range between 100 and 5000");
	    }
    	
    }
    
    static void show() {
   
		  System.out.println("Juridic Person balance: " + Bank.JuridicPersonClient.money);
		  System.out.println("Physical Person balance: " + Bank.PhysicalPersonClient.money);
		  System.out.println("Bank balance: " + Bank.BankScore.money);
    	
    }

  }
