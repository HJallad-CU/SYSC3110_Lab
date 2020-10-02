public class BuddyInfo {

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    private String name;
    private String address;
    private String number;

    public BuddyInfo(String name, String address, String number){
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public static void main(String[] args) {
        BuddyInfo buddy1 = new BuddyInfo("waldo", "123 mainstreet", "6134158970");

        System.out.println("Hello " + buddy1.getName());

    }

}