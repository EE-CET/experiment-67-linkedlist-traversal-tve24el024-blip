import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }

        ListIterator<Integer> it = list.listIterator();

        // Forward
        System.out.print("Forward: ");
        while (it.hasNext()) {
            int val = it.next();
            System.out.print(val);
            if (it.hasNext()) System.out.print(" ");
        }
        System.out.println();

        // Backward
        System.out.print("Backward: ");
        while (it.hasPrevious()) {
            int val = it.previous();
            System.out.print(val);
            if (it.hasPrevious()) System.out.print(" ");
        }

        input.close();
    }
}