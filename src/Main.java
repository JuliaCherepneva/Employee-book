//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main  {
    private static Employee[] employees = new Employee[10];

    public Main(Employee[] employees) {
        this.employees = employees;
    }
    public Employee[] getEmployees() {
        return employees;
    }
    // Получить список всех сотрудников со всеми имеющимися по ним данными
    public static void printEmployee() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
    }
    // Посчитать сумму затрат на ЗП в месяц
    public static int printSum() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        System.out.println("Сумма затрат на ЗП в месяц: " + sum + " руб.");
        return sum;
    }
    // Подсчитать среднее значение зарплат
    public static int averageSum() {
        int averageSum = printSum () / employees.length;
        System.out.println("Среднее значение зарплат: " + averageSum + " руб.");
        return averageSum;
    }

    // Найти сотрудника с минимальной ЗП
    public static int minSalary() {
        Employee employee = employees[0];
        int minSalary = employee.getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minSalary) {
                employee = employees[i];
                minSalary = employee.getSalary();
            }
        }
        System.out.println("Минимальная ЗП: " + + employee.getSalary() + " руб. у сотрудника: " + employee.getFullName() + ".");
        return minSalary;
    }

    //Найти сотрудника с максимальной ЗП
    public static int maxSalary() {
        Employee employee = employees[0];
        int maxSalary = employee.getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > maxSalary) {
                employee = employees[i];
                maxSalary = employee.getSalary();
            }
        }
        System.out.println("Максимальная ЗП: " + employee.getSalary() + " руб. у сотрудника: " + employee.getFullName() + ".");
        return maxSalary;
    }
    // Распечатать ФИО всех сотрудников
    public static void printFullName() {
        for (int i = 0; i < employees.length; i++) {
            if (i == employees.length - 1) {
                System.out.println("Ф.И.О  сотрудника: " + employees [i].getFullName() + ".");
                break;
            }
            System.out.println("Ф.И.О  сотрудника: " + employees [i].getFullName() + ";");
        }
    }
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов Иван Иванович", 35_125, 1);
        Employee employee2 = new Employee("Петров Петр Петрович", 28_350, 1);
        Employee employee3 = new Employee("Иванова Надежда Ивановна", 30_120, 2);
        Employee employee4 = new Employee("Петрова Людмила Алексеевна", 25_430, 2);
        Employee employee5 = new Employee("Алексеев Алексей Алексеевич", 28_540, 3);
        Employee employee6 = new Employee("Сидоров Валерий Дмитриевич", 24_240, 3);
        Employee employee7 = new Employee("Мартынова Любовь Иннокентьевна", 20_565, 4);
        Employee employee8 = new Employee("Мурашкина Анна Павловна", 18_110, 4);
        Employee employee9 = new Employee("Иванчук Дмитрий Сергеевич", 17_590, 5);
        Employee employee10 = new Employee("Сергеев Павел Николаевич", 16_390, 5);
        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;

        printEmployee();
        averageSum ();
        printFullName ();
        minSalary ();
        maxSalary ();
    }
}
