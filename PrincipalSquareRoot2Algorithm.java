/**
  * Programmer: Harjinder Cheema 
  * Created: Jan 3, 2017
  * Last Updated: Jan 4, 2017
  * 
  * Goal of program: 
  * 	To increment decimal values that conditionally decrease in size sequentially,
  * 	to add up to the square root of 2, which is 1.4142135623730951
  * 
  * Function of program
  * 	The program starts with rootVal and conditionally adds deciVal to rootVal. 
  * 	Each loop of the while loop in calcRootVal() has an if statement to check if 
  * 	adding one more deciVal to rootVal will make it larger than the root of 2. 
  * 	If true, deciVal is divided by ten and begins incrementing the next decimal place
  * 	of rootVal. This is repeated until rootVal is approximately 1.4142135623730951
**/

public class PrincipalSquareRoot2Algorithm {

	// Static variables and methods used only for the simplicity of demo
	public static double deciVal = 0.1;
	public static double rootVal = 1;

	public static void main(String[] args) throws InterruptedException {
		calcRootVal();

		// Prints when calculations are finished.
		System.out.println("\ndecVal is : " + deciVal);
		System.out.println("rootVal is: " + rootVal);
		System.out.println("Sqrt of 2 : " + Math.sqrt(2));
	}

	public static void calcRootVal() throws InterruptedException {
		// starting condition
		while (rootVal < (Math.sqrt(2))) {
			// Increments rootVal with deciVal once before checking.
			rootVal += deciVal;

			// Daemon Thread sleeps so the console does not print too fast.
			Thread.sleep(100);
			System.out.println("rootVal is: " + rootVal);

			// Checks that next increment does not make rootVal > sqrt(2)
			if (rootVal + deciVal > Math.sqrt(2)) {
				// deciVal only gets divided when next decimal is ready
				deciVal /= 10;
				calcRootVal();
			}
		}
	}
}