package ds;

import static org.junit.Assert.*;

import org.junit.Test;

import gcd.GCDSimple;

public class GCTDTest {

	@Test
	public void testExecute() {
	   GCDSimple simple = new GCDSimple();
	   System.out.println(simple.execute(5, 50));
	}

}
