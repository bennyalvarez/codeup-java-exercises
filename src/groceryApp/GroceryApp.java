package groceryApp;


import util.Input;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GroceryApp {

//
//    public static void addToShoppingList(HashMap<String, ArrayList<Item>> list, Input in) {
//        System.out.println("Please select department: ");
//        int num = 1;
//        for (String department : list.keySet()) {
//            System.out.printf("%d: %s%n", num, department);
//            num++;
//        }
//        String selectedDepartment = "";
//        while (!list.containsKey(selectedDepartment))
//            selectedDepartment = in.getString("Please enter the name of the item's department:");
//        if (!list.containsKey(selectedDepartment)) {
//            System.out.println("Input invalid.\nPlease try again.");
//        }
//        String itemName = in.getString("Please enter the name of the item: ");
//        int itemQuantity = in.getInt("Please enter the item quantity:");
//        float itemPrice = (float) in.getDouble("Please enter item price");
//        in.getString();
//        System.out.printf("Please review the following item:%nItem Name: %s%nItem Department: %s%nItem Quantity: %d%nItem Price: $%.2f%nWould you like to add this item to your grocery list?",itemName, selectedDepartment, itemQuantity, itemPrice);
//        if (in.yesNo()) {
//            System.out.println("Item has been saved to list.");
//            list.get(selectedDepartment).add(new Item(itemName, itemQuantity, itemPrice));
//        }else {
//            System.out.println("Item discarded.\nAdd new item?");
//            if (in.yesNo()) {
//                addToShoppingList(list,in);
//            }
//        }
//    }


    public static void printList(HashMap<String, ArrayList<Item>> list) {
        System.out.println("Here is your current list of items: ");
        int categoriesGathered = 0;
        for (Map.Entry<String, ArrayList<Item>> pair : list.entrySet()) {
            if (!pair.getValue().isEmpty()) {
                categoriesGathered++;
                System.out.printf("%s:\n", pair.getKey());
                for (Item item : pair.getValue()) {
                    if (item.getQuantity() > 1) {
                        System.out.printf("    %s,%d,$%.2f each, $%.2f total%n", item.getName(), item.getQuantity(), item.getPrice(), (item.getQuantity() * item.getPrice()));
                    }else {
                        System.out.printf("    %s,$%.2f%n", item.getName(), item.getPrice());
                    }
                }
                System.out.println();
            }
        }
        if (categoriesGathered == 0) {
            System.out.println("\nList is currently empty.\nPlease add items to your grocery list.\n");
        }
    }

//
//    public static void runApp(HashMap<String, ArrayList<Item>> list, Input in) {
//        System.out.println("Welcome to the grocery store app!\n-----\n");
//        boolean run = true;
//        while (run) {
//            System.out.println("Please make your selection:");
//            System.out.println("1. Add new item to list");
//            System.out.println("2. View list");
//            System.out.println("3. Quit");
//            int userResponse = in.getInt("Please enter either 1, 2, or 3 into your terminal",1 ,3);
//            in.getString();
//            switch (userResponse) {
//                case 1:
//                    addToShoppingList(list, in);
//                    System.out.println("Returning to menu...\n");
//                    break;
//                case 2:
//                    printList(list);
//                    System.out.println("Returning to menu...\n");
//                    break;
//                default:
//                    System.out.println("Are you sure you want to quit?");
//                    if (in.yesNo()) {
//                        System.out.println("Thank you for choosing us!\nSee you soon!");
//                        run = false;
//                    }else {
//                        System.out.println("Returning to menu...\n");
//                    }
//            }
//        }
//    }


    public static void main(String[] args) {
//        Building the grocery list and menu categories.
        HashMap<String, ArrayList<Item>> list = new HashMap<>();
        list.put("Produce", new ArrayList<>());
        list.put("Bakery", new ArrayList<>());
        list.put("Meat", new ArrayList<>());
        list.put("Seafood", new ArrayList<>());
        list.put("Beer and Wine", new ArrayList<>());
        list.put("dry goods", new ArrayList<>());
        list.put("Frozen goods", new ArrayList<>());
        list.put("Dairy", new ArrayList<>());

//        runApp(list, new Input());
    }
}