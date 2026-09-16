import java.util.NoSuchElementException;
import java.util.Stack;

public class MyLinkedList {

    private Node head, tail;

    public MyLinkedList() {
        head = tail = null;
    }

    class Node {
        String item;
        Node next;
        Node prev;
    }

    public void addToStart(String str) {
        Node newNode = new Node();
        newNode.item = str;

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public String getElement(int i) {
        Node currentNode = head;
        int index = 0;

        while (currentNode != null) {
            if (index == i) {
                return currentNode.item;
            }

            currentNode = currentNode.next;
            index++;
        }

        throw new IndexOutOfBoundsException("Index out of range: " + i);
    }

    public Node removeHead() {
        if (head == null) {
            throw new NoSuchElementException("List is empty");
        }

        Node removedNode = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        removedNode.next = null;
        return removedNode;
    }

    public Node removeLast() {
        if (tail == null) {
            throw new NoSuchElementException("List is empty");
        }

        Node removedNode = tail;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        removedNode.prev = null;
        return removedNode;
    }

    public Node remove(int i) {
        if (i < 0 || head == null) {
            throw new IndexOutOfBoundsException("Index out of range: " + i);
        }

        if (i == 0) {
            return removeHead();
        }

        Node currentNode = head;
        int index = 0;

        while (currentNode != null) {
            if (index == i) {
                Node prevNode = currentNode.prev;
                Node nextNode = currentNode.next;

                prevNode.next = nextNode;

                if (nextNode != null) {
                    nextNode.prev = prevNode;
                } else {
                    tail = prevNode;
                }

                currentNode.prev = null;
                currentNode.next = null;
                return currentNode;
            }

            currentNode = currentNode.next;
            index++;
        }

        throw new IndexOutOfBoundsException("Index out of range: " + i);
    }

    public void printOut() {
        Node currentNode = head;

        while (currentNode != null) {
            System.out.println(currentNode.item);
            currentNode = currentNode.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();

        myList.addToStart("Element 1");
        myList.addToStart("Element 2");
        myList.addToStart("Element 3");
        myList.addToStart("Element 4");
        myList.addToStart("Element 5");

        System.out.println("Original List:");
        myList.printOut();

        System.out.println("Removing The Element 3");
        myList.remove(2);

        myList.printOut();

        System.out.println("List in Reverse Order:");
        Stack<String> stack = new Stack<>();
        Node currentNode = myList.head;

        while (currentNode != null) {
            stack.push(currentNode.item);
            currentNode = currentNode.next;
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}