import java.util.*;
import java.util.stream.*;
import java.util.function.Consumer;

interface myFunctionalInterface{
    abstract int sum(int a, int b);
}
/*
*  Add 2 numbers using lambda expressions
*/
public class MyFunctionalInterface {
    public static void main(String args[]) {
    
    myFunctionalInterface myFunc = (a,b) -> {return a+b;};

      System.out.println(myFunc.sum(1,2));

      // OUTPUT : 3
     
    }
    
   
}
