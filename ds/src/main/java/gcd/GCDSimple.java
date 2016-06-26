package gcd;

public class GCDSimple {
	
	public int execute(int a, int b) {
	    if(b == 0) {
	    	return a;
	    }
	    return execute(b, a%b);
	}

}
