package Session2;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
       
        HashSet<String> hs = new HashSet<>();

        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cherry");
        hs.add("Date");
        hs.add("Srawberry");
        hs.add("Kiwi");

       
        System.out.println("Size of HashSet: " + hs.size());

        boolean removed = hs.remove("Banana");
        System.out.println("\nIs 'Banana' removed? " + removed);

        
        boolean notPresentRemoved = hs.remove("Grapes");
        System.out.println("Is 'Grapes' removed? " + notPresentRemoved);

      
        boolean containsCherry = hs.contains("Cherry");
        System.out.println("\nDoes the HashSet contain 'Cherry'? " + containsCherry);

    
        System.out.println("\nUpdated HashSet: " + hs);
    }
}
