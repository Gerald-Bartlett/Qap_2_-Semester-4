package AJ_QAP2_CreditCard_GeraldBartlett;

public class Address {

    // city, street  name & number, state, zipCode
    private String street;
    private String city;
    private String state;
    private String zip;
   
   
    // Defines an address using a street, city, state, and zip code
    public Address(String road, String town, String st, String zipCode) 
    {
        this.street = road;
        this.city = town;
        this.state = st;
        this.zip = zipCode;
    }
   
    // returns the address
    public String toString()
    {
        return (this.street + ", " + this.city + ", " + this.state + ", " + this.zip);
        
    }
}
