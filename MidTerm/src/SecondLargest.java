import acm.program.*;

public class SecondLargest extends ConsoleProgram{
	public void run() {
		println("This program finds the two largest integers in a");
		String SENTINEL;
		println("list. Enter values, one per line, using a "
		 + SENTINEL + " to");
		println("signal the end of the list.");
		int largest = -1;
		int secondLargest = -1;
		while (true) {
		int input = readInt(" ? ");
		if (input == SENTINEL) break;
		if (input > largest) {
		secondLargest = largest;
		largest = input;
		} else if (input > secondLargest) {
		secondLargest = input;
		}
		}
		println("The largest value is " + largest);
		println("The second largest is " + secondLargest);
		}

}
