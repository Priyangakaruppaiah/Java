//Java program to sort a Map by values
import java.util.*;
import java.util.Map.Entry;

class Main {

  public static void main(String[] args) {
    LinkedHashMap<String, String> capitals = new LinkedHashMap();
    capitals.put("Nepal", "Kathmandu");
    capitals.put("India", "New Delhi");
    capitals.put("United States", "Washington");
    capitals.put("England", "London");
    capitals.put("Australia", "Canberra");

    
    Map<String, String> result = sortMap(capitals);

    for (Map.Entry entry : result.entrySet()) {
      System.out.print("Key: " + entry.getKey());
      System.out.println(" Value: " + entry.getValue());
    }
  }

  public static LinkedHashMap sortMap(LinkedHashMap map) {
    List <Entry<String, String>> capitalList = new LinkedList<>(map.entrySet());

    
    Collections.sort(capitalList, (l1, l2) -> l1.getValue().compareTo(l2.getValue()));

    
    LinkedHashMap<String, String> result = new LinkedHashMap();

    
    for (Map.Entry<String, String> entry : capitalList) {
      result.put(entry.getKey(), entry.getValue());
    }

    return result;
  }
}

        

