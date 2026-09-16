public class ContactInfo {
    private String homeAddress, telNumber, eMail;

    // Parameterless Constructor Method
    public ContactInfo (){
        this.homeAddress = null;
        this.telNumber = null;
        this.eMail = null;
    }

    public ContactInfo(String homeAddress, String telNumber, String eMail){
        this.homeAddress = homeAddress;
        this.telNumber = telNumber;
        this.eMail = eMail;
    }

    // Copier Constructor Method
    public ContactInfo(ContactInfo other){
        this.homeAddress = other.homeAddress;
        this.eMail = other.eMail;
        this.telNumber = other.telNumber;
    }

    public String getHomeAddress(){
        return  homeAddress;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public String getEMail() {
        return eMail;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String toString(){
        return "Home Address: " + homeAddress + "\nTelephone Number: " + telNumber + "\nE-Mail: " + eMail;
    }

    public boolean equals(Object obj) {
        if (obj == this){
            return true;
        }
        if (!(obj instanceof ContactInfo)){
            return false;
        }
        ContactInfo other = (ContactInfo) obj;
        return homeAddress.equals(other.homeAddress) &&
                telNumber.equals(other.telNumber) &&
                eMail.equals(other.eMail);
    }
}
