import java.util.Scanner;

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

    //увеличиваем зарплату
    public void increaseSalary() {
        System.out.println("На сколько процентов повысим зарплату?");
        Scanner sc = new Scanner(System.in);
        double inc = sc.nextInt();
        double newSalary = 0.0;
        for (int i = 0; i < employee.length; i++) {
            newSalary = employee[i].getSalary() + (employee[i].getSalary() * (inc / 100));
            System.out.println("Зарплата сотрудника " + employee[i].getFullName()
                    + " повышена с " + employee[i].getSalary() + " до "
                    + newSalary + " руб.");
        }
    }

    //получить номер отдела
    public int getDepartmentNumber() {
        System.out.println("Выберите отдел с 1 по 5");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 0 && number <= 5) {
            return number;
        } else {
            throw new IllegalArgumentException("Не верно выбран отдел");
        }
    }

    // вывод минимальной зарплаты в отделе
    public void findMinSalaryDepEmployee() {
        int dep = getDepartmentNumber();
        double minSalary = 10000000;
        String empl = null;
        for (int i = 0; i < employee.length; i++) {
            if ((employee[i].getDep() == dep) && employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
                empl = employee[i].getFullName();
            }
        }
        System.out.println("В отделе №" + dep + " минимальна зарплата у " + empl
                + " и составляет " + minSalary + " руб.");
    }

    // вывод максимальной зарплаты в отделе
    public void findMaxSalaryDepEmployee() {
        int dep = getDepartmentNumber();
        double maxSalary = 0;
        String empl = null;
        for (int i = 0; i < employee.length; i++) {
            if ((employee[i].getDep() == dep) && employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
                empl = employee[i].getFullName();
            }
        }
        System.out.println("В отделе №" + dep + " максимальная зарплата у " + empl
                + " и составляет " + maxSalary + " руб.");
    }

    // вывод расхода на зарплаты в отделе
    public void printDepTotalSalary() {
        int dep = getDepartmentNumber();
        double depTotal = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDep() == dep) {
                depTotal += employee[i].getSalary();
            }
        }
        System.out.println("В отделе №" + dep + " сумма затрат на зарпату составляет " + depTotal + " руб.");
    }

    // вывод средней зарплаты в отделе
    public void printAverageDepSalary() {
        int dep = getDepartmentNumber();
        double sum = 0;
        int count = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDep() == dep) {
                sum += employee[i].getSalary();
                count++;
            }
        }
        System.out.println("Средняя зарплата в отделе №" + dep + " равна " + sum / count + " руб.");
    }

    // увеличиваем зарплату отдела
    public void increaseDepSalary() {
        int dep = getDepartmentNumber();
        System.out.println("На сколько повышаем зарплату?");
        Scanner sc = new Scanner(System.in);
        int inc = sc.nextInt();
        double newSaalary = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDep() == dep) {
                newSaalary = employee[i].getSalary() + (employee[i].getSalary() * (inc / 100));
                System.out.println("После повышения на " + inc + "% зарплата сотрудника "
                        + employee[i].getFullName() + " составляет " + newSaalary);
            }
        }
    }

    // выводим на печать сотрудников отдела
    public void printDepEmployee() {
        int dep = getDepartmentNumber();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getDep() == dep) {
                System.out.println(employee[i].toStringDep());
            }
        }
    }
}
