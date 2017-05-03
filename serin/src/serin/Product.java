package serin;
/*first created by leader*/
public abstract class Product {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public abstract String getName();
}
