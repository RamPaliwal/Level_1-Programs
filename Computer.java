package Level_1;

public class Computer {
	String processor;
	int RAM;
	int storage;
	public Computer(String processor,int RAM,int storage) {
		this.processor=processor;
		this.RAM=RAM;
		this.storage=storage;
	}
	public int price() {
		int price=0;
		if(RAM==4) {
			if(processor.equalsIgnoreCase("intel core")) {
				price=25000;
			}
		}
		else if(RAM==8) {
			if(processor.equalsIgnoreCase("intel core")) {
				price=40000;
			}
		}
		else if(RAM>8) {
			if(processor.equalsIgnoreCase("intel core")) {
				price=60000;
			}
		}
		if(RAM==4) {
			if(processor.equalsIgnoreCase("ryzen")) {
				price=20000;
			}
		}
		else if(RAM==8) {
			if(processor.equalsIgnoreCase("ryzen")) {
				price=30000;
			}
		}
		else if(RAM>8) {
			if(processor.equalsIgnoreCase("ryzen")) {
				price=45000;
			}
		}
		return price;
	}
	public String toString() {
		return "The processor of computer is "+processor+" and the RAM is "+RAM+"GB the storage is "+storage;
	}
	
	public static void main(String[] args) {
		Computer c=new Computer("intel core",8,256);
		System.out.println("The price is "+c.price());
		System.out.println(c);
	}
}
