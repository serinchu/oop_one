package serin;

public class SmartTV extends Product {

	int channel;
	
	public boolean isConnected(){
		
		System.out.println("This method is isConnected()");
		return true;
	}
	
	public double maxSpeed(){
	
		System.out.println("This method is maxSpeed()");
		return 0;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	

}
