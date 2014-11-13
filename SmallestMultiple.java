package entropy;

/*
2520 is the smallest number that can be divided by each of 
the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible 
by all of the numbers from 1 to 20?
 */

public class SmallestMultiple {
	
	public static void main( String[] args )
	{
		System.out.println(smallestNumber());
	}
	
	public static int smallestNumber()
	{
		int counter = 1;
		boolean foundNumber = false;
		
		while( !foundNumber )
		{
			foundNumber = checkNumber( counter, 20 );
						
			counter++;
		}
		
		return counter - 1;
	}
	
	public static boolean checkNumber( int counter, int limit )
	{
		
		for( int i = 1; i < limit+1; i++)
			if( counter%i != 0 )
				return false;
		
		return true;
	}

}
