package source;

import java.util.Queue;
import java.util.NoSuchElementException;

//READ THE DOCUMENTATION for the Queue interface for more information
//on how these methods should work and when exceptions should
//be thrown. This data structure does not allow adding null.

//DO NOT re-implement nodes in this class... remember how
//inheritance works in Java and make use of that!

//a simple queue based on a ThreeTenList
//authors for authors tag: K. Raven Russell and YOUR_NAME_HERE
class ThreeTenQueue<T> extends ThreeTenList<T> implements Queue<T> {
    //Note: The "front" of the queue should be the front of the list.

    //You need to override the following methods
    //at a minimum:
    //
    //	boolean add(T)	//O(1)
    //	boolean offer(T)//O(1)
    //	T remove()		//O(1)
    //	T poll()		//O(1)
    //	T element()		//O(1)
    //	T peek()		//O(1)

    //-------------------------------------------------------------
    // Main Method For Your Testing -- Edit all you want
    //-------------------------------------------------------------

    public static void main(String[] args) {
        ThreeTenQueue<Integer> nums = new ThreeTenQueue<>();

        nums.offer(2);
        nums.offer(3);
        nums.offer(5);

        if (nums.peek() == 2 && nums.size()==3){
            System.out.println("Yay 1");
        }

        if (nums.poll() == 2 && nums.poll() == 3
                && nums.poll() == 5 && nums.poll() == null){
            System.out.println("Yay 2");
        }
    }
}

