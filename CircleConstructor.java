
public class CircleConstructor {

	public static void main (String[] args)  {
		
		Circle bigCircle = new Circle(11, 0, 100);
		Circle smallCircle = new Circle(0, -10, 10);
		smallCircle.print();
		System.out.println(bigCircle.area());
		
	}
	
}



class Circle {
	
	int cx;
	int cy;
	int radius;
	boolean valid;
	
	// constructor
	Circle(int pcx, int pcy, int pr) {
		
		cx = pcx;
		cy = pcy;
		if (pr>=0) {
		radius = pr;
		valid = true;
		} else {
	        System.out.println("Negative radius value is not allowed!");
	        valid = false;
		}
		
		
	}
	
	// printing logic
	void print() {
		if (valid) {
			System.out.println("###########CIRCLE###########\n"  + 
                               "RADIOUS: " + radius + "\n"       +
 				               "CENTER: " + cx + "," + cy + "\n" +
                               "#############################\n"
 				               );	
		} else {
			System.out.println(
					"########### CIRCLE (BROKEN!!!) ###########\n"
					);
		}
	}
	
	float area() {
		float area = (float) (3.14 * radius * radius);
		return area;
	}
		
}
