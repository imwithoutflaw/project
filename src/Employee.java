class Employee implements Person {
    private String id;
    private String name;
    private String surname;
    private int age;

    public Employee(String id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String getInfo() {
        return "Employee ID: " + id + ", Name: " + name + " " + surname + ", Age: " + age;
    }

    @Override
    public int getYearsUntilRetirement() {
        int retirementAge = 65;
        return Math.max(0, retirementAge - age);
    }
}
