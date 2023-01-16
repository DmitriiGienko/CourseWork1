public class Main {
    public static void main(String[] args) {
        PersonelManagement  staff = new PersonelManagement();
        staff.addEmployee("Филимонова Ольга Павловна", 1, 58500);
        staff.addEmployee("Вильгельмс Валерий Борисович", 2, 52000);
        staff.addEmployee("Фаткулин Ринат Исламович", 4, 57300);
        staff.addEmployee("Акимочкина Яна Юрьевна", 3, 53100);
        staff.addEmployee("Петросян Дмитрий Владимироваич", 3, 52500);
        staff.addEmployee("Торопина Ольга Владимировна", 2, 55200);
        staff.addEmployee("Гастренко Александра Ивановна", 4, 54200);
        staff.addEmployee("Горбунова Алена Дмитриевна", 5, 59200);
        staff.addEmployee("Яркова Екатерина Дмитриевна", 2, 59100);
        staff.addEmployee("Шомысова Наталья Ивановна", 5, 56200);

       staff.printAllEmployees();


//        for (Employee strings : employees) {
//            System.out.println(strings.toString());
//        }

// сумма зарплаты
        /*double sum = 0;
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
*/
    }


}