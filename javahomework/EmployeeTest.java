class Employee{
private String Name;
 private int IDnumber;
private String Department;
private double Salary;
 public Employee(String Name, int IDnumber, String Department, double Salary) {
        this.Name = Name;
        this.IDnumber = IDnumber;
        this.Department = Department;
        this.Salary = Salary;
    }
public String getName(){
    return Name;
}
public int getIDnumber(){
    return IDnumber;
}
public String getDepartment(){
    return Department;
}
public double getSalary(){
    return Salary;
}
public void setName(String name){
    this.Name=name;
}
public void setIDnumber(int idnumber){
    this.IDnumber=idnumber;
}
public void setDepartment(String department){
    this.Department=department;
}
public void setSalary(double salary){
    this.Salary=salary;
}
}
 public class EmployeeTest{
public static void main(String args[]){  
    Employee e1=new Employee("Nandini",5679,"java",456.5);
    Employee e2=new Employee("Nandana",7656,"spring",877.9);

     System.out.println("Employee 1 Details:");
        System.out.println("Name: " + e1.getName());
        System.out.println("IDnumber: " + e1.getIDnumber());
        System.out.println("Department: " + e1.getDepartment());
        System.out.println("Salary: " + e1.getSalary());

        System.out.println("Employee 2 Details:");
        System.out.println("Name: " + e2.getName());
        System.out.println("IDnumber: " + e2.getIDnumber());
        System.out.println("Department: " + e2.getDepartment());
        System.out.println("Salary: " + e2.getSalary());
    }
}
 