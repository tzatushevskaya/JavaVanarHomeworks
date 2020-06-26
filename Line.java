package geometry;

public class Line {
	  // properties
	  public int startX;
	  public int endX;
	  public int startY;
	  public int endY;


	  // constructor
	  public Line(int startX,int startY,int endX,int endY) {
		  if (startX != endX || startY != endY) {
			    this.startY = startY;
			    this.startX = startX;
			    this.endX   = endX;
			    this.endY   = endY;			  
		  } else {
			  System.err.println("It's a point");
		  }

	  }      

	  public void printCoords() {
		  
				System.out.println("["+ this.startX + ":" + this.startY + "]----->["+ this.endX + ":" + this.endY + "]");
	
	  }
	  
	  public int length() {
		  int a = this.endX - this.startX;
		  int b = this.endY - this.startY;
		  double c = Math.pow(a,2) + Math.pow(b,2);
		  int l = (int)Math.sqrt(c);
		  return l;
	  }
	 
	}
