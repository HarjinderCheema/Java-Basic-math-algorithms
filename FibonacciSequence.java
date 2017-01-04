/**
  * Programmer: Harjinder Cheema 
  * Created: Dec 8, 2016
  * Last Updated: Jan 3, 2017
  * 
  * Goal of program: 
  * 	To print the first 20 numbers of a fibbonacci sequence 
  * 	(1,2,3,5,8,13,21,34,etc...) in a simple fashion.
  *
**/

public class FibonacciSequence {
	public static void main(String[] args) {
		
		// 0+1 = the first fibonacci number
		int smallVal = 0;
		int bigVal = 1;

		for (int i = 0; i <= 20; i++) {
		
			// nextVal becomes bigVal, and smallVal becomes the previous bigVal.
			int nextVal = smallVal + bigVal;
			System.out.println(i + ": " + nextVal);

			// smallVal becomes the previously largest number (bigVal)
			smallVal = bigVal;

			// bigVal becomes the largest (smallVal + bigVal = nextVal)
			bigVal = nextVal;
		}
	}
}