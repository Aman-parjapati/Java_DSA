package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class Basics {
    public static void main(String[] args) {
        // Syntax
        Map<String, Integer> mp = new HashMap<>();  //  instead of map I can write Hashmap

        // Creating key--value pair
        mp.put("Aman", 18);
        mp.put("Adi", 16);
        mp.put("Alok", 19);
        mp.put("Ravi", 22);

        // printing the values
        System.out.println(mp.get("Aman")); //18
        System.out.println(mp.get("Pooja")); //null--> doesn't exists

        // editing/updating new key value pair
        mp.put("Ravi", 25); //updates to 25
        System.out.println(mp.get("Ravi"));

        // removing key form the hashmap
        mp.remove("Ravi"); //removed
        System.out.println(mp.get("Ravi"));

        // Checking if a key exists in hashmap
        System.out.println(mp.containsKey("Aman")); //true
        System.out.println(mp.containsKey("Pooja")); //false

        // Checking if the value exists in the hashmap
        System.out.println(mp.containsValue(16)); //true
        System.out.println(mp.containsValue(22)); // False

        //Adding the new entry only if the key doesn't exist
        //method 1
        if(!mp.containsKey("Papa")) mp.put("Papa", 44);
        System.out.println(mp.get("papa"));
        // method 2
        mp.putIfAbsent("Mummy", 42);
        System.out.println(mp.get("Mummy"));

        // Get all the values in the hashmap
        System.out.println(mp.values());

        // Get all the keys in the hashmap
        System.out.println(mp.keySet());

        // get all the entries in the hashmap
        System.out.println(mp.entrySet());
        System.out.println();


        // traversing all the values of hashmap
        // method 1 ---> using keys
        for(String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n",key, mp.get(key));
        }
        System.out.println();
        // method 2  ---> using key value pair ie entries
        for(Map.Entry<String, Integer> e : mp.entrySet() ){
            System.out.printf("Age of %s is %d\n",e.getKey(), e.getValue());
        }
        System.out.println();
        // method 3 --->  same as m2
        for(var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(), e.getValue());
        }
    }
}
