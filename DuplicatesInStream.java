import java.util.*;
import java.util.stream.*;

public class DuplicatesInStream {
  
    
    public static void main(String args[]) {
       
       // Find Duplicates using streams 
      List<String> strings = Arrays.asList("A","B", "A", "C","B","E");
  
      System.out.println(Collections.frequency(strings, "A"));
      List<String> nList = strings.stream()
        .filter(s -> Collections.frequency(strings, s) > 1 ).collect(Collectors.toList());
       
       System.out.println(nList);
        
    }
}
