package practice;

public class Gun {
    String make = "Glock";
    String caliber = "9mm";
    long magazineLoad = 15;
    Boolean automatic = false;

    static void reload() {
        System.out.println("Gun has been reloaded.");
    }

    static void shoots() {
        System.out.println("bang bang!");
    }

}
