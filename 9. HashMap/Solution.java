import java.util.HashMap;
import java.util.LinkedHashMap;

public class Solution {
    public static void main(String[] args) {
        Map hm1 = new HashMap(); //or
        hm1.put(null, null); //Entry 
        hm1.put(02, "Rohit");
        hm1.put(03, "Rahul");
        System.out.println(hm1); 

        HashMap hm2 = new HashMap();
        hm2.put("Virat", "Pawan"); //Entry
        hm2.put("Rishab", "Pawan");
        hm2.put("Shayan", "Rahul");
        System.out.println(hm2); //Both HashMaps are equal because they have the same key-value pairs and order of insertion.


        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put("Virat", "Pawan"); //Entry
        lhm.put("Rishab", "Rohit");
        lhm.put("Shayan", "Rohit");

        System.out.println(lhm);
    }
}
