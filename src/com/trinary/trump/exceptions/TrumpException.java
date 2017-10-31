package com.trinary.trump.exceptions;

import java.util.Random;

public class TrumpException extends Exception {
	private static final long serialVersionUID = 1L;
	private static Random r = new Random();
	
	private static String[] suffixes = {
			"It's going to be huge.",
			"I sort of get away with things like that.",
			"That makes me smart.",
			"Let me tell ya, I'm a really smart guy."
	};
	
	private static String[] templates = {
			"Show me a %s without an ego, and I'll show you a loser.",
			"My %ss are the best.",
			"I'm going to make %ss great again.",
			"Nobody respects %ss more than I do.",
			"Grab'em by the %s.",
			"Look at my %s over here.",
			"We're going to build a wall, to keep out %ss.",
			"%ss are losers!",
			"%ss are FAKE NEWS!"
	};

	public TrumpException(Throwable cause) {
		super(cause);
	}
	
	@Override
	public String getMessage() {
		return generateRandomMessage();
	}

	@Override
	public String getLocalizedMessage() {
		return generateRandomMessage();
	}

	private String generateRandomMessage() {
		String randomMessageTemplate = templates[r.nextInt(templates.length)];
		String randomSuffix = suffixes[r.nextInt(suffixes.length)];
		
		return String.format(randomMessageTemplate + "  " + randomSuffix, this.getCause().getClass().getSimpleName());
	}
}