package basic;
class emp{
	private int id;
	private String name;
	private int salary;
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
	   this.name=name;	
	}
	public String getName() {
		return name;
	}
	public void setSalary(int salary) {
		this.salary=salary;
	}
	public int getSalary() {
		return salary;
	}
	public String toString() {
		return "id"+id+"name:"+name+"Salary:"+salary;
	}

}

public class Encpsulation {
	public static void main(String[] args) {
		emp e1=new emp();
		e1.setId(45);
		e1.setName("amee");
		e1.setSalary(400000);
		
		System.out.println(e1);
	}
	

	
}
