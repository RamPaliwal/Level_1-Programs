package Level_1;

public class Employee {
	String name;
	int salary;
	int id;
	public Employee(String nm,int sl,int id) {
		this.name=nm;
		this.salary=sl;
		this.id=id;
	}
	public int Calculate_Yearly_Salary() {
		return salary*12;
	}
	public void print_name_salary() {
		System.out.println("Employee name is "+name+" and the salary is "+salary);
	}
	public static void main(String[] args) {
	Employee e1 = new Employee("Arun",25000,2001);
	e1.print_name_salary();
	System.out.println(e1.name+"'s yearly salary is "+e1.Calculate_Yearly_Salary());
	
	}
}
