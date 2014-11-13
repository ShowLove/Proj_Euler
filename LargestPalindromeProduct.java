package entropy;

public class LargestPalindromeProduct {
	
/*
A palindromic number reads the same both ways. The largest palindrome made 
from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */
	
	public static void main( String[] args )
	{
		System.out.println( checkAllProducts(3) );
	}
	
	public static int checkAllProducts(int digits)
	{
		int digitNumN = largestNumRspToDigits( digits );
		int largestProduct = 0;
		
		for(int numA = digitNumN; numA > 0; numA-- )
		{
			for(int numB = digitNumN; numB > 0; numB--)
			{
				if( isPalindrom( numA*numB ) )
				{
					//System.out.println( "NumA-->"+numA+" NumB-->"+numB);
					largestProduct = (numA*numB > largestProduct)? numA*numB : largestProduct;
				}
			}
		}
		return largestProduct;
	}
	
	//Checks to see if a number is a palindrome
	public static boolean isPalindrom( int num )
	{
		 int n = num;
		 int rev = 0;
		 int dig = 0;
		 
		 while (num > 0)
		 {
		      dig = num % 10;
		      rev = rev * 10 + dig;
		      num = num / 10;
		 }
		 
		 return ( n == rev ) ? true : false;
	}
	
	//I could have hard coded this and eliminated this function
	//but I wanted to make the code generic for any digits
	public static int largestNumRspToDigits( int digits )
	{
		int digitNumberN = 1;
		
		//get largest number respective to number of dig in num
		for(int i = 0; i < digits; i++)
		{
			digitNumberN *= 10;
		}
		
		return digitNumberN - 1;
	}

}
