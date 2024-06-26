import java.util.*;
import java.util.stream.*;

public class MyClass {
    
    static class Employee {
        private String name;
        private Integer salary;
        private Address add;
        private List<Integer> mobileNums;
        
        Employee(String n, Address a, Integer no, List<Integer> nos){
            name = n;
            add = a;
            salary = no;
            mobileNums = nos;
        }
        
        public String getName(){ return name;}
        public Address getAdd() { return add;}
        public Integer getSalary(){ return salary; }
        public List<Integer> getMobileNos(){ return mobileNums; }
        
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
        
      
        List<Integer> nos = new ArrayList();
        nos.add(9766);
        nos.add(9970);
        
        Address a1 = new Address("pune", "mh");
        Employee e1 = new Employee("Prajakta", a1, 10000, nos );
        
        Address a2 = new Address("Bangalore", "karnataka");
        Employee e2 = new Employee("Manish", a2 , 50000, nos);
        
        Address a3 = new Address("Chennai", "TN");
        Employee e3 = new Employee("Preeti", a3 , 15000, nos);
        
        List<Employee> empList = Arrays.asList(e1,e2,e3);
        empList.stream().forEach(System.out::println);
        
        System.out.println();
        
        empList.stream().filter(e -> e.salary > 10000).forEach(System.out::println);
        Long cnt = empList.stream().count();
        System.out.println("Count = "+cnt);
      
        empList.stream()
            .filter(e -> e.add.getCity().toLowerCase().equals("pune"))
            .forEach(System.out::println);
            
        // min max
        System.out.println();
        List<Integer> list1 = Arrays.asList(5,7,3,8,2,9,1);
        Integer max_value = list1.stream().max(Integer::compare).get();
        System.out.println("Max value = "+max_value);
        
        //Find employee’s name who has min salary
        System.out.println();
        System.out.println("employee’s name who has min salary: ");
        Employee minSal = empList.stream()
            .min(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("Minimum salary = "+ minSal.getName());
        
        // collect names of all employees in a list who have sal > 10000
        System.out.println();
        String empName = empList.stream()
            .filter(e -> e.salary > 10000)
            .map(Employee::getName)
            .findFirst()
            .orElseGet(null);
            
        System.out.println("List of employee names with salary > 10000 = "+empName);    
        
        // sort the list based on Salary asc and desc
        System.out.println();
        List<Employee> newList =  empList.stream()
            .sorted(Comparator.comparing(Employee::getSalary))
            .collect(Collectors.toList());
        
        List<Employee> newList1 =  empList.stream()
            .sorted(Comparator.comparing(Employee::getSalary).reversed())
            .collect(Collectors.toList());
            
        System.out.println("New sorted newList1:");
        System.out.println(newList1);
        
        System.out.println();
        //Find out all employee’s mobile numbers in a single List.
        List flatList = empList.stream()
            .map(e -> e.mobileNums)
            .flatMap(Collection::stream)
            .collect(Collectors.toList());
        System.out.println(flatList);

        // Collectors.collectingAndThen

        System.out.println();
        
        Map<String,Integer> empList1 = empList.stream()
            .filter(s -> s.getSalary() < 20000)
            .collect(Collectors.groupingBy(
                    Employee::getName,
                    Collectors.collectingAndThen(
                            Collectors.counting(), 
                            f -> f.intValue()
                        )
                    )
                );
             
        System.out.println(empList1);
        
    }
}
