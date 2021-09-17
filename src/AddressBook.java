import java.util.ArrayList;

public class AddressBook {

    ArrayList<BuddyInfo> bList = new ArrayList<BuddyInfo>();

    private void addBuddy(BuddyInfo buddy) {
        bList.add(buddy);
    }

    private void removeBuddy(BuddyInfo buddy) {
        bList.remove(buddy);
    }

    public static void main(String[] args){
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
