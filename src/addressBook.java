import java.util.ArrayList;

public class addressBook {
    public ArrayList<BuddyInfo> addressList;
    private static BuddyInfo info1;
    private static BuddyInfo info2;

    public void printName(int i){
        System.out.println(addressList.get(i).getName());
    }
    /**
     * Main function stores info1 and info2 buddy info in
     * the collection called arrayList
     *
     * */
    public static void main(String[] args) {
        info1 = new BuddyInfo("Ryan", "2232 Frenchie Street", "6136129941");
        info2 = new BuddyInfo("Thomas", "565 Riley Crescent", "6478882229");
        addressBook abook = new addressBook();     //instantiated an object of the class addressbook

        abook.addBuddy(info1);
        //abook.addBuddy(info2);
        //abook.removeBuddy(0);
        abook.printName(0);
        //abook.printName(1);
        System.out.println("done!");
        System.out.println("Address Book");
    }
    public addressBook() {
        addressList = new ArrayList<>();
    }
    
    public void addBuddy(BuddyInfo infoLog){
        if(infoLog != null) {
            addressList.add(infoLog);
        }
    }

    public void removeBuddy(int index){
        addressList.remove(index);
    }

}
