package hw_005_006;

import java.util.*;

public class hw {
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter name OR 'q' for EXIT: ");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("q")){
                break;
            }

            System.out.println("Enter telephone number: ");
            String telNumber = sc.nextLine();

            if (phoneBook.containsKey(name)) {
                List<String> telNumbers = phoneBook.get(name);
                telNumbers.add(telNumber);

                phoneBook.put(name, telNumbers);
            } else {
                List<String> telNumbers = new ArrayList<>();
                telNumbers.add(telNumber);
                phoneBook.put(name, telNumbers);
            }
        }

        List<Map.Entry<String, List<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());
        sortedEntries.sort((entry1, entry2) -> entry2.getValue().size() - entry1.getValue().size());
        
        
        System.out.println("Phonebook:");

        for (Map.Entry<String, List<String>> entry : sortedEntries) {
            String name = entry.getKey();
            List<String> telNumbers = entry.getValue();

            System.out.println(name + ": " + telNumbers);

        }
    sc.close();
    }

}
