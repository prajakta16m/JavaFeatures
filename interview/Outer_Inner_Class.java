// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Parent {
    
    private String name;
    
    Parent(){
        name = "Parent";
    }
    
    public static void main() {
        System.out.println("Parent - main");
    }
    
    public static void print(){
        System.out.println("Parent - static");
    }
    
    public static void main(String[] args) {
        Parent p = new Child();
        p.main();
        
        Inner inner = p.new Inner();
        inner.print();
        
        System.out.println(inner.innerName);
    }
    
    class Inner{
        private String innerName;
        Inner(){
            innerName = "Inner";
        }
        public void print(){
             System.out.println("Inner - print "+name);
        }
        
    }
}
class Child extends Parent {
    public static void main() {
        System.out.println("Child - main");
    }
    
     public static void print(){
        System.out.println("Child - static");
     }
}
