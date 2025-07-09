package OOP;

public class Encapsulation {
 
	
	private String name;
	private String Hobby;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHobby() {
		return Hobby;
	}
	public void setHobby(String hobby) {
		Hobby = hobby;
	}
	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setName("Pranav Neupane");
		e.setHobby("Coding");
		System.out.println("The name is"+e.getName());
		System.out.println("The hobby is"+e.getHobby());
		
	}
	
}
