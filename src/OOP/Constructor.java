package OOP;

public class Constructor {

	String name;
	int rollNum;
 
	Constructor(){
		name="Pranav Neupane";
		rollNum=57;
	}
	Constructor(String x,int a){
		this.name=x;
		this.rollNum=a;
	}
	void info() {
		System.out.println("The Name of the Student is:"+name);
		System.out.println("Students Roll number is:"+rollNum);
	}
public static void main(String[] args) {
	Constructor c1=new Constructor();
	c1.info();
	Constructor c2=new Constructor("Pranish Neupane",04);
	c2.info();
}	
}
