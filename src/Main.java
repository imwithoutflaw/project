public class Main {
    public static void main(String[] args) {
        Student student = new Student("S123", "Ivan", "Ivanov", 20);
        Employee employee = new Employee("E456", "Petro", "Petrov", 30);

        System.out.println(student.getInfo());
        System.out.println("Years until retirement: " + student.getYearsUntilRetirement());

        System.out.println(employee.getInfo());
        System.out.println("Years until retirement: " + employee.getYearsUntilRetirement());
    }
}