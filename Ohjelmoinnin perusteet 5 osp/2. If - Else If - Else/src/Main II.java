
public class SelectionStructure1 {

	public static void main(String[] args) {
		
	// 1 |
		// -	Create an app.
		// -	Declare an integer typed variable.
		//	-	Assign 120 as a value of the variable.
		//	-	Create an if statement where you check if the value of the variable is greater than 100.
			
		int number = 120;
			
		if (number > 100)
		{
			System.out.println("120 is greater than 100.");
		}
	// 2:
		// -	Create an app
		// -	Declare two integer typed variables.
		// -	Assign the same value to both variables (for example 10).
		// -	Create an if statement where you check that the numbers are equal. If they are, print:
			
		int number1 = 10;
		int number2 = 10;
			
		if (number1 == number2)
		{
			System.out.println("Numbers are equal.");
		}
	// 3:
		// -	Create an app.
        // -    Declare two string typed variables.
        // -    Assign values to variables:
        // -    The value of the first variable is iOS
        // -    The value of the second variable is Android
        // -    Print the values.
        // -    Create an if statement where you check if the values are equal. In this case they are not, so print:
        // -
        // -        Strings are not equal.
        // -
        // -    Of course, it is wise to check, that the if statement is okay by changing the values to same.
        // -    Output int the console should be:
        //          
        //          iOS
        //          Android
        //          Strings are not equal.
		
	    String a = "iOS";
        String b = "Android";
		{
			System.out.println(a);
		}
        {
			System.out.println(b);
		}
		if (a == b)
        {
            System.out.println("Strings are equal.");
        }
        else
        {
            System.out.println("Strings are not equal.");
        }
		
	// 4:
		// 	Create an app.
		//	Declare three integer typed variables.
		//	Assign values to the variables. Make sure they are all the same.
		//	Create an if statement where you check that numbers are all equal. If they are, print:

		//		Numbers are equal.

		int a = 1;
		int b = 1;
		int c = 1;

		if (a == b && b == c)
		{
			System.out.println("Numbers are equal.");
		}
	}

}
