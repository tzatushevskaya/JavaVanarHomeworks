import java.util.ArrayList;

public class HwSplStringSw {

	public static void main (String[] args) {
		
		ArrayList <String> devs = new ArrayList<> (); 
		  // 1.      ^^^^ ??? 
		  // adding data to the list
		  devs.add("Johny");
		  devs.add("Valerya");
		  devs.add("Tatyana");
		  devs.add("Peter");
		  devs.add("Mary");
		  
		  
		  // showing the initials, use "charAt(index)" from "String" class
		  for (String dev : devs) {
			  System.out.println(devs.indexOf(dev) + 1 + ".   \"" + dev.charAt(0) + ".\"");
		}

		  // the longest name, use "length()" from "String" class
		  int maxLength = 0;
		  for (String dev : devs) {
			if (dev.length()>maxLength) {
				maxLength = dev.length();
			}
			
		}
		  for (String dev : devs) {
			if (dev.length()==maxLength) {
				 System.out.println(dev);
			}
			
		}
		 

		  // swap last and first values
		  String temp;
		  temp = devs.get(0);
		  devs.set(0,  devs.get(devs.size() - 1));
		  devs.set((devs.size() - 1),  temp);		 
		  
	}
	
}
