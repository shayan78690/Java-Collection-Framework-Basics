import java.util.*;

public class Solution {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(20);
        hs.add(30);
        hs.add(44);
        System.out.println(hs);
        hs.add(44); //Not allowed


        LinkedHashSet hs1 = new LinkedHashSet();
        hs1.add(100);
        hs1.add(20);
        hs1.add(30);
        hs1.add(44);
        System.out.println(hs1);
    }
}
