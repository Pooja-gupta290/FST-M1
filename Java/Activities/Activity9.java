package Session2;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        
        ArrayList<String> myList = new ArrayList<>();

        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("David");
        myList.add("Eve");

        System.out.println("Names in the ArrayList:");
        for (String name : myList) {
            System.out.println(name);
        }

        String thirdName = myList.get(2); 
        System.out.println("\nThe 3rd name in the list is: " + thirdName);

        String nameToCheck = "David";
        boolean exists = myList.contains(nameToCheck);
        System.out.println("\nDoes the name '" + nameToCheck + "' exist in the list? " + exists);

        System.out.println("\nNumber of names in the list: " + myList.size());

        String nameToRemove = "Bob";
        myList.remove(nameToRemove); 
        System.out.println("\nName '" + nameToRemove + "' removed from the list.");

        System.out.println("Number of names in the list after removal: " + myList.size());
    }
}
