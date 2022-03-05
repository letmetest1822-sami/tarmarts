package source;

import java.util.Queue;

/**
 *  A data structure (based on a queue) to represent a Tarmart
 *  store line. Tarmart lines can only contain people and can
 *  be compared  to eachother based on the number of items left
 *  to process in the line. The lines also have id numbers.
 *
 *  @author K. Raven Russell and YOUR_NAME_HERE
 */
class TarmartLine extends ThreeTenQueue<TarmartCustomer> implements Comparable<TarmartLine> {
    //Add more instance variables here...
    //private or protected only!

    //Creates a Tarmart line with a given ID.
    public TarmartLine(int id) {
        //O(1)
    }

    //Returns the ID of the line.
    public int getId() {
        //O(1)
        return -1;
    }

    //Sums up all items for all customers in the line.
    public int itemsInLine() {
        //O(n), where n = the number of people in line
        return -1;
    }

    //Compare one Tarmart line to another based on
    //the number of items in the line and then, if
    //the two lines are tied, by their id.
    public int compareTo(TarmartLine otherLine) {
        //O(n+m), where n = the number of people in the
        //first line and m = the number of people in the
        //second line

		/*
		HINTS:

		Compare functions work as follows:
		Given two things (a and b) and a function call: a.compareTo(b),
		the function will return an integer less than 0 if a is less than b
		the function will return an integer greater than 0 if a is greater than b
		the function will return 0 if a and b are equal

		For example:
		If this line contains 5 items and otherLine contains
		100 items, then this function will return an integer
		less than 0.

		If this line contains 100 items and otherLine contains
		0 items, then this function will return an integer
		greater than 0.

		If this line contains 5 items and otherLine contains
		5 items, the ids will be compared. If this line has an
		id of 10 and otherLine has an id of 2, then this function
		will return an integer greater than 0.
		*/

        return 0;
    }

    //Processes (removes) one item from the first
    //customer in line. If the customer has no more
    //items they are removed from the line.
    public void processItem() {
        //O(1)
    }

    //Converts the line to a string.
    public String toString() {
        //O(n), where n = the number of people in line
        return null;
    }

    //-------------------------------------------------------------
    // Main Method For Your Testing -- Edit all you want
    //-------------------------------------------------------------

    public static void main(String[] args) {
        TarmartLine line = new TarmartLine(0);
        TarmartCustomer mason = new TarmartCustomer(10);
        TarmartCustomer george = new TarmartCustomer(20);

        line.offer(mason);
        line.offer(george);

        if (line.getId()==0 && line.itemsInLine() == 30){
            System.out.println("Yay 1");
        }

        line.processItem();
        if (line.itemsInLine() == 29 && line.peek().getNumItems()==9){
            System.out.println("Yay 2");
        }

        TarmartLine line2 = new TarmartLine(1);
        TarmartCustomer washington = new TarmartCustomer(40);
        line2.offer(washington);

        if (line.compareTo(line2)<0){
            System.out.println("Yay 3");
        }
    }
}