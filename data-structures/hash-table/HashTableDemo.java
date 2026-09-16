import java.util.Scanner;

public class HashTableDemo {
    public static void main(String[] args) {
        HashTable hashtable = new HashTable();

        // Adding elements
        hashtable.put("Apple");
        hashtable.put("Pear");
        hashtable.put("Cherry");
        hashtable.put("Grape");
        hashtable.put("Melon");
        hashtable.put("Kiwi");
        hashtable.put("Grapefruit");
        hashtable.put("Lemon");
        hashtable.put("Hazelnut");
        System.out.println(hashtable.computeHash("Kiwi"));
        System.out.println(hashtable.computeHash("Apple"));
        System.out.println(hashtable.computeHash("Melon"));
        System.out.println(hashtable.computeHash("Grape"));
        System.out.println(hashtable.computeHash("Cherry"));
        System.out.println(hashtable.computeHash("Pear"));

        System.out.println(hashtable.computeHash("Grape"));


        // List all the elements
        System.out.println("Hash Table:");
        hashtable.printHashTable();
        System.out.println();

        // Delete one element
        System.out.print("Enter an Fruit to Delete: ");
        Scanner input = new Scanner(System.in);
        String itemToDelete;
        itemToDelete = input.nextLine();
        boolean deleted = hashtable.delete(itemToDelete);
        if (deleted) {
            System.out.println(itemToDelete + " deleted.");
        } else {
            System.out.println(itemToDelete + " can not found.");
        }
        System.out.println();

        // List the updated hash table
        System.out.println("Updated Hash Table:\n");
        hashtable.printHashTable();

        // I made a small update in LinkedList2 95.row to get better looking output
    }
}