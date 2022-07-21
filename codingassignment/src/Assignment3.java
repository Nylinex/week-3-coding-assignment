
public class Assignment3 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		// Programmatically subtract the value of the first element in the array from the value in the last element of the array 
		int[] age2 = {3, 9, 23, 64, 2, 8, 28, 93, 105};
		System.out.println(age2[age2.length - 1] - age2[0]);
		
		// Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths)
		for(int i = 0; i < ages.length; i++) {
			System.out.println(ages[i]);
			
		}
		
		// Use a loop to iterate through the array and calculate the average age
		double sum = 0;
		for (int x : ages) {
			sum += x; {
			System.out.println(sum);
		}
		double average = sum / ages.length;
		System.out.println(average);
		
		}
	}

		// Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
		// Use a loop to iterate through the array and calculate the average number of letters per name
		int letterAverage = 0; {
		for (String name : names) {
			letterAverage += name.length();
			System.out.println(letterAverage);
		}
		System.out.println(letterAverage / names.length);
		}
		
		// Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console
		String concatenateNames = " "; {
		for (String name : names) {
			concatenateNames += name + " ";
		}
	
		System.out.println(concatenateNames);
	
		// How do you access the last element of any array? How do you access the first element of any array?
		int[] array = {3, 2, 1};
		System.out.println(array[array.length - 1]); // to access the last element of an array
		
		System.out.println(array[0]); // to access the first element of an array
			
		// Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array
		int[] nameLengths = new int[names.length];
			
		for (int i = 0; i < nameLengths.length; i++) {
			nameLengths[i] = names[i].length();
			nameLengths[i] = names[i].length();
			System.out.println(nameLengths[i] + " ");
			
		}
		
		// Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
			System.out.println(sumOfLetters);
			
		}
		
		// Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times
		System.out.println(multiplyString("Hello", 3));
		
		// Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space)
		String firstName = "Xenilyn ";
		String lastName = "Gafate";
		
		System.out.println(fullName(firstName, lastName));
		
		// Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100
			int[] myArray = {15, 45, 32, 70};
			
			System.out.println(greaterThan100(myArray));
		
		// Write a method that takes an array of double and returns the average of all the elements in the array
		double[] doubleArray = {5.5, 22.9, 17, 108};
		double[] doubleArray2 = {6.6, 18.5, 47, 90};
		
		System.out.println(arrayOfDouble(doubleArray, doubleArray2));
		
		// Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50
		boolean isHotOutside = true;
		double moneyInPocket = 15.50;
		
		System.out.println(willBuyDrink(isHotOutside, moneyInPocket) );
		
		// Create a method of your own that solves a problem. In comments, write what the method does and why you created it
		int x = returnValue(); // the method returns a value and takes in the number inputed
		
		 System.out.println(x); 
		 
		 int sum = square(8); // the method returns the value of 8
		 System.out.println(sum); // created to simplify multiplying 
		
		}

		public static String multiplyString(String word, int n) {
			String result = "";
			for (int i = 0; i < n; i++) {
				result += word;
			}
			return result;	
		}	
		
		public static String fullName(String firstName, String lastName) {
			return firstName + " " + lastName;
		}
		
		public static boolean greaterThan100(int[] numbers) {
			int sum = 0;
			for (int number : numbers) {
				sum += number; }
			if (sum > 100) { 
				return true; 
			} else {
				return false; }
			
			}
		
		public static boolean arrayOfDouble(double[] doubleArray, double[] doubleArray2) {
			return averageOfDouble(doubleArray) > averageOfDouble(doubleArray2);
			
		}
		
		public static double averageOfDouble(double[] numbers) {
			double sum = 0;
			for (int i = 0; i < numbers.length; i++) { 
				sum += numbers[i]; }
			return sum / numbers.length;
			
		}
			
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
				if(isHotOutside == true && moneyInPocket > 10.50) {
					return true;
				} else {
					return false;
				}}
		
		public static int square(int x) { 
			return x * x;
			 
		}
		
		public static int returnValue() {
			return 8;
			
		}

	

	
}
