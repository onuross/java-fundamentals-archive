public class Actor {
    private String name;
    private String gender;
    private String nationality;

    // Constructor Methods
    public Actor(String name, String gender, String nationality){
         this.name = name;
         this.gender = gender;
         this.nationality = nationality;
    }

    public Actor(){
        this.setName(null);
        this.setGender(null);
        this.setNationality(null);
    }

    public Actor(Actor actor){
        this.setName(actor.getName());
        this.setGender(actor.getGender());
        this.setNationality(actor.getNationality());
    }

    // Getter and Setter methods for Encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString(){
        return name + ", " + gender + ", " + nationality;
    }
}
