import java.io.InputStream;

public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {

        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public static void main(String[] args) {

        BuddyInfo n = new BuddyInfo("Homer","Carleton","613");
        System.out.println("Hello " + n.getName() + ", your address is " + n.getAddress() + ", your phone number is " + n.getPhoneNumber());
    }
}

