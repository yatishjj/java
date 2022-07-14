package stream.Lambda;

import java.util.function.BiFunction;

public class ArithamaticPrograms {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> funcAdd = (i1, i2) -> i1+i2;
		System.out.println(funcAdd.apply(10, 20));
		
		BiFunction<Integer,Integer,Integer> funcSub = (i1, i2) -> i1-i2;
		System.out.println(funcSub.apply(10, 20));

		BiFunction<Integer,Integer,Integer> funcMulti = (i1, i2) -> i1*i2;
		System.out.println(funcMulti.apply(10, 20));

		BiFunction<Integer,Integer,Integer> funcDivide = (i1, i2) -> i1/i2;
		System.out.println(funcDivide.apply(10, 20));

	}
}
