import java.util.*;
public class AddressBook {
    ArrayList<BuddyInfo> buddyList;

    public AddressBook(){
        buddyList = new ArrayList<>();
    }

    public void addBuddy(BuddyInfo buddy){
        buddyList.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        buddyList.remove(buddy);
    }
    //git pull check
    public void printHello(){
        System.out.print("Hello World!");
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("abdul", "kanata", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);

    }
}
