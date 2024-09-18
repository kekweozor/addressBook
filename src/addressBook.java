import java.util.ArrayList;

public class addressBook {
    public ArrayList<BuddyInfo> addressList;
    private static BuddyInfo info1 = new BuddyInfo("Ryan", "2232 Frenchie Street", "6136129941");
    private static BuddyInfo info2 = new BuddyInfo("Thomas", "565 Riley Crescent", "6478882229");
    private static addressBook addressBook = new addressBook();     //instantiated an object of the class addressbook


    /**
     * Main function stores info1 and info2 buddy info in
     * the collection called arrayList
     *
     * */
    public static void main(String[] args) {

        addressBook.addBuddy(info1);
        addressBook.addBuddy(info2);
        addressBook.removeBuddy(info1);
        System.out.println(addressBook.addressList.get(1).getName());
        System.out.println("done!");
        System.out.println("Address Book");
    }
    public addressBook() {
        this.addressList = new ArrayList<>();
    }
    
    public void addBuddy(BuddyInfo infoLog){
        this.addressList.add(infoLog);
    }

    public void removeBuddy(BuddyInfo infoLog){
        this.addressList.remove(infoLog);
    }

}
