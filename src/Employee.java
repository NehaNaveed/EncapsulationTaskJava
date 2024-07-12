public class Employee {

    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Invalid Salary Initialization: Salary cannot be negative");
        }
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void setName(String eName) {
        name = eName;
    }

    public String getName() {
        return name;
    }

    public void setPosition(String empPos) {
        position = empPos;
    }

    public String getPosition() {
        return position;
    }

    public void setSalary(double empSal) {
        if (empSal > 0) {
            salary = empSal;
        } else {
            System.out.println("Salary cannot be negative");
        }
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee emp = new Employee("", "", 0.0);  // Initializing with empty strings and 0 salary
        emp.setName("Carl");
        emp.setPosition("Lead Android Developer");
        emp.setSalary(150000.0);
        System.out.println("Name : " + emp.getName() + " | Position : " + emp.getPosition() + " | Salary : " + emp.getSalary() + " Rs");
        emp.setName("Sarah");
        emp.setPosition("Human Resources");
        emp.setSalary(190000.0);
        System.out.println("Updated => Name : " + emp.getName() + " | Position : " + emp.getPosition() + " | Salary : " + emp.getSalary() + " Rs");
    }
}
