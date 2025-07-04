// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

public class Driver {
    public static void main(String[] args) {
        Employee []emplist=new Employee[5];
        emplist[0]=new Employee("Kush","Manager","HR",50000);
        emplist[1]=new Employee("Saniya","Manager","HR",40000);
        emplist[2]=new Employee("Radha","team lead","Developement",80000);
        emplist[3]=new Employee("Piyush","Manager","HR",120000);
        emplist[4]=new Employee("Aayushi","Manager","Developement",800000);
        display(emplist);

        sortNameAsc(emplist);
        System.out.println();
        System.out.println(" sort in ASc by name");
        display(emplist);
        sortAssalaruAsc(emplist);
        System.out.println();
        System.out.println(" sort in ASc by salary");
        display(emplist);
    }
    public static void sortAssalaruAsc(Employee[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i].salary>arr[j].salary){
                    Employee t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }
    public static void sortNameAsc(Employee[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i].name.compareTo(arr[j].name)<0){
                    Employee t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }
    public static void display(Employee[] arr){
        for(Employee emp: arr)
            System.out.println(emp);
    }
}
class Employee {
    static int id=001;
    String empid;
    String name;
    String job;
    String department;
    double salary;


    Employee(String name, String job, String department, double salary) {
        this.empid=(name+"@"+((int)Math.random()*999)).trim().toLowerCase();
        this.name = name;
        this.job = job;
        this.department = department;
        this.salary = salary;
    }
    public String toString() {
        return "Employee [id=" + empid + ", name=" + name + ", job=" + job + ", department="+department+ ",Salary: "+salary+"]";
    }
}