package entropy;

/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

public class LargestPrimeFactor {
	
    static long Tn = 600851475143L;

    public static void main(String[] args) {

        for (long i = 2; i < Math.sqrt(Tn); i++) 
        {

            if(Tn % i == 0) 
            {
                Tn = Tn / i;
                i--;
            }   
        }
        System.out.println(Tn);
    }

}
