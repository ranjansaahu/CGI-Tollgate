package com.stackroute.strings;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.*;

public class MaxCharacterTests {
	 private MaxCharacter maxCharacter;
	    private static final String MESSAGE = "Check the logic of your method findMaxCharacterCount";
	    @BeforeEach
	    void setUp() {
	        maxCharacter = new MaxCharacter();
	    }

	    @Test
	    void givenInputThenReturnResult() {
	        assertEquals('a',maxCharacter.findMaxCharacterCount("Java"));
	    }

	    @Test
	    void givenSpecialCharactersThenReturnResult() {
	        assertEquals('@',maxCharacter.findMaxCharacterCount("#$%@@"));
	    }

	    @Test
	    void givenNumberStringThenReturnResult() {
	        assertEquals('1',maxCharacter.findMaxCharacterCount("11010234"));
	    }

	    @Test
	    void givenInputString() {
	        assertEquals('s',maxCharacter.findMaxCharacterCount("testcases"));
	    }

	    @Test
	    void givenInputNumberString() {
	        assertEquals('1',maxCharacter.findMaxCharacterCount("1321321421"));
	    }

	    @Test
	    void givenInputSpecialCharacters() {
	        assertEquals('#',maxCharacter.findMaxCharacterCount("@&#^@(&#^#"));
	    }

	    @Test
	    void givenStringInput() {
	        assertEquals('e',maxCharacter.findMaxCharacterCount("Dependencies"));
	    }

	    @Test
	    void givenNumberString() {
	        assertEquals('3',maxCharacter.findMaxCharacterCount("283871911293203939"));
	    }

	    @Test
	    void givenSpecialCharacters() {
	        assertEquals('!',maxCharacter.findMaxCharacterCount("*!!&@^#@!%#&"));
	    }
}