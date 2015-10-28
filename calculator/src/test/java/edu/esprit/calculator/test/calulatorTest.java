package edu.esprit.calculator.test;
import org.junit.Assert;




import org.junit.Test;

import edu.esprit.calculate.Calculator;
public class calulatorTest {
	@Test
	
	public void itshouldReturn10(){
		Long[] params ={1L,2L,3L,4L};
		Calculator calc =new Calculator ();
		Long actual =calc.add(params);
		Long expected =10L;
		Assert.assertEquals(expected,actual);
		
	}

}
