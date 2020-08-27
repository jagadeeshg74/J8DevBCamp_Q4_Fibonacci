package yaksha;



import java.io.IOException;

import org.junit.jupiter.api.Test;

import yaksha.*;

public class MainClassTest {
	
	
	@Test
	public void testFibonacci1() throws IOException {
		
	//	assertEquals(7,Fibonacci.getFibonacciSum(5));
	//	assertEquals(20 ,Fibonacci.getFibonacciSum(7));
		TestUtils.yakshaAssert(TestUtils.currentTest(),  MainClass.getFibonacciSum(5)== 7 ?"true":"false", TestUtils.businessTestFile );
		
		
	}
	@Test
	public void testFibonacci2() throws IOException {
		
	
		TestUtils.yakshaAssert(TestUtils.currentTest(),  MainClass.getFibonacciSum(7)== 20 ?"true":"false", TestUtils.businessTestFile );
		
		
	}
	
	
	

}
