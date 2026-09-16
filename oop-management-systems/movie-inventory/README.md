# Movie Inventory Management System

This Java project is a Movie Inventory Management System that allows users to manage a list of movies, including details about the movies and their actors. The system utilizes a doubly linked list to efficiently organize and manipulate the movie data.

## Actor Class

The `Actor` class represents an actor and includes the following features:

- Constructor methods for creating actors with name, gender, and nationality.
- Getter and setter methods for encapsulation.
- A `toString` method for displaying actor details.

## Movie Class

The `Movie` class represents a movie and includes the following features:

- Constructor methods for creating movies with year, title, genre, director, and a list of actors.
- Getter and setter methods for encapsulation.
- A `toString` method for displaying movie details.

## DoublyLinkedList Class

The `DoublyLinkedList` class manages a doubly linked list of movies and includes the following features:

- Methods for adding, finding, and removing movies from the list.
- Methods for printing movies from head, tail, and those released before 2000.
- A `saveFile` method for saving the movie data to a file.

## Node Class

The `Node` class represents a node in the doubly linked list and includes the following features:

- Constructor method for creating a node with a movie.
- Getter and setter methods for movie, previous, and next nodes.

## Main Class (MovieInventoryApp)

The `Main` class serves as the entry point for the Movie Inventory Management System. It includes the following features:

- Loading movie data from a file (`Bilgiler.txt`) into the doubly linked list.
- User interaction through a menu for adding, searching, deleting, and displaying movies.
- Capability to save the updated movie data back to the file.

## Usage

1. Run the `MovieInventoryApp` class to start the Movie Inventory Management System.
2. Follow the on-screen menu options to manage the movie inventory.

Feel free to customize and adapt this system according to your specific needs. If you have any questions or need further assistance, feel free to ask!
