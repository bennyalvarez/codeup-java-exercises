package practice;

public class LearnJava {
    public static void main(String[] args) {
        //this is an example of casting. you can go from small to big but to go big to small, you need to add ()
        //to specify the type.
//        double a = 9.0;
//        int b = (int) a;
//        System.out.println(a);
//        System.out.println(b);
//        int sum1 = 50 + 100;
//        int sum2 = sum1 + 250;
//        int sum3 = sum2 + sum2;
//
//        System.out.println(sum1);
//        System.out.println(sum2);
//        System.out.println(sum3);

        //if/else/else if statements

//        int time = 19;
//
//        if(time < 10) {
//            System.out.println("Good morning");
//        } else if(time < 20){
//            System.out.println("Good day");
//        } else {
//            System.out.println("Good evening");
//        }

//        String text = "adobo";
//
//        if(text.equals("tacos")) {
//            System.out.println("Yay! Tacos!");
//
//        } else if(text.equals("pizza")) {
//            System.out.println("Yay! Pizza!");
//        } else if(text.equals("bulgogi")) {
//            System.out.println("Yay! Buglogi!");
//        } else if(text.equals("rice")) {
//            System.out.println("Yay! Rice");
//        } else if(text.equals("adobo")) {
//            System.out.println("Yay! Adobo!");
//        } else {
//            System.out.println("Nice Something new!");
//        }
            //switch cases are not often used because of some logical issues but good for readability.
//            int day = 2;
//
//            switch(day) {
//                case 1:
//                    System.out.println("Monday");
//                    break;
//                case 2:
//                    System.out.println("Tuesday");
//                    break;
//                case 3:
//                    System.out.println("Wednesday");
//                    break;
//                case 4:
//                    System.out.println("Thursday");
//                    break;
//                case 5:
//                    System.out.println("Friday");
//                    break;
//                case 6:
//                    System.out.println("Saturday");
//                    break;
//                case 7:
//                    System.out.println("Sunday");
//                    break;
//                default:
//                    System.out.println("Not a valid day!");
//            }
                    //do a do while loop when you don't know how many times to run your code.
//                    int a = 7;
//                    do {
//                        System.out.println("I luv bacon");
//                        a++;
//                    } while(a <5);
//                int count = 1;
//
//                while(count <= 10) {
//                    System.out.println(count);
//                    count +=1; //the same as count++
//                }
                  //if you know how many times you do need to run code...
//                  String[] cars = {"bmw", "vw", "toyota"};
//                    //enhanced loop which is a cleaner way.
//                  for(String c : cars) {
//                      System.out.println(c);
//                  }
                    String s = "Daft Punk";

                    for(int i = 0; i < s.length(); i++) {
                        System.out.println(s.charAt(i));
                    }


    }
}
