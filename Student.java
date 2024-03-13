package Level_1;

public class Student {
	String name;
	int age;
	int id;
	public Student(String name,int age,int id) {
		this.name=name;
		this.age=age;
		this.id=id;
	}
	public void printname() {
		System.out.println("Student name is "+name);
	}
	public void age() {
		System.out.println("Student age is "+age);
	}
	public static void main(String[] args) {
		Student s1 = new Student("Anil",16,01);
		s1.printname();
		Student s2 = new Student("Jayesh",16,02);
		s2.printname();
		s2.age();
	}
}
