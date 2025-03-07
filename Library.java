import java.util.ArrayList;
import java.util.Random;


public class Library {
    ArrayList<String> collection = new ArrayList<String>();


    public void addItem(String item){ collection.add(item); }
    public void removeItem(String item){ collection.remove(item); }
    public String getNextItem(){ return collection.size()>0 ? collection.get(0) : "Nothing next gang"; }
    public void skipNextItem(){ if(collection.size()>0) collection.remove(0); }
    public void sortAlphabet(){ collection.sort(String::compareTo); }
    public int find(String item){ return collection.indexOf(item); }
    public void shuffle(){ collection.sort((a, b)->new Random().nextInt()); }
}
