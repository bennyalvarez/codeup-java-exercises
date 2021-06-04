public class practice {
//    public static void main(String[] args) {
//        System.out.println("Welcome to our zombie killer program!!!!");
//
//        String backpack[] = {"Shotgun", "Assault Rifle", "Sniper", };//list of whatever you want.
//        String zombies[] = {"Close-range zombie", "Mid-range zombie", "Long-range zombie"};
//        int numbersZombiesHATE[] = {4, 90, 70, 123, 12, 4, 561, 1};
//
//        System.out.println("Backpack items!");
//        System.out.println(backpack[0]);
//        System.out.println(backpack[1]);
//        System.out.println(backpack[2]);
//
//        System.out.println("These are the zombies!");
//        System.out.println(zombies[0]);
//        System.out.println(zombies[1]);
//        System.out.println(zombies[2]);
//
//    }

    public static void main(String[] args) {
        double grades[] = {96.5, 98.7, 99.3, 88.4, 88.6, 90.1};
        double max; //variable called max

        int i;

        max = grades[0]; //this is just the starting point then the loop below will compare each grade.

        for(i = 0; i<=5; i++)
        {
            if(grades[i] > max)max = grades[i];
        }
        System.out.println("\n\nThe max grade in the class is: " + max);
    }

}
