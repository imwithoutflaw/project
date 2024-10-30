class Student implements Person {
    private String id;
    private String name;
    private String surname;
    private int age;

    public Student(String id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String getInfo() {
        return "Student ID: " + id + ", Name: " + name + " " + surname + ", Age: " + age;
    }

    @Override
    public int getYearsUntilRetirement() {
        int retirementAge = 65;
        return Math.max(0, retirementAge - age);
    }
}
