package source;

import java.util.AbstractList;
import java.util.NoSuchElementException;
import java.util.Iterator;

//READ THE DOCUMENTATION for AbstractList for more information
//on how these methods should work and when exceptions should
//be thrown. This data structure does not allow adding null
//elements.

/**
 *  A simple linked list class based on AbstractList.
 *
 *  @param <T> the type of the item the list will contain
 *  @author K. Raven Russell and YOUR_NAME_HERE
 */
class ThreeTenList<T> extends AbstractList<T> {
    //the head of this list -- you MUST use this variable for credit!
    //Do NOT change the name or type
    protected DoubleNode<T> head = null;

    //Add more instance variables here...
    //private or protected only!

    //Constructor
    public ThreeTenList() {
        //O(1)
    }

    //You need to override the following methods
    //at a minimum:
    //
    //	int size()		//O(1)
    //	T get(int)		//O(n)
    //	T set(int, T)	//O(n)
    //	add(int, T)		//O(n)
    //	add(T)			//O(1)
    //	T remove(int)	//O(n)

    //-------------------------------------------------------------
    // Main Method For Your Testing -- Edit all you want
    //-------------------------------------------------------------

    /**
     *  A main method for testing.
     *
     *  @param args not used
     */
    public static void main(String[] args){
        ThreeTenList<Character> letters = new ThreeTenList<>();
        for (int i=0; i<5; i++)
            letters.add((char)(97+i*2));

        if (letters.size() == 5 && letters.get(0) == 'a'){
            System.out.println("Yay 1");
        }

        if (letters.set(1,'b') == 'c' && letters.get(1) == 'b'){
            System.out.println("Yay 2");
        }

        letters.add(2,'c');
        if (letters.size() == 6 && letters.get(2) == 'c' && letters.get(3)=='e'){
            System.out.println("Yay 3");
        }

        if (letters.remove(3)=='e' && letters.size() == 5 && letters.get(3)=='g'){
            System.out.println("Yay 4");
        }
    }

    //-------------------------------------------------------------
    // DO NOT EDIT ANYTHING BELOW THIS LINE EXCEPT TO ADD JAVADOCS
    //-------------------------------------------------------------

    public static class DoubleNode<T> {
        //Note: it is a bad practice to have this public, but it makes it
        //easier for us to test your implementation.

        public T value;
        public DoubleNode<T> next;
        public DoubleNode<T> prev;

        public DoubleNode() { }
        public DoubleNode(T value) { this.value = value; }
    }

    //provided toString() method, if your code is working,
    //this should work too...
    public String toString(){
        StringBuilder sb = new StringBuilder("");
        for (T value : this){
            sb.append(value);
            sb.append(" ");
        }
        return sb.toString();
    }

    //provided iterator, if your code is working, this should
    //work too...
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            DoubleNode<T> current = head;

            public T next() {
                if(!hasNext()) throw new NoSuchElementException();
                T val = current.value;
                current = current.next;
                return val;
            }

            public boolean hasNext() {
                return (current != null);
            }
        };
    }
}
