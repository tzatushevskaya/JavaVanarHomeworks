
public class MoneyAccumulator {

    public static void main(String[] args) {
    	
    	int[] shareholders = {100, 200, 300};
    	int expenses = 45;
    	
    	AllInOne.show(shareholders, expenses);
    	//v2
    	AnotherSolution.show(shareholders, expenses);  	  
    }
	
}

class Equation {
	  
	  static int balance( int a[], int b ) {
		  int s = 0;
		  for (int i = 0; i < a.length; i++) {
			  s+= a[i];
			}
		  return s - b;
		}
	 
	 static void show ( int a[] ) {
		  System.out.println("  " + a[0] + "MDL");
		  for (int i = 1; i < a.length; i++) {
			  System.out.println("+ " + a[i] + "MDL");
			}
		  System.out.println("--------");
		}
	  
	  static void show ( int a ) {
		  System.out.println("- " + a + "MDL");
		}
	  
	  static void show ( int shareholders[], int expenses ) {
		  System.out.println("  " + balance(shareholders, expenses) + "MDL");		
		}
	  
}

class AllInOne {
	  
	  static void show ( int shareholders[], int expenses ) {		  
		  	Equation.show(shareholders, expenses);
	    	Equation.show(shareholders);
	    	Equation.show(expenses);
		}
	  
}

class AnotherSolution {
	
	  static void show( int a[], int b ) {
		  int s = 0;
		  for (int i = 0; i < a.length; i++) {
			  s+= a[i];
			}
		  s-= b;
		  System.out.println("  " + s + "MDL");
		  System.out.println("  " + a[0] + "MDL");
		  for (int i = 1; i < a.length; i++) {
			  System.out.println("+ " + a[i] + "MDL");
			}
		  System.out.println("--------");
		  System.out.println("- " + b + "MDL");
		}	
}
