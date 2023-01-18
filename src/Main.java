public class Main {
    public static void main(String[] args) {
        EmployeeBook staff = new EmployeeBook();

        //метод добавления сотрудников
        staff.addEmployee("Филимонова Ольга Павловна", 1, 58500);
        staff.addEmployee("Вильгельмс Валерий Борисович", 2, 52000);
        staff.addEmployee("Фаткулин Ринат Исламович", 4, 57300);
        staff.addEmployee("Акимочкина Яна Юрьевна", 3, 53100);
        staff.addEmployee("Петросян Дмитрий Владимироваич", 3, 52500);
        staff.addEmployee("Торопина Ольга Владимировна", 2, 55200);
        staff.addEmployee("Гастренко Александра Ивановна", 4, 54200);
        staff.addEmployee("Горбунова Алена Дмитриевна", 5, 59200);
        staff.addEmployee("Яркова Екатерина Дмитриевна", 1, 59100);
        staff.addEmployee("Шомысова Наталья Ивановна", 5, 56200);


        // метод вывода всех сотрудников на экран
        staff.printAllEmployees();

        // сумма затрат на зарплату
        staff.printTotalPay();

        //сотрудник с минимальной зарплатой
        staff.printEmpMinSal();

        //сотрудник с максимальной зарплатой
        staff.printEmpMaxSal();

        //расчет средней зарплаты
        staff.printAverageSalary();

        //вывод ФИО сотрудников
        staff.printFullNames();

        //увеличиваем зарплату
        staff.increaseSalary();

        // вывод минимальной зарплаты в отделе
        staff.findMinSalaryDepEmployee();

        // вывод максимальной зарплаты в отделе
        staff.findMaxSalaryDepEmployee();

        // вывод расхода на зарплаты в отделе
        staff.printDepTotalSalary();

        // вывод средней зарплаты в отделе
        staff.printAverageDepSalary();

        // увеличиваем зарплату отдела
        staff.increaseDepSalary();

        // выводим на печать сотрудников отдела
        staff.printDepEmployee();

        //Вывод сотрудников с зарплатой меньше заданного числа
        staff.printSalaryLessThen();

        //Вывод сотрудников с зарплатой больше заданного числа
        staff.printSalaryMoreThen();

        //    метод удаления сотрудника по имени
        staff.deleteEmployeeByName("Фаткулин Ринат Исламович");

        //    метод удаления сотрудника по id
        staff.deleteEmployeeById(2);

        //метод изменения зарплаты сотрудника сотрудника
        staff.changeSalary("Шомысова Наталья Ивановна");

        //метод перевода сотрудника в другой отдел
        staff.changeDepartment("Шомысова Наталья Ивановна");

        //метод выводы ФИО по отделам
        staff.printInfoByDepartment();

    }


}