package Level_1;

public class Circle {
	float radius;
	public Circle(float r) {
		this.radius=r;
	}
	public float Area() {
		float area = (float) Math.PI*radius*radius;
		return area;
	}
	public double Circumference() {
		double circum =  2*Math.PI*radius;
		return circum;
	}
	public static void main(String[] args) {
		Circle c1=new Circle(25);
		System.out.println(c1.Area());
		System.out.println(c1.Circumference());
	}
}
