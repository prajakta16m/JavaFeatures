import java.util.*;
import java.util.stream.*;

public class Collectors {
    
  
    public static void main(String args[]) {
       
       // Find Duplicates using streams - Assigned to Set to get rid of duplicate values using - toSet()
      List<String> strings = Arrays.asList("A","B", "A", "C","B","E");
  
      System.out.println(Collections.frequency(strings, "A"));
      Set<String> nList = strings.stream()
        .filter(s -> Collections.frequency(strings, s) > 1 ).collect(Collectors.toSet());
       
      System.out.println(nList);

        // Joining

        // Find Duplicates using streams 
        List<String> strings = Arrays.asList("Prajakta", "Hali");
  
        String nList = strings.stream()
        .collect(Collectors.joining(".."));
       
        System.out.println(nList);
      
        // Prajakta..Hali
        
    }
}
