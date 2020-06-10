  public class DataWrapApp {
      public static void main(String[] args) {
    	  
    	  System.out.println(DataWrapper.wrapRound("example"));
    	  System.out.println(DataWrapper.wrapRound(78));
    	  System.out.println(DataWrapper.wrapRound((double)120));
    	  System.out.println(DataWrapper.wrapRound('a'));
    	  System.out.println(DataWrapper.wrapSquare("example"));
    	  System.out.println(DataWrapper.wrapSquare(79));
    	  System.out.println(DataWrapper.wrapSquare((double)120.89));
    	  System.out.println(DataWrapper.wrapSquare('b'));
    	  System.out.println(DataWrapper.wrapAngle("example"));
    	  System.out.println(DataWrapper.wrapAngle(80));
    	  System.out.println(DataWrapper.wrapAngle((double)-120.005));
    	  System.out.println(DataWrapper.wrapAngle('%'));
      }
  }

  class DataWrapper {
	  
	  static String wrapRound( String text ) {
		  return "(" + text + ")";
		}
	  
	  static String wrapRound( int value ) {
		  return "(" + value + ")";
		}
	  
	  static String wrapRound( double value ) {
		  return "(" + value + ")";
		}
	  
	  static String wrapRound( char value ) {
		  return "(" + value + ")";
		}
	  
	  static String wrapSquare( String text ) {
		  return "[" + text + "]";
		}
	  
	  static String wrapSquare( int value ) {
		  return "[" + value + "]";
		}
	  
	  static String wrapSquare( double value ) {
		  return "[" + value + "]";
		}
	  
	  static String wrapSquare( char value ) {
		  return "[" + value + "]";
		}
	  
	  static String wrapAngle( String text ) {
		  return "<" + text + ">";
		}
	  
	  static String wrapAngle( int value ) {
		  return "<" + value + ">";
		}
	  
	  static String wrapAngle( double value ) {
		  return "<" + value + ">";
		}
	  
	  static String wrapAngle( char value ) {
		  return "<" + value + ">";
		}
  }
