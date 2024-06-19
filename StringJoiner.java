import java.util.*;

public class StringJoiner {

  public static void main(String args[]) {
       
       // StringJoiner
       List<String> list = Arrays.asList("Prajakta", "Hali");
       StringJoiner sj1 = new StringJoiner(",");
       
       sj1.add(list.get(0)).add(list.get(1));
       System.out:println(sj1);
        
    }
}
