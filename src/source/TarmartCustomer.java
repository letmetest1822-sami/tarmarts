package source;

/**
 *  This class represents a single Tarmart customer.
 *
 *  @author K. Raven Russell and YOUR_NAME_HERE
 */
class TarmartCustomer {
    //Add more instance variables here...
    //private or protected only!

    //Sets up a person with a given number of items.
    public TarmartCustomer(int numItems) {
        //O(1)
        //throws an IllegalArgumentException if numItems is
        //invalid (the person has less than one item)
    }

    //Gets how many items the person still has.
    public int getNumItems() {
        //O(1)
        return -1;
    }

    //Removes one item from this person (i.e. "checks out"
    //one item from this person.
    public void removeItem() {
        //O(1)
    }

    //Indicates whether or not this person has any more
    //items left to "check out".
    public boolean done() {
        //O(1)
        return false;
    }

    //-------------------------------------------------------------
    // Main Method For Your Testing -- Edit all you want
    //-------------------------------------------------------------

    public static void main(String[] args){
        TarmartCustomer mason = new TarmartCustomer(2);
        if (mason.getNumItems() == 2 && !mason.done()){
            System.out.println("Yay 1");
        }

        mason.removeItem();
        boolean ok = (mason.getNumItems() == 1);
        mason.removeItem();
        if ( ok && mason.done()){
            System.out.println("Yay 2");
        }
    }

    //-------------------------------------------------------------
    // DO NOT EDIT ANYTHING BELOW THIS LINE EXCEPT TO ADD JAVADOCS
    //-------------------------------------------------------------

    //provided toString() method -- use "inheritDoc" for this JavaDoc!
    //(see project description)
    public String toString() {
        return "TC("+getNumItems()+")";
    }
}

