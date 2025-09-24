class Student{
    private String name;
    private int rollNo;
    private int percentage;
public String getname(){
    return name;
}
public int getrollNo(){
    return rollNo;
} 
public int getpercentage(){
    return percentage;
} 
public void setname(String name){
    this.name=name;
} 
public void setrollNo(int rollNo){
    this.rollNo=rollNo;
} 
public void setpercentage(int percentage){
    this.percentage=percentage;
}
}
class StudentTest{
    public static void main(String[]args){
        Student s1=new Student();
        s1.setname("Nandini");
        s1.setrollNo(101);
        s1.setpercentage(85);
        System.out.println("Student Profile:");
        System.out.println("name:"+s1.getname());
        System.out.println("rollNo:"+s1.getrollNo());
        System.out.println("percentage:"+s1.getpercentage()+"%");
    }
}