import java.util.ArrayList;
import java.util.Random;


public class Library {                                                // Library class creator. 
    ArrayList<String> collection = new ArrayList<String>();


    public void addItem(String item){ collection.add(item); }            // add item method
    public void removeItem(String item){ collection.remove(item); }      // remove item method
    public String getNextItem(){ return collection.size()>0 ? collection.get(0) : "Nothing next gang"; }  // gets the next item and has error catching if theres nothing left in the queue 
    public void skipNextItem(){ if(collection.size()>0) collection.remove(0); }        // skips the next item in the queue
    public void sortAlphabet(){ collection.sort(String::compareTo); }  // sorts the queue in alphabetical order 
    public int find(String item){ return collection.indexOf(item); }  // find a track
    public void shuffle(){ collection.sort((a, b)->new Random().nextInt()); } // shuffles the queue
}
