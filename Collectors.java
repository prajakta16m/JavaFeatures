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

        // Joining strings
        List<String> strings = Arrays.asList("Prajakta", "Hali");
  
        String nList = strings.stream()
        .collect(Collectors.joining(".."));
       
        System.out.println(nList);
      
        // Prajakta..Hali

        // GroupingBy length of strings
        List<String> givenList = Arrays.asList("boy", "cat", "head", "race");
      
        Map<Integer,Set<String>> result = givenList
        .stream()
        .collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        
        System.out.println(result);
        
        // {3=[cat, boy], 4=[head, race]}

        // PartitionaingBy - true false map with values as list of objects
        Map<Boolean,List<String>> result = givenList
        .stream()
        .collect(Collectors.partitioningBy(s -> s.length() >3));
        
        System.out.println(result);
        
        // {false=[boy, cat], true=[head, race]}
        
    }
}
