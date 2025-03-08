package learning;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
	Functional Interface :- 
________________________________________

- Functional Interface is a special case of Regular Interface.
- An Interface having only 1 abstract method is Functional Interface.
- Default methods can be 1 or more in Functional Interface.



Lambda Expression :-
_______________________________

It is an important feature of Functional Programming.
The arrow " -> " is called as Lambda expressions, and enables a 
method to be passed as argument to other methods.

Now, How Functional Interface works with Lambda Expression ....?
_________________________________________________________________________________

- Firstly, we have to make an abstract method in the Functional Interface.
- Then, in the main function, we have to define the work of that abstract method.
- Then, we have to call that method through Interface name.

*/



@FunctionalInterface
interface MyPrinter {

	//	automatically becomes abstract method.
	public void printing();

	// Default method of Functional Interface.
	public default void getDetails() {
		System.out.println("Hii.., I am default method of Functional Interface");
	};
};


@FunctionalInterface
interface GetOneNumber {

	public int getNumber(int numb);

};

@FunctionalInterface
interface GetTwoNumberSum {

	public int getNumber2NumberSum(int numb1, int numb2);

};

@FunctionalInterface
interface Replica {

	public String getStatement(String sentence, int numb1, int numb2);

};

public class J_15_Functional_Interface_and_Lambda_Expression {

	public static void main(String args[]) {

		// ------- here, defining the work of abstract method -----------
		MyPrinter print = () -> System.out.println("Print this.");

		GetOneNumber getNumb1 = (int a) -> {
			return a;
		};

		GetTwoNumberSum getNumb2 = (int a, int b) -> {
			return a + b;
		};

		Replica getReplica = (String words, int a, int b) -> {
			return "The sentence given by User are " + words + "and, the numbers are " + a + " and " + b;
		};

		// -------- Now, calling the methods of Interface ----------------
		print.printing();
		System.out.println(getNumb1.getNumber(5));
		System.out.println(getNumb2.getNumber2NumberSum(2, 5));
		System.out.println(getReplica.getStatement("Passing numbers, ", 5, 8));

		// -----------------------------------------------------------------
		// Built-In Functional Interface
		// -----------------------------------------------------------------

		// this take a number, and return a number after performing some operation on
		// that number.
		Function<Long, Long> addNumber = (value) -> value + 5;
		System.out.println(addNumber.apply((long) 5));

		// this will take a input, and return true or false.
		Predicate<Integer> checkAge = (age) -> age > 18;
		System.out.println(checkAge.test(20));

		// this gives output without taking any input.
		Supplier<Integer> generateRandom = () -> new Integer((int) (Math.random() * 100));
		System.out.println(generateRandom.get());

		// this consumes the input and does not return anything.
		Consumer<String> printValue = (name) -> System.out.println(name);
		printValue.accept("Store this as input. ");

	}
}
