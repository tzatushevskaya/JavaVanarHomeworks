package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class HWStore {

	public static void main(String[] args) {
		
		  // CLIENT WISHES
		  ArrayList<String> listOfWishes = (ArrayList<String>)Arrays.asList( 
		    "Spaghetti,2", 
		    "Pepper,5",
		    "Sugar,1"
		  ); 
		  

		  // STORE OFFERS
		  ArrayList<String> listOfOffers = (ArrayList<String>)Arrays.asList( 
		    "Spaghetti,10.00", 
		    "Sugar,5.00",
		    "Water,2.50"
		  ); 
		  // ???
		  
			
//		    List<List<String>> listOfWishes = new ArrayList<List<String>>();
//		    listOfWishes.add((List<String>) Arrays.asList(
//		    		"Spaghetti,2", 
//				    "Pepper,5",
//				    "Sugar,1"
//		    		));
		  
//		    List<List<String>> listOfOffers = new ArrayList<List<String>>();
//		    listOfWishes.add((List<String>) Arrays.asList(
//				    "Spaghetti,10.00", 
//				    "Sugar,5.00",
//				    "Water,2.50"
//		    		));
		  
		  // CLIENT FULFILLED WISHES
		  ArrayList<String> listOfPurchases = new ArrayList<>();
		  // ???
		  for (String wish : listOfWishes) {
			  String desiredProperties[] = wish.split(",");
			  Product desiredProduct = new Product(desiredProperties[0],Integer.parseInt(desiredProperties[1]));
			  for (String offer : listOfOffers) {
				  String availableProperties[] = offer.split(",");
				  Product availableProduct = new Product(availableProperties[0],Double.parseDouble(availableProperties[1]));
				if (desiredProduct.equals(availableProduct)) {
					listOfPurchases.add((new Product (desiredProduct.getName(), desiredProduct.getQuantity(), availableProduct.getPrice())).toString());
				}
			  }
		  }		  

		  // 0 -> "Spaghetti,2=20.00"
		  // 1 -> "Sugar,1=5.00"
		  
		  printArrayList(listOfPurchases);
		
	}
	  
	public static void printArrayList(ArrayList<String> listOfPurchases) {
		int index = 0;
		System.out.println("############################");
		for (String purchase : listOfPurchases) {
			System.out.println("[" + index + "] ==> " + purchase);
			index++;
		}
		System.out.println("############################\n");
	}
	
}

class Product {
	
	private String name;
	private int quantity;
	private double price;
	
	public Product(String name, int quantity, double price ) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public Product(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return name + ", " + quantity + "=" + price * quantity;
	}
	
	@Override
	public boolean equals(Object obj) {
		return 
				name.equals(((Product)obj).getName());
	}

}

