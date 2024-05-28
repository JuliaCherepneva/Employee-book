import java.util.Objects;

public class Employee {
    private final String fullName;
    private int salary;
    private int dept;

    private int id;
    private static int count = 0;

    public Employee(String fullName, int salary, int dept) {
        this.fullName = fullName;
        this.salary = salary;
        this.dept = dept;

    }

    public String getFullName() {
        return fullName;
    }

    public int getSalary() {
        return salary;
    }

    public int getDept() {
        return dept;
    }

    public static int getId () {
        return count;
    }

    public static int getCount() {
        return ++ count;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getCount() + ". " + "Ф.И.О. сотрудника: " + fullName + ". ЗП = " + salary + " руб. " + "Отдел: " + dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return salary == salary && dept == employee.dept && id == id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, salary, dept, id);
    }

}
