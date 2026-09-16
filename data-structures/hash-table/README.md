# Java Hash Table Project

This Java project encompasses three classes—`MyLinkedList`, `LinkedList2`, and `HashTable`—with a demonstration of functionality in the `Demo` class. The primary objective is to implement a basic hash table using linked lists for collision resolution.

## Project Structure

### MyLinkedList Class

The `MyLinkedList` class represents a doubly-linked list, offering methods for fundamental operations like adding elements to the start, retrieving elements by index, and removing the head, last, or a specific element. Additionally, it provides a method to print the list.

### LinkedList2 Class

The `LinkedList2` class is another implementation of a linked list with a focus on simplicity. It includes methods for adding elements to the start, deleting the head, checking if the list is empty, finding the size, and more.

### HashTable Class

The `HashTable` class implements a basic hash table with a fixed size of 10, leveraging the generic `LinkedList2` class for handling collisions. Noteworthy features include:

- **Hash Computation**: The `computeHash` method calculates the hash value for a given string.
- **Element Insertion**: The `put` method adds a string to the hash table, avoiding duplicates.
- **Element Deletion**: The `delete` method removes a specified element from the hash table.
- **Element Existence Check**: The `containsString` method checks if a string exists in the hash table.
- **Printing Hash Table**: The `printHashTable` method displays the contents of the hash table.

### Demo Class

The `Demo` class serves as a demonstration of the `HashTable` functionality. It adds elements, computes hash values, lists the initial hash table, deletes a specified element, and displays the updated hash table.

## How to Use

Feel free to explore the code, run the demo, and integrate this hash table implementation into your Java projects! The modular design allows for easy customization and extension based on specific project requirements.

Enjoy coding with this Java Hash Table project!
