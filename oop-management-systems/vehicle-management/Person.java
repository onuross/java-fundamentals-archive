public class Person {
    private String name;
    private ContactInfo contactInfo;

    // Parameterless Constructor Method
    public Person(){
        this.name = null;
        this.contactInfo = null;
    }

    protected Person(String name, ContactInfo contactInfo){
        this.name = name;
        this.contactInfo = new ContactInfo(contactInfo);
    }

    //Copier Constructor Method
    protected Person(Person other){
        this.name = other.name;
        this.contactInfo = new ContactInfo(other.contactInfo);
    }

    protected String getName() {
        return name;
    }

    protected ContactInfo getContactInfo() {
        return new ContactInfo(contactInfo);
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = new ContactInfo(contactInfo);
    }

    public String toString(){
        return "Name: " + name + "\n" + contactInfo.toString();
    }

    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if (!(obj instanceof Person)){
            return false;
        }

        Person other = (Person) obj;
        return name.equals(other.name) &&
                contactInfo.equals(other.contactInfo);
    }
}
