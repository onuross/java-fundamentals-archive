import java.io.FileNotFoundException;
import java.io.PrintWriter;

class DoublyLinkedList {
    private Node head;
    private Node tail;

    // Constructor for creating an empty DoublyLinkedList
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addMovie(Movie movie) {
        Node newNode = new Node(movie);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node current = head;
            while (current != null) { // Checking for the empty list
                if (current.getMovie().getYear() > movie.getYear()) {
                    break;
                } else if (current.getMovie().getYear() == movie.getYear()) {
                    if (current.getMovie().getTitle().compareTo(movie.getTitle()) > 0) {
                        break;
                    }
                }
                current = current.getNext();
            }

            if (current == head) {
                newNode.setNext(head);
                newNode.setPrev(null);
                head.setPrev(newNode);
                head = newNode;
            } else if (current == null) {
                newNode.setPrev(tail);
                tail.setNext(newNode);
                tail = newNode;
            } else {
                newNode.setPrev(current.getPrev());
                newNode.setNext(current);
                current.getPrev().setNext(newNode);
                current.setPrev(newNode);
            }
        }
    }

    public Movie findMovie(String title) {
        Node current = head;
        while (current != null) {
            if (current.getMovie().getTitle().equals(title)) {
                return current.getMovie();
            }
            current = current.getNext();
        }
        return null;
    }

    public void removeMovie(String title) {
        Node current = head;
        while (current != null) {
            if (current.getMovie().getTitle().equals(title)) {
                if (current == head) {
                    head = current.getNext();
                    if (head != null) {
                        head.setPrev(null);
                    }
                    if (head == null) {
                        tail = null;
                    }
                } else if (current == tail) {
                    tail = current.getPrev();
                    tail.setNext(null);
                } else {
                    current.getPrev().setNext(current.getNext());
                    if (current.getNext() != null) {
                        current.getNext().setPrev(current.getPrev());
                    }
                }
                return;
            }
            current = current.getNext();
        }
    }

    public void printFromHead() {
        Node current = head;
        while (current != null) {
            System.out.println(current.getMovie());
            current = current.getNext();
        }
    }

    public void printFromTail() {
        Node current = tail;
        while (current != null) {
            System.out.println(current.getMovie());
            current = current.getPrev();
        }
    }

    public void printBefore2000() {
        Node current = head;
        while (current != null) {
            if (current.getMovie().getYear() < 2000) {
                System.out.println(current.getMovie());
            }
            current = current.getNext();
        }
    }

    public void saveFile(String fileName) {
        try {
            PrintWriter writer = new PrintWriter(fileName);
            Node current = head;
            while (current != null) {
                writer.println(current.getMovie().getYear() + "," +
                        current.getMovie().getTitle() + "," +
                        current.getMovie().getDirector() + "," +
                        current.getMovie().getGenre() + "," +
                        current.getMovie().getActors().toString());
                current = current.getNext();
            }
            writer.close();
            System.out.println("Saved to File! (" + fileName + ")");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
            e.printStackTrace();
        }
    }
}
