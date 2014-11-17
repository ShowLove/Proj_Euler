package entropy;



/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that 
the 6th prime is 13.

What is the 10001st prime number?
 */

public class prime10001st {
	
	public static void main( String[] args )
	{
		System.out.println( findNthPrime( 10001 ) );
	}
	
	public static long findNthPrime( int n )
	{
		if( n <= 3)
			return n; //account for 0,1,2,3
		
		n -= 2;//Don't check for the values we hard coded
		
		long counter = 5;
		
		while( n > 0 )
		{
			if( isPrime(counter) )
			{
				n--;
				System.out.println("n,counter: "+n+","+counter);
			}		
			
			counter++;		
		}
		
		return --counter;
	}
	
	//checks whether an int is prime or not.
	public static boolean isPrime(long n) 
	{
	    for(long i=2;2*i<n;i++) 
	    {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
}
