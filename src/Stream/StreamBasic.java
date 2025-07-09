package Stream;

import java.security.Identity;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StreamBasic {
	
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(4,5,7,6,8);
		
		list.forEach(n -> System.out.println(n));
		
		//starting stream
		
	 Stream <Integer>st=list.stream();
	 
	  Stream<Integer> DoubleValue=st.map(n ->n*n);
	  
	  DoubleValue.forEach((n)->System.out.println(n));
	  
	  
	 
	 
     //Stream <Integer>shortedData=st.sorted();
	 
	 //st.shorted() gives Stream as a written type;
     // shortedData.forEach(n -> System.out.println(n));
     
	 
	 //System.out.println(st.count());
	 //cannot use the stream twice because its already consumed!!!
	 //st.forEach(n -> System.out.println(n));
	  
	  List<Integer> number=Arrays.asList(0,4,2,5,3);
	  Predicate<Integer> predi= (Integer n) ->{
		  return n%2==0;
	  };
	  //Filter has a Predicate which is a FUNCTIONAL INTERFACE that has a fuctions that returns Boolean value.
	  
	  
	  
	  // example using lamda function with predicate 
	  
	  number.stream().filter(predi) 
      .sorted()// It will 
      .map(n ->n*n)
      .forEach((n)->System.out.println(n));

	  //example of directly using filter with out specifying  Lambda Function separately 
	  
	  number.stream().filter(n-> n%2==1) //Filter has a Predicate which is a FUNCTIONAL INTERFACE that has a fuctions that returns Boolean value.
	                 .sorted()// It will 
	                 .map(n ->n*n)
	                 .forEach((n)->System.out.println(n));
	  
	  
	  //Reduce
	  
	  
	  int result=number.stream().filter(n-> n%2==1) //Filter has a Predicate which is a FUNCTIONAL INTERFACE that has a functions that returns Boolean value.
	                 .sorted()// It will short the stream
	                 .map(n ->n*2)
	                  
	                 .reduce(0, (c,e)->c+e);
		 System.out.println(result);

	   number.stream().filter(n-> n%2==1) //Filter has a Predicate which is a FUNCTIONAL INTERFACE that has a fuctions that returns Boolean value.
	                 .sorted()// It will 
	                 .map(n ->n*n)
	                 .collect(Collectors.toList())
	                 .forEach(n -> System.out.println(n));
	  

	                  
	  
	 
		
		
	}
	
	

}
