import java.util.ArrayDeque;

public class Solution {
    public static void main(String[] args) {
        ArrayDeque ad1 = new ArrayDeque();
        ad1.add(1);
        ad1.add(2);
        System.out.println(ad1);
        ad1.addFirst(3);
        ad1.addLast(4);
        System.out.println(ad1);
        ad1.add(4);
        System.out.println(ad1);

        ad1.add("Shayan");
        System.out.println(ad1);

        ad1.offer(500);
        ad1.offerFirst(1);
        ad1.offerLast(10);
        System.out.println(ad1);
    }
}
