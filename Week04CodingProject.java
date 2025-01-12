package week04;

public class Week04CodingProject {

	public static void main(String[] args) {
		
// 1.
		// Array of integer "ages" with values given
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
	// a.
		
		// Code takes the last value of the array and subtracts it from the first
		int lastMinusFirst = ages[ages.length - 1] - ages[0];
		
		// Sysout that displays (last element of array - first element of array) result for ages
		System.out.println("1a. " + lastMinusFirst);
	
	// b.
		
		// Array of integer "ages2" with values I have chosen
		int[] ages2 = {5, 12, 26, 43, 52, 61, 77, 88, 99};
		
		// Code that does the same last minus first in the above ages example
		int lastMinusFirst2 = ages2[ages2.length - 1] - ages2[0];
		
		// Sysout that displays (last element of array - first element of array) result for ages2
		System.out.println("1b. " + lastMinusFirst2);
	
	// c.	
		
		// Placeholder double to hold the total sum of ages, declared as double for future division
		double ageSum = 0;
		
		// An enhanced for loop that iterates a newly declared integer age, and adds the ages together
		for (int age : ages) {
			ageSum = ageSum + age;
		}
		
		/* 
		 * averageAge declared as a double to account for decimal values
		 * 3 + 9 + 23 + 64 + 2 + 8 + 28 + 93 = 230; 230 / 8(total values) = 28.75
		 */
		double averageAge = ageSum / ages.length;
		System.out.println("1c. " + averageAge);
		
// 2.
		// Array of Strings with values given
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	// a.
		
		// Placeholder double declared to hold the number of letters in the names
		double totalLetter = 0;
		
		// An enhanced for loop that iterates a newly declared String name, and adds the lengths to double
		for (String name : names) {
			totalLetter = totalLetter + name.length();
		}
		
		/* 
		 * averageLetter declared as a double to account for decimal values
		 * letters add up to 23; 23 / 6(amount of names) = 3.8333333333
		 */
		double averageLetter = totalLetter / names.length;
		System.out.println("2a. " + averageLetter);
		
	// b.
		
		// String established to hold concatenated words
		String concatNames = "";
		
		// An enhanced for loop to concatenate the names together, and displays them with a space
		for (String name : names) {
			concatNames = concatNames + name + " ";
		}
		System.out.println("2b. " + concatNames);
		
// 3.
	
		/* 
		 * To access the last element of an array, you need to have the following code
		 * in parenthesis, with howToFind used as an example
		 * (howToFind.length - 1)
		 * the ".length" function with "- 1" at the end of it will put you at the last
		 * value in an array
		 */
		System.out.println("3. howToFind.length - 1");
		
// 4.
		
		/*
		 * To access the first element of an array, you need to have the following code
		 * in parenthesis, with howToFind used as an example
		 * (howToFind[0])
		 * the "[0]" after howToFind will put you at the first value of the array
		 */
		System.out.println("4. howToFind[0]");
// 5.
		
		/* 
		 * Array of integer nameLengths established, names.length used for the size 
		 * of the names array
		 */
		int[] nameLengths = new int[names.length];
		
		// for loop used so for every name will have a length in integer assigned to it
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}

// 6.
		
		// New integer established for the sum of all of the lengths found in the previous example
		int total = 0;
		
		/* 
		 * for loop with int length established to iterate over nameLengths and
		 * add the length of the name to the total, with the total amount of characters
		 * in names being 23
		 */
		for (int i = 0; i < nameLengths.length; i++) {
			total = total + nameLengths[i];
		}
		System.out.println("(5)6. " + total);
		
// 7.
		
		// String and int carried over from the example to test the output
		String word = "Hello";
		int n = 3;
		
		// String hello established to follow the concatWord method
		String hello = concatWord(word, n);
		System.out.println("7. " + hello);
		
// 8.
		
		// Strings established to test the method
		String firstName = "Nick";
		String lastName = "Jenks";
		
		// String full established to hold fullName from the method
		String full = fullName(firstName, lastName);
		System.out.println("8. " + full);
		
// 9.
		
		// array numbers to see if method returns true
		int arrayTrue[] = {30, 35, 40, 45, 50};
		System.out.println("9. True: " + over100(arrayTrue));
		
		// array numbers to see if method returns false
		int arrayFalse[] = {1, 2, 3, 4, 5};
		System.out.println("9. False: " + over100(arrayFalse));
		
// 10.
		
		// double array established to account for decimals in finding the average
		double array[] = {12, 23, 34, 45, 56};
		
		// setting the double average to the method using the array above 
		double average = averageOfArray(array);
		System.out.println("10. " + average);
		
// 11.
		
		// double arrays to check if method will produce true
		double[] num1 = {2, 3, 4, 5, 6};
		double[] num2 = {1, 2, 3, 4, 5};
		System.out.println("11. True: " + isGreaterThan(num1, num2));
		
		// double arrays to check if method will produce false
		double[] num3 = {1, 2, 3, 4, 5};
		double[] num4 = {2, 3, 4, 5, 6};
		System.out.println("11. False: " + isGreaterThan(num3, num4));
		
// 12. 
		
		// boolean and double established to make method return true
		boolean hotOutside = true;
		double myMoney = 50.50;
		
		// 
		boolean willIBuyDrink = willBuyDrink(hotOutside, myMoney);
		System.out.println("12. True: " + willIBuyDrink);
		
		// boolean and double established to make method return false
		boolean coldOutside = true;
		double myMoneyNow = 5.50;
		
		//
		boolean willIBuyDrinkAgain = willBuyDrink(coldOutside, myMoneyNow);
		System.out.println("12. False: " + willIBuyDrinkAgain);
		
// 13.
		
		// int array to check if method will produce true
		int[] nums = {12, 48, 6, 105, 90};
		boolean canDivide = divisibleBy3(nums);
		System.out.println("13. True: " + canDivide);
		
		// int array to check if method will produce false
		int[] numsDivide = {11, 22, 33, 44, 50};
		boolean cantDivide = divisibleBy3(numsDivide);
		System.out.println("13. False: " + cantDivide);
		
	}	
	
// 13 METHOD
	
	/*
	 * The problem that I created is below
	 * "Write a method that takes an array of ints and returns true if the ints sum
	 * is divisible by 3 with a remainder of 0"
	 * Below I have listed my method for this problem
	 */
	
	// Method established that takes an array of int to return a boolean value for / by 3
	public static boolean divisibleBy3(int[] array) {
		
	// Placeholder double sum established to contain the sum of the array
		double sum = 0;
	
	// enhanced for loop that adds all of the numbers of the array to sum value
		for (double num : array) {
			sum = sum + num;
		}
	
	// if statement to check if the sum can be divided by 3 with no remainder
		if (sum % 3 == 0) {
	return true;
		} else {
	return false;
		}
		
	}
	
// 12 METHOD
	
	/* 
	 * Method established to take boolean isHotOutside and double moneyInPocket to
	 * return a boolean value
	 */
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		
	/* 
	 * if statement saying that isHotOutside is true, and money is > 10.50 to return true
	 * otherwise, it returns false
	 */
		if (isHotOutside = true && moneyInPocket > 10.50) {
	return true;
		} else {
	return false;
		}
	}
	
// 11 METHOD
	
	// Method established in boolean to see if the average of num1 array is > num2
	public static boolean isGreaterThan(double[] num1, double[] num2) {
		
	// double sum1 created to hold sum of num1 array, sum2 for num2
		double sum1 = 0;
		double sum2 = 0;
		
	// enhanced for loop to add all of the sums for the first array
		for (double num : num1) {
			sum1 = sum1 + num;
		}

	// enhanced for loop to add all of the sums for the second array
		for (double num : num2) {
			sum2 = sum2 + num;
		}
	
	// if statement to return true if sum1 is greater than sum2, or else it returns false
		if (sum1 > sum2) {
	return true;
		} else {
	return false;
		}
		
	}
	
	
	
// 10 METHOD
	
	// Method established in double to find the average of the array input, which could have decimal
	public static double averageOfArray(double array[]) {
		
	// Placeholder double sum set to 0 to hold the sum of the numbers in the array
		double sum = 0;
		
	// enhanced for loop that iterates every number in the array and adds it to the sum
		for (double num : array) {
			sum = sum + num;
		}
	// double average established to take sum and divide it by the length of the array
		double average = sum / array.length;
		
	// returns average to the method
	return average;
	}
	
	
// 9 METHOD
	
	// Method in boolean to check if the input arrays sums are higher than 100
	public static boolean over100(int[] array) {
		
	// int sum established to store the total sum of all the numbers in the array
	int sum = 0;
		
	// enhanced for loop that iterates every number in the array and adds it to sum
		for (int num : array) {
			sum = sum + num;
		}
		
	// sum is returned if the over 100 requirement is met
		return sum > 100;
	}
	
// 8 METHOD
	
	// Method that takes String firstName and lastName and outputs String fullName
	public static String fullName(String firstName, String lastName) {
		
	// String result established for concatenation of firstName, lastName, and the space between
		String result = "";
		
	// code to concatenate firstName to lastName with a space between
		result = firstName + " " + lastName;
	
	// returns result to method
	return result;
	}
	
// 7 METHOD
		
	// Method that takes the inputs String word and int n and outputs concatWord
	public static String concatWord(String word, int n) {
		
	// String result established to hold the concatenated words
		String result = "";
	
	// for loop used to add String word together for the number in int n
		for (int i = 0; i < n; i++) {
			result = result + word;
		}
	
	// returns result to the method
		return result;
			
		}	
}
