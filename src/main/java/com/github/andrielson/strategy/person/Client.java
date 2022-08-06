package com.github.andrielson.strategy.person;

import com.github.andrielson.strategy.person.strategies.work.DeveloperStrategy;
import com.github.andrielson.strategy.person.strategies.work.NoWorkStrategy;
import com.github.andrielson.strategy.person.strategies.work.PilotStrategy;
import com.github.andrielson.strategy.person.strategies.eat.MeatFoodStrategy;
import com.github.andrielson.strategy.person.strategies.eat.VeggieFoodStrategy;
import com.github.andrielson.strategy.person.strategies.transportation.AirplaneStrategy;
import com.github.andrielson.strategy.person.strategies.transportation.BikeStrategy;
import com.github.andrielson.strategy.person.strategies.transportation.CarStrategy;
import com.github.andrielson.strategy.person.strategies.transportation.WalkStrategy;

public class Client {

	public static void presentYourself(Person person) {
		System.out.println("Hi, I'm " + person.getName());
		person.eat();
		person.move();
		person.work();
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		Person jhon = new Person("Jhon", new MeatFoodStrategy(), 
				new CarStrategy(), new DeveloperStrategy());
		presentYourself(jhon);
		
		Person ann = new Person("Ann", new MeatFoodStrategy(), 
				new AirplaneStrategy(), new PilotStrategy());
		presentYourself(ann);
		
		Person carol = new Person("Carol", new VeggieFoodStrategy(), 
				new BikeStrategy(), new DeveloperStrategy());
		presentYourself(carol);
		
		Person alan = new Person("Alan", new VeggieFoodStrategy(), 
				new WalkStrategy(), new NoWorkStrategy());
		presentYourself(alan);
	}
}
