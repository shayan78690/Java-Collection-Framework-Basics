import java.sql.Array;
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        ArrayList all = new ArrayList();

        all.add(100);
        all.add(200);
        all.add(300);

        System.out.println(all);

        ArrayList dll = new ArrayList();
        dll.add("PW Skills");
        dll.add(1);
        dll.add('j');
        dll.add(1.3);
        System.out.println(dll);

        ArrayList cll = new ArrayList();
        cll.add(1);
        cll.add(2);
        cll.add(3);
        System.out.println(cll);

        cll.addAll(dll);
        System.out.println(cll);

        cll.add(2, "PW");
        System.out.println(cll);


    }
}