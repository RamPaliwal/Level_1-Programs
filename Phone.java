package Level_1;

public class Phone {
	String make;
	String model; 
	int storage_in_gb;
	public Phone(String make,String model,int storage) {
		this.make=make;
		this.model=model;
		this.storage_in_gb=storage;
	}
	public int cost() {
		int cost=0;
		if(make.equalsIgnoreCase("iphone")) {
			if(storage_in_gb==32) {
				cost=35000;
			}
			else if(storage_in_gb==64) {
				cost=50000;
			}
			else {
				cost=80000;
			}
		}
		else if(make.equalsIgnoreCase("samsung")) {
			if(storage_in_gb==32) {
				cost=15000;
			}
			else if(storage_in_gb==64) {
				cost=22000;
			}
			else {
				cost=50000;
			}
		}
		else {
			if(storage_in_gb==32) {
				cost=12000;
			}
			else if(storage_in_gb==64) {
				cost=18000;
			}
			else {
				cost=30000;
			}
		}
		return cost;
	}
	public String toString() {
		return "The make is "+make+" and the model is "+model+" with storage "+storage_in_gb+"GB";
	}
	public static void main(String[] args) {
		Phone ip = new Phone("iPhone","11pro",64);
		System.out.println(ip.cost());
		System.out.println(ip);
	}
}
