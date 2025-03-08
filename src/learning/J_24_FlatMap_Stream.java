package learning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Students{
	public String name ;
	public int standard ;
	
	Students(){}
	
	Students(String name, int standard){
		this.name = name ;
		this.standard = standard ;
	}
}

public class J_24_FlatMap_Stream {
	public static void main(String args[]) {
		
//		suppose, we have a collection as :		
		List<Integer> arrayList = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9) ;
		
		//..............................................................................................
			//	Lets practice filter with stream.
		
			//	now, suppose we want to store odd elements from the above collection into another collection.
		List<Integer> oddList1 = new ArrayList<>();
		
			//	ok, now, add the arrayList to stream, then apply the filter, then, make it ready to get collected into oddList1.
		oddList1 = arrayList.stream().filter((n)-> (n%2==1)).collect(Collectors.toList()) ;
		
			//	to print the content
		oddList1.forEach((n) -> {System.out.print(n);  }	); 
		
		
		
		//..............................................................................................
			//	Lets practice Map with stream.
		
			//	suppose, we want to store square of every element.
		List<Integer> squareList = new ArrayList<>();	//	making a collection where result after mapping will be stored.
		squareList = arrayList.stream().map(n->n*n).collect(Collectors.toList());
		
		squareList.forEach(e -> System.out.println(e));
		
		
		
		
		//................................................................................................
			//	Lets try to store the data of List into set.
		
		List <Integer> list = List.of(1, 1, 1, 2, 3, 4, 5, 2, 5, 8, 9);
		Set <Integer> set = new HashSet<Integer>();
		
		set = list.stream().map(n -> n).collect(Collectors.toSet());
		
		set.forEach(n -> System.out.print(n));
	}
}
