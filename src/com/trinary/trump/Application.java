package com.trinary.trump;

import com.trinary.trump.exceptions.TrumpException;

public class Application {
	public static void main(String[] args) throws TrumpException {
		String s = null;
		
		try {
			s.replaceAll("/", ""); 
		} catch (Exception e) {
			throw new TrumpException(e);
		}
	}
}