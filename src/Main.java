public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ivan", "Ivanov", 20);
        Employee employee = new Employee("Petro", "Petrov", 30);

        System.out.println(student.getInfo());
        System.out.println(employee.getInfo());
    }
}