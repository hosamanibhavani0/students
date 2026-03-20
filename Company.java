class Employee
{
 void work()
 {
  System.out.println("Employee works");
 }
}
class Developer extends Employee
{
 void code()
 {
  System.out.println("Developer writes code");
 }
}
class Manager extends Employee
{
 void manage()
 {
  System.out.println("Manger manages team");
 }
}
public class Company
{
 public static void main(String[] args)
 {
  Developer d=new Developer();
  d.work();
  d.code();
  Manager m=new Manager();
  m.work();
  m.manage();
 }
}