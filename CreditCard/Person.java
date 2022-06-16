package AJ_QAP2_CreditCard_GeraldBartlett;


 // identifies a person by name & address
public class Person {   
    private String lastName;
    private String firstName;
    private Address home;
    
    
    public Person(String lName, String fName, Address home)
    {  
        this.lastName = lName;
        this.firstName = fName;
        this.home = home;
    }
      

    // connects Person with address
    public Person(Person Address)
    {
        this.lastName = Address.lastName;
        this.firstName = Address.firstName;
        this.home = Address.home;
    }

    public String toString()
    {
        return (this.firstName + " " +   this.lastName+ ", " + this.home);
        
    }
    }
    