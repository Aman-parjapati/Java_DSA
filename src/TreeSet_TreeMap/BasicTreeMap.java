package TreeSet_TreeMap;

import java.util.TreeMap;

public class BasicTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> mp = new TreeMap<>();
        mp.put("Aman", 18);
        mp.put("Adi", 16);
        mp.put("Alok", 19);
        mp.put("Ravi", 22);
        for(String ele : mp.keySet()){
            System.out.println(ele+ " " +mp.get(ele)); // this also in sorted order or ordered set/ map
        }
        System.out.println();
//        for(var ele : mp.entrySet()){
//            System.out.println(mp.get(ele.getKey()));
//        }
//        System.out.println();
        System.out.println(mp.get("Aman"));
        System.out.println(mp.containsKey("lunf"));;
        System.out.println(mp.putIfAbsent("Adi",56));
    }
}
