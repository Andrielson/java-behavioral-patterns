package com.github.andrielson.command.alexa.before;

import com.github.andrielson.command.alexa.before.alexa.Alexa;

public class Client {

	public static void main(String[] args) {
		Alexa alexa = new Alexa();
		alexa.sendRequest("Turn on the Living room light");
		alexa.sendRequest("Turn off the Kitchen light");
	}
}
