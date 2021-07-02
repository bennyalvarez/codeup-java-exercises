package practice;

public class MiniBus {

    MiniBus() {
        System.out.println("These are the details of your new Volkswagen Minibus... \n");
    }

    int cost = 100000;
    String color = "Sky Blue";
    byte capacity = 8;
    int maxSpeed = 65;
    boolean electricUpgrade = true;

    static void honk() {
        System.out.println("Honk Honk!");
    }

    static void slideDoor() {
        System.out.println("Side door automatically opens.");
    }


}
