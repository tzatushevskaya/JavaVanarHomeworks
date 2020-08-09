package main;

public class ProductArraySortExampleApp {
	
	public static void main(String[] args) {
		
	   Product[] products = {
				new Product("Pizza", 75, 5),
				new Product("Salad", 25, 4),
				new Product("Coffee", 45, 2),
		};
		
		
		Product.sort(products);
		
		
		
		for (Product product : products) {
			System.out.println(product);
		}
				

		
	}

}


///////////////////
class Product {

	private String name;
	private int price;
	private int rating;
	static Product temp;
	static boolean swapped;
	
	
	public Product(String name, int price, int rating) {
		setName(name);
		setPrice(price);
		setRating(rating);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		if (name.length() < 2) {
			System.err.println("The name is too short");
		} else {
		this.name = name;
		}
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		if ( price < 0 && price >= 1000) {
			System.err.println("The price value is out of range");
		} else {
		this.price = price;
		}
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		if ( rating < 0 && rating >= 5) {
			System.err.println("The rating value is out of range");
		} else {
		this.rating = rating;
		}
	}
	
	public static void sort(Product[] array) {
		for (int j=0; j < array.length; j++) {
			for (int i=0; i < array.length - 1; i++) {
				if (array[i].getPrice() == array[i+1].getPrice()) {
					if (array[i].getRating() > array[i+1].getRating()) {
						swap(array, i);
					} else if (array[i].getPrice() > array[i+1].getPrice())
					swap(array, i);
				}
			}
			if (swapped = false) break;
		}
		
	}
	
	public static void swap(Product[] array, int i) {
		temp = array[i];
		array[i] = array[i+1];
		array[i+1]= temp;
		swapped = true;
	}
	
}
