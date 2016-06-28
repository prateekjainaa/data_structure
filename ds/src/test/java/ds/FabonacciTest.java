package ds;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import fabonacci.FabonacciLoop;
import fabonacci.FabonacciSimple;

public class FabonacciTest {

	@Test
	public void testExecute() {
		FabonacciSimple simple = new FabonacciSimple();
		Date date = new Date();
		for (int i=1; i<=40; i++) {
		System.out.print(simple.execute(i) + ", ");
		}
		Date date2 = new Date();
		System.out.println();
		System.out.println("Time taken: " + (date2.getTime() - date.getTime()));
	}
	//just a comment.
	@Test
	public void testExecuteLoop() {
		FabonacciLoop simple = new FabonacciLoop();
		Date date = new Date();
		simple.execute(40);
		Date date2 = new Date();
		System.out.println();
		System.out.println("Time taken: " + (date2.getTime() - date.getTime()));
	}

}
