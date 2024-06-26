import java.util.*;
import java.util.stream.*;

public class MyClass {
    
    
    public static void main(String args[]) {
      
        // Find the longest String from list of Strings
        List<String> words = Arrays.asList("GFG", "Geeks", "for", 
                                           "GeeksQuiz", "GeeksforGeeks"); 
                                           
        System.out.println(words.stream().max(Comparator.comparing(String::length)).get());

        // Output:: GeeksforGeeks
        
    }
}
