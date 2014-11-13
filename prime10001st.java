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
	
	//Another way to do this
/*	
 * 
 * 
 //import java.util.Arrays;
//global array just to keep track of it in this example, 
//but you can easily do this within another function.
 
	// will contain true or false values for the first 10,000 integers
	static boolean[] primes=new boolean[10001]; 
	
	//set up the primesieve
	public static void fillSieve() 
	{
	    Arrays.fill(primes,true);        // assume all integers are prime.
	    primes[0]=primes[1]=false;       // we know 0 and 1 are not prime.
	    for (int i=2;i<primes.length;i++) 
	    {
	        //if the number is prime, 
	        //then go through all its multiples and make their values false.
	        if(primes[i]) 
	        {
	            for (int j=2;i*j<primes.length;j++) 
	            {
	                primes[i*j]=false;
	            }
	        }
	        
	        
	    }
	   
	}
	 
	public static boolean isPrime(int n) 
	{
	    return primes[n]; //simple, huh?
	}
*/	
	
	/*
	 Consider that if 2 divides some integer n, then (n/2) divides n as well. 
	 This tells us we don’t have to try out all integers from 2 to n. Now we can modify our 
	 algorithm:
	 
	 we notice that you really only have to go up to the square root of n, because if you 
	 list out all of the factors of a number, the square root will always be in the middle 
	 (if it happens to not be an integer, we’re still ok, we just might over-approximate, 
	 but our code will still work).
	 
	 Finally, we know 2 is the “oddest” prime – it happens to be the only even prime number. 
	 Because of this, we need only check 2 separately, then traverse odd numbers up to the 
	 square root of n. 
	 */
}
