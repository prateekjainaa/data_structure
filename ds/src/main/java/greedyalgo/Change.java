package greedyalgo;

public class Change {
	
	int deno1 = 10;
	int deno2 = 5;
	int deno3 = 1;
	
    public int getChange(int n) {
        //write your code here
    	int coins_deno1 = getMultiple(n, deno1);
    	System.out.println(deno1 + "=" + coins_deno1);
    	int remainer1 = n % deno1;
    	int coins_deno2 = getMultiple(remainer1, deno2);
    	System.out.println(deno2 + "=" + coins_deno2);
    	int remainder2 = remainer1 % deno2;
    	int coins_deno3 = remainder2;
    	System.out.println(deno3 + "=" + coins_deno3);
        return coins_deno1 + coins_deno2 + coins_deno3;
    }
    
    private int getMultiple(int number, int denominator) {
    	return (int) Math.floor(number/denominator);
    }
    
}

