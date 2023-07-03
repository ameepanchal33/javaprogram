package basic;
import java.util.Scanner;
class member{
	private String name;
	private int age;
	private double phoneno;
	private String adress;
	private long Salary;
		public member(String name,int age,int phoneno,String adress,long Salary) {
			this.name=name;
			this.age=age;
			this.phoneno= phoneno;
			this.adress=adress;
			this.Salary=Salary;
		}
		public void printSalary() {
			System.out.println("name:"+name+"  salry:"+Salary);
		}
	
}
public class Assign25 {
	public static void main(String[] args) {
	member member1=new member("Amee",21,456255625,"ahmedabad",500000);
	member1.printSalary();
	member member2=new member("Prerna",22,789561536,"ahmedabad",600000);
	member2.printSalary();
	}

}
