package javabean;

class Employee{
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
}

public class Test {

	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.setId(11);
		obj.setName("Tom");
		
		System.out.println("id="+obj.getId());
		System.out.println("name="+obj.getName());
		
		System.out.println("hello");
		
	}

}
