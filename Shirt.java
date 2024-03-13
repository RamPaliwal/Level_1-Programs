package Level_1;

public class Shirt {
	String size;
	String colour;
	int price;
	int discount=0;
	public Shirt(String size,String colour,int price) {
		this.size=size;
		this.colour=colour;
		this.price=price;
	}
	public int discount() {
		if(size.equalsIgnoreCase("XS")) {
			discount=20;
		}
		else if(size.equalsIgnoreCase("S")) {
			discount=15;
		}
		else if(size.equalsIgnoreCase("M")) {
			discount=15;
		}
		else if(size.equalsIgnoreCase("L")) {
			discount=10;
		}
		else {
			discount=10;
		}
		return discount;
	}
	public String toString() {
		int discounted=(price*discount)/100;
		int discounted_price=price-discounted;
		return "The size of shirt is "+size+" and the colour is "
				+colour+" and the price is "+price+"\n"+" The discount is "+discount
				+"% and the discounted price is "+discounted_price;
	}
	public static void main(String[] args) {
		Shirt s=new Shirt("M","black",600);
		s.discount();
		System.out.println(s);
	}
}
