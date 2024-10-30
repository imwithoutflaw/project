public class Main {
    public static void main(String[] args) {
        Student student = new Student("S123", "Ivan", "Ivanov", 20);
        Employee employee = new Employee("Ivan", "Petro", "30");

        System.out.println(student.getInfo());

        System.out.println(employee.getInfo());
    }
}