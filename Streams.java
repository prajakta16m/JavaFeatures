import java.util.*;
import java.util.stream.*;

public class MyClass {
    
    static class Employee {
        private String name;
        private Integer salary;
        private Address add;
        
        Employee(String n, Address a, Integer no){
            name = n;
            add = a;
            salary = no;
        }
        
        public String getName(){ return name;}
        public Address getAdd() { return add;}
        
        public String toString(){
            return "Employee: "+ name + " lives at "+ add + " earns = " + salary  ;
        }
    }
    static class Address {
        private String city;
        private String state;
        
        Address(String n, String a){
            city = n;
            state = a;
        }
        
        public String getCity(){ return city;}
        public String getState() { return state;}
     
        public String toString(){
            return city + "," + state;
        }
    }
    
    public static void main(String args[]) {
        
        Address a1 = new Address("pune", "mh");
        Employee e1 = new Employee("Prajakta", a1, 10000 );
        
        Address a2 = new Address("Bangalore", "karnataka");
        Employee e2 = new Employee("Manish", a2 , 50000);
        
        List<Employee> empList = Arrays.asList(e1,e2);
        empList.stream().forEach(System.out::println);
        
        System.out.println();
        
        empList.stream().filter(e -> e.salary > 10000).forEach(System.out::println);
        Long cnt = empList.stream().count();
        System.out.println("Count = "+cnt);
      
        empList.stream()
            .filter(e -> e.add.getCity().toLowerCase().equals("pune"))
            .forEach(System.out::println);

        // collect names of all employees in a list who have sal > 10000
        System.out.println();
        List<String> empName = empList.stream()
            .filter(e -> e.salary > 10000)
            .map(Employee::getName)
            .collect(Collectors.toList());
            
        System.out.println("List of employee names with salary > 10000 = "+empName);    
    }
}
