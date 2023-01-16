public class PersonelManagement {
    private final Employee[] employee;
    private int numberOfEmployees;

    public PersonelManagement() {
        this.employee = new Employee[10];
    }

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

    // сумма затрат на зарплату
    public void printTotalPay() {
        double TotalSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            TotalSalary += employee[i].getSalary();
        }
        System.out.printf("\nСумма затрат на зарплаты сотрудников %.2f руб.\n", TotalSalary);
    }

    //сотрудник с минимальной зарплатой
    public void printEmpMinSal() {
        double minSalary = employee[0].getSalary();
        String employeeMinSal = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
                employeeMinSal = employee[i].getFullName();
            }
        }
        System.out.printf("\nCотрудник с минимальной зарплатой в %.2f руб.:\t%s\n", minSalary, employeeMinSal);
    }

    //сотрудник с максимальной зарплатой
    public void printEmpMaxSal() {
        double maxSalary = employee[0].getSalary();
        String employeeMaxSal = null;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
                employeeMaxSal = employee[i].getFullName();
            }
        }
        System.out.printf("\nCотрудник с максимальной зарплатой в %.2f руб.:\t%s\n", maxSalary, employeeMaxSal);
    }

    //расчет средней зарплаты
    public void printAverageSalary() {
        double TotalSalary = 0;
        for (int i = 0; i < employee.length; i++) {
            TotalSalary += employee[i].getSalary();
        }
        System.out.printf("\nСредняя зарплата составляет %.2f руб.\n", TotalSalary / numberOfEmployees);
    }

    //вывод ФИО сотрудников
    public void printFullNames() {
        System.out.println("\nСписок сотрудников:");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getFullName());
        }
    }


}
