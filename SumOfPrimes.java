package entropy;
import java.util.Arrays;

public class SummationOfPrimes {
	
	//global array just to keep track of it in this example, 
	//but you can easily do this within another function.
	 
		// will contain true or false values for the first 10,000 integers
		static boolean[] primes=new boolean[2000000];
		
		public static void main( String[] args )
		{
			fillSieve();
			System.out.println( sumOfP(2000000) );
		}
		
		public static long sumOfP(int sumBelowThisNumber )
		{
			long sum = 0;
			
			for(int i = 0; i < sumBelowThisNumber; i++)
			{
				if( isPrime(i) )
				{
					sum += i;
				}
			}
			
			return sum;
		}
		
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

}
