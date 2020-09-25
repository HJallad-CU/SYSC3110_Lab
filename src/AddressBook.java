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
        buddyList.add(buddy);
    }

    public static void main(String[] args) {
        System.out.print("Address Book");
    }
}
