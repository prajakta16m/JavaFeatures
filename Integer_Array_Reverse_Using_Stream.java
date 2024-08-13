*/
import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

public class MyClass {
  public static void main(String args[]) {
      
   
   int a[] = {4,6,1,5,7,8};
   
   List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
  
  
   List<Integer> result = list.stream()
        .sorted(Collections.reverseOrder())
        .collect(Collectors.toList());
        
        System.out.println(result);
        
        
        // OR
        
        list.stream()
        .sorted(Collections.reverseOrder())
        .forEach(System.out::println)
        .collect(Collectors.toList());
    

    
  }
}
