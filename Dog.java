package Level_1;

public class Dog {
	String breed;
	int age;
	int weight;
	public Dog(String breed,int age,int weight) {
		this.breed=breed;
		this.age=age;
		this.weight=weight;
	}
	public double age_in_human_years() {
		double ageinhuman = 16*Math.log(age)+31;
		return ageinhuman;
	}
	public String print_dog_info() {
		return "Dog's breed is "+breed+" and the age is "+age+" and the weight is "+weight;
	}
	public static void main(String[] args) {
		Dog d1 = new Dog("German Shepherd",5,20);
		System.out.println(d1.breed+" age in human years is "+d1.age_in_human_years());
	}
}
