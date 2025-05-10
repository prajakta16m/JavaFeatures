/* Java 17 sealed classes and switch pattern matching !
*/
import java.util.*;

public class Main {
  
  static class Shape {
    public String name;
    Shape(){
      name = "Shape";
    }
  }
  static class Circle extends Shape {}
  static class Square extends Shape {}
  static class Rectangle extends Shape {}
  
  public static String getName(Shape s) {
    return switch(s) {
      case Circle c -> "Circle";
      case Square s1 -> "Square";
      case Rectangle r -> "Rectangle";
      default -> "none";
    };
    
  }
  
    public static void main(String[] args) {
      System.out.println("Hello, World!");
     
      Shape s = new Shape();
      Circle c = new Circle();
      System.out.println(getName(c));
  }
  
  
}

public sealed class MyClass {
  
}

public non-sealed class MyChildClass1 extends MyClass {
  
}

public non-sealed class MyChildClass2 extends MyClass {
  
}
