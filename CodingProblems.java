import java.util.*;
import java.util.stream.*;

public class CodingProblems {
    // 1: Find the duplicate strings in the sentence 
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

    // 2: Rotate array elements by number n starting from last element
    public static void main1(String args[]) {
    
        int[] a = {1,2,3,4,5};
        
        int n = 2;
        
        int l = a.length;
        
        int[] result = new int[5];
        
        int idx = l-1;
        for(int i=l-1; i>=0; i--){
            int swapIndx = (i+n)%l;
       
            result[swapIndx] = a[i];
          
        }
        
       System.out.println(Arrays.toString(result));
      }


}
