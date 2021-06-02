

public class Person {


    private String name;

    public String getName(){ //getter
    //TODO: return the person's name
        return name;  //we can access the private String name this way as long as it's within the class
    }

    public void setName(String name){ //setter
    //TODO: change the name property to the passed value
        this.name = name;
    }
    public void sayHello(){ //method
    //TODO: print a message to the console using the person's name
        System.out.println("Hello from " + this.name);
    }


    //The class should have a constructor that accepts a `String` value and sets
    //The person's name to the passed string.

    public Person() {};

    public Person(String name) {
        this.name = name;
    }


    //    Create a `main` method on the class that creates a new `Person` object and
    //    tests the above methods.

    public static void main(String[] args) {
        Person p1 = new Person("Rudy");
        //to test methods, do a bunch of souts.
        System.out.println(p1.getName());
        p1.setName("Rudolph"); //because it's public void, done this way
        System.out.println(p1.getName());
        p1.sayHello();
    }
    //If you want to change it later on. Like a user in your app wants to change their username, you’d need a setter.

}
