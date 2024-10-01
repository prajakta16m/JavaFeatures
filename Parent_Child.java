class Parent {
    public static void main() {
        System.out.println("Parent");
    }
    
    public static void print(){
        System.out.println("Static Parent");
    }
    
    public static void main(String[] args) {
        Parent p = new Child();
        p.main();
    }
}
class Child extends Parent {
    public static void main() {
        System.out.println("Child");
    }
    
     public static void print(){
        System.out.println("Static Child");
    }
}
