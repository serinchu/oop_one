package serin;
/*first created by programmer B*/

public class Laptop extends Product implements Networked{
//>>>>>>> branch 'master' of https://github.com/serinchu/oop_one.git
	private double totalCapacity;
	private double usedCapacity;
	
	public double getFreeCapacity(){
		return 0;
	}
	
	public void format(){
		
	}
	
	public boolean isConnected(){
		return false;
	}
	
	public double maxSpeed(){
		return 0;
	}
	
	public double getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(double totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	public double getUsedCapacity() {
		return usedCapacity;
	}

	public void setUsedCapacity(double usedCapacity) {
		this.usedCapacity = usedCapacity;
	}

	public String getName(){
		return null;
	}
}