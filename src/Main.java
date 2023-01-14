public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Филимонова Ольга Павловна", 1, 58500);
        employees[1] = new Employee("Вильгельмс Валерий Борисович", 2, 52000);
        employees[2] = new Employee("Фаткулин Ринат Исламович", 4, 57300);
        employees[3] = new Employee("Акимочкина Яна Юрьевна", 3, 53100);
        employees[4] = new Employee("Петросян Дмитрий Владимироваич", 3, 52500);
        employees[5] = new Employee("Торопина Ольга Владимировна", 2, 55200);
        employees[6] = new Employee("Гастренко Александра Ивановна", 4, 54200);
        employees[7] = new Employee("Горбунова Алена Дмитриевна", 5, 59200);
        employees[8] = new Employee("Яркова Екатерина Дмитриевна", 2, 59100);
        employees[9] = new Employee("Шомысова Наталья Ивановна", 5, 56200);

// Печать всех сотрудников



//        for (Employee strings : employees) {
//            System.out.println(strings.toString());
//        }

// сумма зарплаты
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        System.out.println("Cуммa затрат на зарплаты в месяц составляет: " + sum + " рублей.");

// минимальная зарплата
        double minSalary = employees[0].getSalary();
        String employeeMinSal = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                minSalary = employees[i].getSalary();
                employeeMinSal = employees[i].getFullName();
            }
        }
        System.out.println("Сотрудник " + employeeMinSal + " получает минимальную зарплату " + minSalary + " рублей");

// максимальная зарплата
        double maxSalary = employees[0].getSalary();
        String employeeMaxSal = null;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                maxSalary = employees[i].getSalary();
                employeeMaxSal = employees[i].getFullName();
            }
        }
        System.out.println("Сотрудник " + employeeMaxSal + " получает максимальную зарплату " + maxSalary + " рублей");

// средняя зарплата
        System.out.println("Средняя зарплата составляет " + sum / employees.length);

        for (Employee names : employees) {
            System.out.println(names.getFullName());
        }

    }

    public  void printAllEmployee() {
        for (Employee strings : new Employee) {
            System.out.println(strings.toString());
        }

    }




}