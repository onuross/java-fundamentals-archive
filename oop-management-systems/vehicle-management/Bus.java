public class Bus extends Vehicle {
    private int capacity, ageOfBus;

    public Bus(){
        super();
        this.capacity = 0;
        this.ageOfBus = 0;
    }

    public Bus(String brand, String licencePlate, Person owner, int capacity, int ageOfBus){
        super(brand,licencePlate,owner);
        this.capacity = capacity;
        this.ageOfBus = ageOfBus;
    }

    //Copier Constructor Method
    public Bus(Bus other){
        super(other);
        this.capacity = other.capacity;
        this.ageOfBus = other.ageOfBus;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getAgeOfBus() {
        return ageOfBus;
    }

    public void setAgeOfBus(int ageOfBus) {
        this.ageOfBus = ageOfBus;
    }

    public int calculateTax(){
        if (ageOfBus < 5){
            return 4000;
        } else if ((5 <= ageOfBus) && (ageOfBus <= 10)) {
            return 3000;
        }else {
            return 2000;
        }
    }

    public String toString(){
        return "Bus-> " + "Capacity: " +
                capacity + ", Age of Bus: " + ageOfBus + ", " +
                super.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Bus)){
            return false;
        }
        Bus other = (Bus) obj;
        return (super.equals(other)) && (this.capacity == other.capacity) && (this.ageOfBus == other.ageOfBus);
    }
}
