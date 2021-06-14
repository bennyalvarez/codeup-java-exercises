package practice;

public class Persons {
    private String firstName;
    private String lastName;

    public String getFirstName(){ //getter
        //TODO: return the person's name
        return firstName;  //we can access the private String first name this way as long as it's within the class
    }

    public String getLastName(){ //getter
        return lastName;
    }

    public void setFirstName(String name){ //setter
        //TODO: change the name property to the passed value
        this.firstName = firstName;
    }

    public void setLastName(String name){ //setter
        //TODO: change the name property to the passed value
        this.lastName = lastName;
    }


}
