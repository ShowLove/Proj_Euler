package entropy;

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
	