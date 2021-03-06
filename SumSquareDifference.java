package entropy;

/*
The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

public class SumSquareDifference {
	
	public static void main( String[] args )
	{
		int sumA = sumOfSquares( 100 );
		int sumB = squareOfSum( 100 );
		
		int sum = ( sumA > sumB) ? sumA - sumB : sumB - sumA;
		
		System.out.println( sum );
	}
	
	public static int sumOfSquares(int num )
	{
		int sum = 0;
		for(int i = 0; i < num+1; i ++)
		{
			sum += Math.pow(i, 2);
		}
		
		return sum;
	}
	
	public static int squareOfSum(int num)
	{
		int sum = 0;
		for(int i = 0; i < num+1; i++)
		{
			sum += i;
		}
		
		sum = (int) Math.pow(sum, 2);
		return sum;
	}

}
	
