package august4thassignment;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistIterator{
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbersList = new ArrayList<>();

        // Add some elements to the ArrayList
        numbersList.add(2);
        numbersList.add(5);
        numbersList.add(8);
        numbersList.add(11);
        numbersList.add(14);
        numbersList.add(17);

        // Using Iterator to iterate and print even numbers
        System.out.println("Using Iterator:");
        Iterator<Integer> iterator = numbersList.iterator();
        while (iterator.hasNext()) {
            int num = iterator.next();
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Using traditional for loop to iterate and print even numbers
        System.out.println("Using traditional for loop:");
        for (int i = 0; i < numbersList.size(); i++) {
            int num = numbersList.get(i);
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();

        // Using enhanced for loop (for-each loop) to iterate and print even numbers
        System.out.println("Using enhanced for loop:");
        for (int num : numbersList) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}