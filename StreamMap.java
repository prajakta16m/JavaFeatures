import java.util.*;
import java.util.stream.*;

public class StreamMap {
     static public void main(String args[]) {
     
        String name = "Prajakta";
       
        // list creation using charAt
        List<Character> list = new ArrayList<Character>();
        for(int i=0; i<name.length(); i++){
            list.add(name.charAt(i));
        }
        
        // list creation using stream
        List<Character> list1 = name.chars().mapToObj(e->(char)e).collect(Collectors.toList());
      
        System.out.println(list1);
        
        
        Map<Character,Long> map =
            list.stream()
            .filter(e -> Collections.frequency(list,e) > 1)
            .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
            
            System.out.println(map);

       /*
         OUTPUT:
           [P, r, a, j, a, k, t, a]
           {a=3}
       */
      
    }
}
