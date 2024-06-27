import java.util.*;
import java.util.stream.*;

public class CodingProblems {
    
    public static void main(String args[]) {

      /* Find the duplicate strings in the sentence */
      
       String str = "this is my call my own call with new person call";
       String[] arr = str.split(" ");

      List<String> input = Arrays.asList(arr);
      System.out.println();
      Map<String,Integer> map = input.stream()
                    .collect(Collectors.toMap(s->s, 
                        s->Collections.frequency(input, s), (x1, x2) -> x1));
                        
      System.out.println(map.entrySet().stream()
                        .filter(v-> v.getValue() > 1).collect(Collectors.toList()));
                        
      // OUTPUT:
      /*
        [this, is, my, call, my, own, call, with, new, person, call]
        [call=3, my=2]
      */
    }
}
