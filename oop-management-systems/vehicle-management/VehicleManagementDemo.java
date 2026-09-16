public class VehicleManagementDemo {
    public static void main(String[] args) {
        ContactInfo info = new ContactInfo("Ankara","0506","Gmail");
        Person person = new Person("Onur",info);
        Bus otobus = new Bus("Tofas","43 ONR 35",person,30,5);
        System.out.println(otobus.toString());
        System.out.println("Tax to be paid for bus: " + otobus.calculateTax());
        Bus copyBus = new Bus(otobus);

        if (otobus.equals(copyBus)){
            System.out.println("These two buses are equal");
        }else{
            System.out.println("These two buses are not equal");
        }
    }
}