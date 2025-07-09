package LamdaPractice;

 

public class Cat {

	public static void main(String[] args) {
		Printable pre= (s)->{System.out.println("mewo"+s);};
		pre.print(5);
		Printable [] pre1= {
				(s)->System.out.println("mewo"+s),
				
				(p)->System.out.println("mewoo"+p)
				};
		pre1[0].print(0);
		pre1[1].print(1);
		
		 
	}

	
	}
	
 

