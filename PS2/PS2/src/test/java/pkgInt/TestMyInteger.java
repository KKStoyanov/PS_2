package pkgInt;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyInteger {
	
	//Tests the Even functions.
	@Test
	public void TestEven() {
		MyInteger mI1 = new MyInteger(20);
		MyInteger mI2 = new MyInteger(19);
		boolean bExpectedEven = true;
		boolean bExpectedEven2 = false;
		
		assertEquals(bExpectedEven, mI1.isEven());
		
		assertEquals(bExpectedEven2, mI2.isEven());
		
		assertEquals(bExpectedEven, mI1.isEven(20));
		
		assertEquals(bExpectedEven2, mI2.isEven(19));
		
		assertEquals(bExpectedEven, mI1.isEven(mI1));
		
	}
	
	//Tests the odd and prime functions.
	@Test
	public void TestOddAndPrime(){
		MyInteger mI1 = new MyInteger(19);
		MyInteger mI2 = new MyInteger(20);
		boolean bExpectedOAndP = true;
		boolean bExpectedOAndP2 = false;
		
		assertEquals(bExpectedOAndP, mI1.isOdd());
		
		assertEquals(bExpectedOAndP2, mI2.isOdd());
		
		assertEquals(bExpectedOAndP, mI1.isPrime());
		
		assertEquals(bExpectedOAndP2, mI2.isPrime());
		
		assertEquals(bExpectedOAndP, mI1.isOdd(19));
		
		assertEquals(bExpectedOAndP2, mI2.isOdd(20));
		
		assertEquals(bExpectedOAndP, mI1.isPrime(19));
		
		assertEquals(bExpectedOAndP2, mI2.isPrime(20));
				
		assertEquals(bExpectedOAndP, mI1.isOdd(mI1));
		
		assertEquals(bExpectedOAndP, mI1.isPrime(mI1));
		
	}
	
	//Tests the equal functions.
	@Test
	public void TestEqual(){
		MyInteger mI1 = new MyInteger(19);
		boolean bExpectedEqual = true;
		boolean bExpectedEqual2 = false;
		
		assertEquals(bExpectedEqual, mI1.equals(19));
		
		assertEquals(bExpectedEqual2, mI1.equals(20));
		
		assertEquals(bExpectedEqual, mI1.equals(mI1));
	}

}
