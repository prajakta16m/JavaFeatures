import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

public class MyClass {
  public static void main(String args[]) {
      
   
   int a[] = {4,6,1,5, 4 ,7, 7 ,8};
   
   List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
   
   System.out.println(Arrays.toString(a));
  
   list.stream()
        .filter(i -> Collections.frequency(list, i) > 1)
        .distinct()
        .forEach(System.out::println);
    

    
  }
}