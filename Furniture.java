package Level_1;

public class Furniture {
	String type;
	String material;
	int price;
	int discount=0;
	public Furniture(String type,String material,int price) {
		this.type=type;
		this.material= material;
		this.price=price;
	}
	public int discount() {
		if(material.equalsIgnoreCase("wood")) {
			discount=10;
		}
		else if(material.equalsIgnoreCase("metal")) {
			discount=15;
		}
		else if(material.equalsIgnoreCase("plastic")) {
			discount=20;
		}
		else {
			discount=25;
		}
		return discount;
	}
	public String toString() {
		int discounted=(price*discount)/100;
		int discounted_price=price-discounted;
		return "The furniture type is "+type+" and the material used is "
				+material+" and the price is "+price+"\n"+" The discount is "+discount
				+"% and the discounted price is "+discounted_price;
	}
	public static void main(String[] args) {
		Furniture f=new Furniture("Chair","wood",1200);
		f.discount();
		System.out.println(f);
	}
}
