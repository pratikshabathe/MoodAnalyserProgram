package com.blz.moodanalyser;

public class MoodAnalyser {

	String message;
	public MoodAnalyser(String message) {
		this.message = message;
	}
	
	public String analyseMood() throws MoodAnalyserException {
		try {
		if (message.toLowerCase().contains("sad"))
			return "SAD";
		else 
			return "HAPPY";
		}catch(NullPointerException e) {
			throw new MoodAnalyserException("Invalid Mood");
		}
		}
}
