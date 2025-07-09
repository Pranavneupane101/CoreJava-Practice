package OOP;

public class Child2 extends BaseClass {
 
	  public String teacherName;
	  public String subject;
	
	public void print() {
		System.out.println("The teacher name is:"+teacherName);
		System.out.println("The teacher teaches "+subject);
		super.print();
	}
	
}
