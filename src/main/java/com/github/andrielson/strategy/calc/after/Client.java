package com.github.andrielson.strategy.calc.after;

import com.github.andrielson.strategy.calc.after.strategies.AdditionOperation;
import com.github.andrielson.strategy.calc.after.strategies.DivisionOperation;
import com.github.andrielson.strategy.calc.after.strategies.MultiplicationOperation;
import com.github.andrielson.strategy.calc.after.strategies.SubtractionOperation;

public class Client {

	public static void main(String[] args) {
		Calculator calc = new Calculator(10, 2);
		System.out.println(calc.getResult(new AdditionOperation()));
		System.out.println(calc.getResult(new SubtractionOperation()));
		System.out.println(calc.getResult(new MultiplicationOperation()));
		System.out.println(calc.getResult(new DivisionOperation()));
	}
}
