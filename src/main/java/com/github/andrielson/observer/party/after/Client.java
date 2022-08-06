package com.github.andrielson.observer.party.after;

import com.github.andrielson.observer.party.after.observers.Friend;
import com.github.andrielson.observer.party.after.observers.Wife;
import com.github.andrielson.observer.party.after.subject.Doorman;

public class Client {

	public static void main(String[] args) {
		Doorman doorman = new Doorman();
		doorman.add(new Wife());
		doorman.add(new Friend());
		
		System.out.println("Husband is comming");
		doorman.setStatus(true);
	}
}
