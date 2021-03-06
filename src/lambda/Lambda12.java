package lambda;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.IntBinaryOperator;

public class Lambda12 {

	public static void main(String[] args) {
		// BiPredicate: Predicate accepts just one argument and returns boolean, BiPredicate accepts two arguments and returns boolean
		BiPredicate<Integer, Integer> biPredicate = (t,u) -> { return t==u*u;}; // If you use more than one argument, parenthesis is mandatory
		System.out.println(biPredicate.test(9, 3)); //For predicate use test()
		
		//BiFunction: Function accepts just one argument and returns a value, BiFunction accepts three arguments, 1st and 2nd are input
		//            3rd is output
		BiFunction<Integer, String, String> biFunction = (t,u) -> { return u + t; }; 
		System.out.println(biFunction.apply(8, "Lamda"));//For predicate use apply()
		
		//BiConsumer: Function accepts two arguments as input and returns nothing (void)
		BiConsumer<String, String> biConsumer = (t,u) -> {System.out.println(t + " ==> " + u);};
		biConsumer.accept("Bi", "Consumer");//For predicate use accept()
		
		//Primitive Functions: if you want to work with primitive data, use Primitive functions
		//                     When we work with list and stream, we use object of Wrapper classes
		//IntPredicate - IntBinaryOperator - IntConsumer - IntFunction - IntSupplier - IntUnaryOperator - IntToDoubleFunction - IntToLongFunction - ...
		IntBinaryOperator intBinaryOperator = (t, u) -> t+u;
		System.out.println(intBinaryOperator.applyAsInt(5, 9));
	}

}
