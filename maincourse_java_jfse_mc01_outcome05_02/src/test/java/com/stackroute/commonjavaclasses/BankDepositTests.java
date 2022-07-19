package com.stackroute.commonjavaclasses;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Period;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/* Write test cases for positive and negative scenarios*/
public class BankDepositTests {
	
	private BankDeposit bankDeposit;
	private String message1 = "Gave Proper Input";
	private String message2 = "Check the logic in the MaturityDate Method";
	
	@BeforeEach 
	public void setUp() {
		bankDeposit = new BankDeposit();
	}
	
	@AfterEach
	public void tearDown() {
		bankDeposit = null;
	}
	
	@Test
	public void givenPeriodIsNullReturnAsErrorString() {
		assertEquals("Give proper input not null",bankDeposit.getMaturityDate("12/3/2000", null),message1);
	}
	
	@Test
	public void givenTimeIsNullReturnAsErrorString() {
		Period period = Period.of(2, 3, 15);
		assertEquals("Give proper input not null",bankDeposit.getMaturityDate(null,period ),message1);
	}
	
	@Test
	public void givenEmptyInvestmentDateAndDurationAsInputThenReturnErrorMessage() {
		Period period = Period.of(2, 3, 15);
		assertEquals("Give proper input not empty investment date",bankDeposit.getMaturityDate("",period ),message1);
	}

	@Test
	public void givenPeriodIsEmptyReturnAsErrorString() {
		Period period = Period.of(0, 0, 0);
		assertEquals("Give proper duration not zero value",bankDeposit.getMaturityDate("17/12/2000",period ),message1);
	}

	@Test
	public void givenPeriodIsNegativeReturnAsErrorString() {
		Period period = Period.of(-1, 0, 0);
		assertEquals("Give proper duration not negative value",bankDeposit.getMaturityDate("17/12/2000",period ),message1);
	}

	@Test
	public void givenValidValueReturnAsValidOut() {
		Period period = Period.of(1, 1, 15);
		assertEquals("17/12/2000",bankDeposit.getMaturityDate("02/11/1999",period ),message2);
	}
	
	@Test
	public void givenInvestmentIsNullReturnAsErrorMessage() {
		assertEquals("Give proper input not null",bankDeposit.getInvestmentDuration(null,"17/12/2000"),message1);
	}

	@Test
	public void givenInvestmentIsEmptyReturnAsErrorMessage() {
		assertEquals("Give proper input not empty value",bankDeposit.getInvestmentDuration("","17/12/2000"),message1);
	}

	@Test
	public void givenMuturityIsNullReturnAsErrorMessage() {
		assertEquals("Give proper input not null",bankDeposit.getInvestmentDuration("17/12/2000",null),message1);
	}

	@Test
	public void givenMuturityIsEmptyReturnAsErrorMessage() {
		assertEquals("Give proper input not empty value",bankDeposit.getInvestmentDuration("17/12/2000",""),message1);
	}

	@Test
	public void givenBothAreVaidReturnAsValidOut() {
		assertEquals("P1Y1M15D",bankDeposit.getInvestmentDuration("02/11/1999","17/12/2000"),message2);
	}
}