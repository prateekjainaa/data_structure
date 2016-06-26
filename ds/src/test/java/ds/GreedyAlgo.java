package ds;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import greedyalgo.Change;

public class GreedyAlgo {

	@Test
	public void testGetChange() {
		Change c = new Change();
		Assert.assertEquals(6, c.getChange(28));
	}

}
