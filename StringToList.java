/*
* Convert input string to list of characters
*/

import java.util.*;
import java.util.stream.*;

public class MyClass {
  public static void main(String args[]) {
   
   String input = "Prajakta";
   
   List<Character> list = input.chars().mapToObj(e->(char)e).collect(Collectors.toList());

    System.out.println(list);;
  }
}
