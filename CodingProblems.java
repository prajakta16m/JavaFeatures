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

    // Given string aaabbccdddd -> output occurrence as a3b2c2d5
    public static void main(String args[]) {
      
       String input = "aaabbccddddd";
       
       // expected output a3b3c2d5
       
       List<Character> list = input.chars().mapToObj(e->(char)e).collect(Collectors.toList());
       
       Set<String> result = list.stream()
            .map(s ->  s+String.valueOf(Collections.frequency( list, s)) )
            .collect(Collectors.toSet());
    
        System.out.println(String.join("",result));
        
        // output: b2d5a3c2
        
      }

    // output all positive integers not present in the array
    public static void main(String args[]) {
      
      int a[] = {3,6,-1,1};
      
      List<Integer> list =  Arrays.stream(a).boxed().collect(Collectors.toList());
      
      List<Integer> positiveInts = list.stream()
                .filter(n -> n > 0)
                .collect(Collectors.toList());
                
     int min = positiveInts.stream().min(Integer::compare).get();      
     int max = positiveInts.stream().max(Integer::compare).get();   
     
     for(int i = min; i < max; i++) {
         
         if(!positiveInts.contains(i)) {
              System.out.println(i);
         }
        
     }

}
