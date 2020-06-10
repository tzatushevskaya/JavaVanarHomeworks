public class DataFlowApp {
      public static void main(String[] args) {
    	  
    	  DataTransformer.integerToByte(129);
    	  DataTransformer.byteToInteger((byte)17);
    	  DataTransformer.doubleToInteger(200);
    	  DataTransformer.integerToDouble(4368979);
    	  DataTransformer.shortToInteger((short)17);
    	  DataTransformer.integerToShort(9879);
    	  DataTransformer.doubleToShort(1.5);
    	  
      }
  }

  class DataTransformer {

	  static byte integerToByte( int value ) {
		  if ( value >= -128 && value <=127 ) {
			  byte result = (byte) value;
			  System.out.println(result);
			  return result;
		  } 
			  else { System.err.println("WARNING! the value '10000' overflows 'byte' range. DATA was lost!");
			  return 0;}
		  }
	  
	  static int byteToInteger( byte value ) {
		  int result = (int) value;
		  System.out.println(result);
		  return result;
	  }
	  
	  static int doubleToInteger( double value ) {
		  if ( value >= -2147483648 && value <=2147483647 ) {
			  int result = (int) value;
			  System.out.println(result);
			  return result;
		  } 
				else { System.err.println("WARNING! the value '10000' overflows 'byte' range. DATA was lost!");
				return 0;}
				}
	  
	  static double integerToDouble( int value ) {
		  double result = (double) value;
		  System.out.println(result);
		  return result;
	  }
	  
	  static int shortToInteger( short value ) {
		  int result = (int) value;
		  System.out.println(result);
		  return result;
	  }
	  
	  static short integerToShort( int value ) {
		  if ( value >= -32768 && value <=32767 ) {
		  short result = (short) value;
		  System.out.println(result);
		  return result;
	  } 
		  else { System.err.println("WARNING! the value '10000' overflows 'byte' range. DATA was lost!");
		  return 0;}
	  }
	  
	  static short doubleToShort( double value ) {
		  if ( value >= -32768 && value <=32767 ) {
		  short result = (short) value;
		  System.out.println(result);
		  return result;
	  } 
		  else { System.err.println("WARNING! the value '10000' overflows 'byte' range. DATA was lost!");
		  return 0;}
	  }

}