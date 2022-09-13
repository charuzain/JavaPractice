// Create a class Employee with the following properties and methods:
// Salary (property) (int)
// getSalary (method returning int)
// name (property) (String)
// getName (method returning String)
// setName (method changing name)


class Employee {
  int salary;
  String name;

  public int getSalary() {
    return salary;
  }
  public String getName() {
    return name;
  }
  public void setName(String n) {
    name = n;
  }
};

public class Problem {
  public static void main(String[] args) {
    Employee charu = new Employee();
    charu.setName("CJ");
    System.out.println(charu.getName());
    charu.salary = 10;
    System.out.println(charu.getSalary());
  }
}
