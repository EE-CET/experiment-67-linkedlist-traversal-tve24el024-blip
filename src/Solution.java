import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListTraversal {
    public static void main(String[] args) {

        // Step 1: Read input
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();   // Number of elements

        // Step 2: Create LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Step 3: Add elements to list
        for (int i = 0; i < n; i++) {
            list.add(input.nextInt());
        }

        // Step 4: Create ListIterator
        ListIterator<Integer> iterator = list.listIterator();

        // Step 5: Forward traversal
        System.out.print("Forward: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Step 6: Backward traversal
        System.out.print("Backward: ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + " ");
        }

        input.close();
    }
}