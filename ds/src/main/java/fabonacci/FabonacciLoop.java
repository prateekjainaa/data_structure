package fabonacci;

public class FabonacciLoop {
	
	public long execute(long number) {
		if(number == 2l || number == 1l) {
			return 1l;
		}
		int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            System.out.print(fibonacci + ", ");
            fibo1 = fibo2;
            fibo2 = fibonacci;
 
        }
        return fibonacci;
	}

}
