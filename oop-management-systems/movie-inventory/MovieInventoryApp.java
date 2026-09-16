import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MovieInventoryApp {
    public static void main(String[] args) {
        DoublyLinkedList movieList = new DoublyLinkedList();

        try {
            File file = new File("Bilgiler.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                String[] tokens = line.split(",");

                int year = Integer.parseInt(tokens[0]);
                String title = tokens[1];
                String genre = tokens[2];
                String director = tokens[3];

                ArrayList<Actor> actors = new ArrayList<>();

                String actorInfo = tokens[4].substring(2, tokens[4].length() - 1);
                String[] actorTokens = actorInfo.split("\\)\\(");

                for (String actorToken : actorTokens) {
                    String[] actorInfoTokens = actorToken.split(",");
                    String actorName = actorInfoTokens[0].trim();
                    String actorGender = actorInfoTokens[1].trim();
                    String actorNationality = actorInfoTokens[2].trim();
                    Actor actor = new Actor(actorName, actorGender, actorNationality);
                    actors.add(actor);
                }

                Movie movie = new Movie(year, title, genre, director, actors);
                movieList.addMovie(movie);
            }
            scanner.close();
            System.out.println("Movies Downloaded Successfully!");
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found!");
            e.printStackTrace();
        }

        Scanner input = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n--- Movie Inventory ---");
            System.out.println("1) Add Movie to Inventory");
            System.out.println("2) Search Movie");
            System.out.println("3) Delete Movie");
            System.out.println("4) Print All The Movies From Head");
            System.out.println("5) Print All The Movies From Tail");
            System.out.println("6) Print Movies Before 2000");
            System.out.println("7) Exit");
            System.out.print("Make a Selection: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Year: ");
                    int year = input.nextInt();
                    input.nextLine();

                    System.out.print("Title: ");
                    String title = input.nextLine();

                    System.out.print("Genre: ");
                    String genre = input.nextLine();

                    System.out.print("Director: ");
                    String director = input.nextLine();

                    ArrayList<Actor> actors = new ArrayList<>();
                    String actorName = "";
                    while (!actorName.equalsIgnoreCase("done")) {
                        System.out.print("Actor name ('done' for exit): ");
                        actorName = input.nextLine();
                        if (!actorName.equalsIgnoreCase("done")) {
                            System.out.print("Gender: ");
                            String actorGender = input.nextLine();

                            System.out.print("Nationality: ");
                            String actorNationality = input.nextLine();

                            Actor actor = new Actor(actorName, actorGender, actorNationality);
                            actors.add(actor);
                        }
                    }

                    Movie newMovie = new Movie(year, title, genre, director, actors);
                    movieList.addMovie(newMovie);
                    System.out.println("Movie Has Added Successfully!");
                    break;

                case 2:
                    System.out.print("Enter The Movie to Find: ");
                    String movieToFind = input.nextLine();
                    Movie foundMovie = movieList.findMovie(movieToFind);

                    if (foundMovie != null) {
                        System.out.println("Movie Found: " + foundMovie);
                    } else {
                        System.out.println("Movie Not Found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter The Movie Name to Remove: ");
                    String movieToRemove = input.nextLine();
                    movieList.removeMovie(movieToRemove);
                    System.out.println("Movie Removed!");
                    break;

                case 4:
                    movieList.printFromHead();
                    break;

                case 5:
                    movieList.printFromTail();
                    break;

                case 6:
                    movieList.printBefore2000();
                    break;

                case 7:
                    movieList.saveFile("Bilgiler.txt");
                    exit = true;
                    break;

                default:
                    System.out.println("Incorrect Entry! Please Try Again.");
                    break;
            }
        }
        input.close();
    }
}