public class BuddyInfo {

    public static String getName() {    //getter function to access data from a private object; static can only interact with static classes or elements
        return name;                    //a class or object being static means that it is independent of an instance of the class. It exists within a class and is the same in all instances of the class
    }

    public static String getAddress() {
        return address;
    }

    public static String getPhone() {
        return phone;
    }

    public BuddyInfo(String name, String address, String phone) {  //constructor variables needed to create an instance of our BuddyInfo class
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public BuddyInfo(){         //this is an overload constructor. Constructors can have the same name but different order of parameters
        this.name = "Input Name";
        this.address = "Input Address";
        this.phone = "Input Phone";
    }

    private static String name, address, phone;




   // public static void main(String[] args) {
     //   BuddyInfo Info1 = new BuddyInfo("Ryan", "2232 Frenchie Street", "6136129941");
       // System.out.print("Hello ");
        //System.out.println(Info1.name);
    //}
}
