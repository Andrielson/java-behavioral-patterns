package com.github.andrielson.strategy.worker.jobs;

import com.github.andrielson.strategy.worker.strategies.eat.MeatFoodStrategy;
import com.github.andrielson.strategy.worker.strategies.transportation.CarStrategy;
import com.github.andrielson.strategy.worker.strategies.work.DeveloperStrategy;

public class Developer implements Worker {

	@Override
	public void eat() {
		new MeatFoodStrategy().eat();
	}

	@Override
	public void move() {
		new CarStrategy().move();
	}

	@Override
	public void work() {
		new DeveloperStrategy().work();
	}

}
