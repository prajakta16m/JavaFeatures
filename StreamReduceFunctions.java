import java.util.*;
import java.util.stream.*;

public class MyClass {
    
    
    public static void main(String args[]) {
      
        // Find the longest String from list of Strings - - Alternate to reduce()
        List<String> words = Arrays.asList("GFG", "Geeks", "for", 
                                           "GeeksQuiz", "GeeksforGeeks"); 
                                           
        System.out.println(words.stream().max(Comparator.comparing(String::length)).get());

        // Output:: GeeksforGeeks

        // Get Sum of All elements - - Alternate to reduce()
        List<Integer> ints = Arrays.asList(1,2,3,4,5,6);
        
        System.out.println(ints.stream().mapToInt(Integer::intValue).sum());
	    System.out.println(ints.stream().mapToInt(Integer::intValue).min());
        System.out.println(ints.stream().mapToInt(Integer::intValue).min())
        
    }
}
