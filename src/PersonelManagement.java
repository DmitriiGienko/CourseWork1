public class PersonelManagement {

    private final Employee[] employee;

    private int numberOfEmployees;

    public PersonelManagement() {
        this.employee = new Employee[10];
    }

   /* public int getId(int id) {
        return this.id=id;
    }*/

    public void addEmployee(String fullName, int dep, double salary) {
        Employee newEmployee = new Employee(fullName, dep, salary);
        employee[numberOfEmployees] = newEmployee;
        numberOfEmployees++;
    }

    // метод вывода всех сотрудников на экран
    public void printAllEmployees() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].toString());
        }
    }


}
