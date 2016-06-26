package fabonacci;

public class FabonacciSimple {

	public long execute(long number) {
		if(number == 2l || number == 1l) {
			return 1l;
		}
		return execute(number - 1) + execute(number - 2 );
	}

	
	public static void main(String[] args) {
		
	}
	
}
