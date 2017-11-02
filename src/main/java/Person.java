public class Person {
    private int id =  Integer.parseInt(String.format("%04d",(int)Math.floor(Math.random()*1000)));
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public Person(String firstName, String lastName){
        this(firstName,lastName,"Not given.", "Not given.");

    }

    public Person(String firstName, String lastName, String phoneNumber){
        this(firstName,lastName,phoneNumber, "Not given.");

    }

    public Person(String firstName,String lastName, String phoneNumber, String address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
