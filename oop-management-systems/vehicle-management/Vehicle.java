public abstract class Vehicle {
    private String brand, licensePlate;
    private Person owner;

    public Vehicle(){
        this.brand = null;
        this.licensePlate = null;
        this.owner = null;
    }

    protected Vehicle(String brand, String licensePlate, Person owner){
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.owner = new Person(owner);
    }

    //Copier Constructor Method
    protected Vehicle(Vehicle other){
        this.brand = other.brand;
        this.licensePlate = other.licensePlate;
        this.owner = new Person(other.owner);
    }

    protected String getBrand() {
        return brand;
    }

    protected void setBrand(String brand) {
        this.brand = brand;
    }

    protected String getLicensePlate() {
        return licensePlate;
    }

    protected void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    protected Person getOwner() {
        return new Person(owner);
    }

    protected void setOwner(Person owner) {
        this.owner = new Person(owner);
    }

    public String toString(){
        return "Brand: " + brand + ", Licence Plate: " + licensePlate +
        "\nOwners " + owner.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Vehicle)){
            return false;
        }

        Vehicle other = (Vehicle) obj;
        return brand.equals(other.brand) &&
                licensePlate.equals(other.licensePlate) &&
                owner.equals(other.owner);
    }

    // Abstract Method From Bus Class
    public abstract int calculateTax();
}
