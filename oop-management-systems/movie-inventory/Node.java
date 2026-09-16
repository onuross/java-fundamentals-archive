public class Node {
    private Movie movie;
    private Node prev;
    private Node next;

    public Node(Movie movie){
        this.movie = movie;
        this.prev = null;
        this.next = null;
    }

    public Movie getMovie(){
        return movie;
    }

    public Node getPrev(){
        return prev;
    }

    public Node getNext(){
        return next;
    }

    public void setMovie(Movie movie){
        this.movie = movie;
    }

    public void setPrev(Node prev){
        this.prev = prev;
    }

    public void setNext(Node next){
        this.next = next;
    }

}

