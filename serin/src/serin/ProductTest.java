package serin;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product P = new Product();
		
		DataStorage D = new DataStorage();
		
		Cooker C = new Cooker();
		
		Networked N = new Networked();
		
	}
	
	public void testProduct(Product P){
		System.out.println("This method is testProduct");
	}
	
	public void testDataStorage(DataStorage D){
		System.out.println("This method is testDataStorage");
	}
	
	public void testNetworked(Networked N){
		System.out.println("This method is testNetworked");
	}
	
	public void testCooker(Cooker C){
		System.out.println("This method is testCooker");
	}
	
	

}
