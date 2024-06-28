import java.util.Arrays;
import java.util.Random;

public class ArrayActivity1 {
	// declare the defaultArray (per the sample output)
	
	private int defaultArray[];

	/**
	 * 1. Constructs the default array of size 10 (per the sample output
	 */
	public ArrayActivity1() {
		defaultArray = new int[10];
		defaultArray[0] = 1;
		defaultArray[1] = 3;
		defaultArray[2] = 7;
		defaultArray[3] = 19;
		defaultArray[4] = 15;
		defaultArray[5] = 19;
		defaultArray[6] = 7;
		defaultArray[7] = 3;
		defaultArray[8] = 19;
		defaultArray[9] = 48; 
	}
      
	/**
	 * 3. Print all of the elements of the array in list form
	 */
	public void display() {

	}

	/**
	 * 4. Print all of the elements in reverse order
	 */
	public void displayReverse() {

	}

	/**
	 * 5. Calculate and return the average of all of the elements The average of the
	 * default array is 14.1
	 */
	public double average() {

	}

	/**
	 * 6. Return the maximum value of all of the elements The max of the default
	 * array is 48.
	 */
	public int findMax() {

	}

	/**
	 * 7. This method will sort the array in ascending order and print HINT: use the
	 * pre-written method in the Arrays API
	 */
	public static void sort() {

	}

	/**
	 * 8. Return the index number of the first instance of int lookFor; returns -1
	 * if not in the list. ex. Using the default array findIndex(15) will return 4
	 */
	public int linearSearch(int lookFor) {

	}

	/**
	 * 9. This method will print the elements and the tally. The list with the
	 * default constructor will be Number Frequency 1 1 3 2 7 2 15 1 19 3 48 1
	 * Create display per sample output
	 */

	public void tallyList() {

	}

	/**
	 * 10. Print a column of numbers in the original order, a column of numbers in
	 * reverse order, and the average of the two. See sample output
	 */
	public void listReverseAvg() {

	}

	public static void main(String[] args) {
		ArrayActivity1 one = new ArrayActivity1();
		System.out.println();
		System.out.println("#3 - Display the default array:");
		one.display();
		System.out.println();
		System.out.println("\n#4 - Display the default array in reverse:");
		one.displayReverse();
		System.out.println();
		System.out.println("\n#5 - Display the average of the defaul array:");
		System.out.println(one.average());
		System.out.println();
		System.out.println("\n#6 - Display the maximum value of the default array:");
		System.out.println(one.findMax());
		System.out.println();
		System.out.println("\n#7 - Display the default array sorted in ascending order:");
		one.sort();
		System.out.println();
		System.out.println("\n#8 - Display the index of 15 in the default array:");
		System.out.println(one.linearSearch(15));
		System.out.println();
		System.out.println("\n#9 - Display a tally of all elements of the default array:");
		one.tallyList();
		System.out.println();
		System.out.println(
				"\n#10 - Display the average of the default " + "\n array and reverse default array, by element:");
		one.listReverseAvg();
	}
}
