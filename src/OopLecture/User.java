package OopLecture;

public class User {
    public int id;
    public String username;
    private String password;
    public String email;
    private boolean isLoggedIn = false;

    public String getPassword(){
        return password;
    }

    public User(int id, String username, String password, String email, boolean isLoggedIn) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.isLoggedIn = isLoggedIn;
    }

    public String setPassword(String password) {
        return this.password = password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.isLoggedIn = loggedIn;
    }

    public void describeUser(){
        System.out.println("Username: " + this.username);
        System.out.println("Password: " + this.password);
        System.out.println("Email: " + this.email);
        System.out.println("Logged in? " + this.isLoggedIn);

    }

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public User() {};

    public static void main(String[] args) {
        User testUser = new User();
        testUser.id = 1;
        testUser.username = "jayman";
        testUser.password = "password";
        testUser.email = "jayman@email.com";

        System.out.println("Username: " + testUser.username);
        System.out.println("Password: " + testUser.password);
        System.out.println("Email: " + testUser.email);
        System.out.println("Logged in? " + testUser.isLoggedIn);

        User user2 = new User("codeup-dude", "gocodeup", "codeup@email.com");

        System.out.println("Username: " + user2.username);
        System.out.println("Password: " + user2.password);
        System.out.println("Email: " + user2.email);
    }
}

//package OopLecture;
//
//public class User {
//    public int id;
//    public String username;
//    public String password;
//    public String email;
//    private boolean isLoggedin = false;
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String setPassword(String password) {
//        return this.password = password;
//        //return because it is not void.
//    }
//
//    //short cut, right click, generate, you can choose: constructor, getter, setter, or both.
//    //then pick the parameters you want from 1 to more. then it'll create constructor for you.
//
//    public boolean isLoggedin() {
//        return isLoggedin;
//    }
//
//    public void setLoggedin(boolean loggedin) {
//        isLoggedin = loggedin;
//    }
//
//    //creating a constructor
//    public User(String username, String password, String email) {
//        this.username = username;
//        this.password = password;
//        this.email = email;
//    }
//
//    //using method overloading -same name.
//    public User() {}
//
//    public static void main(String[] args) {
//        User testUser = new User();
//        testUser.id = 1;
//        testUser.username = "jayman";
//        testUser.password = "password";
//        testUser.email = "jayman@email.com";
//        LogIn(testUser);
//
//        System.out.println("Username: " + testUser.username);
//        System.out.println("Password: " + testUser.password);
//        System.out.println("Email: " + testUser.email);
//
//        User user2 = new User("codeup-dude", "gocodeup", "codeup@email.com");
//
//        System.out.println("Username: " + user2.username);
//        System.out.println("Password: " + user2.getPassword());
//        System.out.println("Email: " + user2.email);
//
//        System.out.println(user2.getPassword());
//
//        changePassword(user2);
//
//
//
//
//    }
//}
//
//
