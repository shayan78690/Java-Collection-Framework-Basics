import java.util.Hashtable;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();

        ht.put(1, "Rohit");
        ht.put(2, "Rishab");
        ht.put(3, "Rahul");

        ht.putIfAbsent(2, "Rohan");

        System.out.println(ht);

        


        TreeMap tm = new TreeMap();
        tm.put(2, "Rohan");
        tm.put(1, "Ganesh");
        System.out.println(tm);

        //Order of insertion is not preserved
    }
}
