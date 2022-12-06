package com.blz.moodanalyser;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestMoodAnalyser {

	/*@Test
	public void testMessageContainsSad() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad message");
		String mood = moodAnalyser.analyseMood();
		System.out.println(mood);
		assertEquals("SAd" , mood);
	}
	
	@Test
	public void testMessageContainsHappy() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message");
		String mood = moodAnalyser.analyseMood();
		System.out.println(mood);
		assertEquals("HAPPY" , mood);

	}*/
	
	/*@Test
	public void testMessageContainSad() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
		String SadMood = moodAnalyser.analyseMood();
		System.out.println(SadMood);
		assertEquals("SAD" , SadMood);
	}*/
	
	@Test
	public void testMessageContainHappy() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("I am in happy mood");
		String HappyMood = moodAnalyser.analyseMood();
		System.out.println(HappyMood);
		assertEquals("HAPPY" , HappyMood);
	}
	
	
	
	
	
	/*@Test
	public void testMessageContainsHappy() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message");
		String mood = moodAnalyser.analyseMood();
		System.out.println(mood);
		assertEquals("HAPPY" , mood);
	}
	
	@Test
	public void testMessageForNullPointerException() throws MoodAnalyserException {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		String mood = moodAnalyser.analyseMood();
		System.out.println(mood);
		assertEquals("HAPPY" , mood);
	}*/
	
	
	
}