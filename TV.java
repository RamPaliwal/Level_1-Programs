package Level_1;

public class TV {
	String brand;
	int size_in_inch;
	int price;
	public TV(String brand,int size,int price) {
		this.brand=brand;
		this.size_in_inch=size;
		this.price=price;
	}
	public int discount() {
		int discount=0;
		if(size_in_inch>=24 && size_in_inch<=32) {
			discount=1000;
		}
		else if(size_in_inch>32 && size_in_inch<=48) {
			discount=2000;
		}
		else if(size_in_inch>48 && size_in_inch<=65) {
			discount=3000;
		}
		else if(size_in_inch>65) {
			discount=5000;
		}
		return discount;
	}
	public String toString() {
		return "The brand of TV is "+brand+" and the size is "+size_in_inch+" inch and price is "+price;
	}
	public static void main(String[] args) {
		TV samsung = new TV("Samsung",24,10000);
		System.out.println("The discount is Rs "+samsung.discount());
		System.out.println(samsung);
	}
}
