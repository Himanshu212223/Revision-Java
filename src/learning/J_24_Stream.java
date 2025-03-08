/*
  	Flat Map in stream .:
  	flat map returns a stream of object.
  	Whenever we are using a complex structure in the collection, then, we can use flat map.
  	Map just perform the operation on the complex collection and store into another collection.
  	Flat map can store the individual element form a complex collection to a simple collection.
 */

package learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class J_24_Stream {
	public static void main(String args[]) {
		
//		Example to demonstrate the Map method.	
		
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9) ;
		
		List<Integer> list2 = list1.stream().map(n -> n+1).collect(Collectors.toList());
		
		list2.forEach(e -> System.out.print(e + " "));
		
		System.out.println();
		
		//.......................................................................................................
				
			//	Example to demonstrate the Flat-Map method.
		List<Integer> list3 = Arrays.asList(1, 2) ;
		List<Integer> list4 = Arrays.asList(3, 4) ;
		List<Integer> list5 = Arrays.asList(5, 6) ;
		
			//	we are storing the list in list here, so that we can have a complex collection.
		List< List <Integer> > finalList1 = Arrays.asList(list3, list4, list5) ;
		
			//	now, we are storing the complex list of list into simplified list.
		List <Integer> ansList = finalList1.stream().flatMap( x -> x.stream() ).collect(Collectors.toList()) ;
		
		ansList.forEach(System.out :: print);
		
		//		(1, 2, 3, 4, 5, 6, 7, 8, 9) 
		Optional<Integer> maxElement = list1.stream().max((val1, val2) -> {return val1.compareTo(val2);});
		Optional<Integer> reduced = list1.stream().reduce((val1, val2) -> {return val1+val2;});
		
		Integer maxElementfromList = maxElement.orElse(null);
		
		System.out.println("Max element is " + maxElementfromList);
		System.out.println("Reduced is " + reduced);
		
		list1 = List.of(1, 2, 3, 4, 5, 6, 7) ;
		
		System.out.println(list1);
		
		
		
	}
}
