package serin;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductTest P = new ProductTest();
		
		Product t = new Toaster();
		
		Product s = new SmartTV();
		
		Product l = new Laptop();
		
		P.testProduct(t);
		P.testCooker((Cooker) t);
		P.testDataStorage((Laptop) l);
		
	}
	
	public void testProduct(Product t){
		System.out.println("This method is testProduct");
	}
	
	public void testDataStorage(Laptop l){
		System.out.println("This method is testDataStorage");
		l.format();
		if(l.isConnected()) System.out.println("Connection is succesful!");
		l.maxSpeed();
		l.setTotalCapacity(100);
		System.out.println("Laptop's total capacity is "+l.getTotalCapacity());
		l.getName();
	}
	
	public void testNetworked(Networked N){
		System.out.println("This method is testNetworked()");
	}
	
	public void testCooker(Cooker C){
		System.out.println("This method is testCooker()");
	}
	
	

}
