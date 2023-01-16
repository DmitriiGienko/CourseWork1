public class Main {
    public static void main(String[] args) {
        PersonelManagement staff = new PersonelManagement();
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

/*        staff.printAllEmployees();

        staff.printTotalPay();

        staff.printEmpMinSal();

        staff.printEmpMaxSal();

        staff.printAverageSalary();

        staff.printFullNames();

        staff.increaseSalary();*/

//        staff.findMinSalaryDepEmployee();

//        staff.findMaxSalaryDepEmployee();

        staff.printDepTotalSalary();

    }


}