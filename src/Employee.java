public class Employee {
    private String fullName;
    private int dep;
    private double salary;
    private int id;
    public static int count = 0;


    public Employee(String fullName, int dep, int salary) {
        this.fullName = fullName;
        this.dep = dep;
        this.salary = salary;
        count += 1;
        this.id = count;

    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDep() {
        return dep;
    }

    public void setDep(int dep) {
        this.dep = dep;
    }

   /* @Override
    public String toString() {
        return "Сотрудник: " + fullName + "\n" +
                "..........отдел: " + dep + "\n" +
                "..........зарплата: " + salary + "\n" +
                "..........Id: " + getId()+ "\n" + "=========================================";
    }*/

}
