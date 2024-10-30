class Student implements Person {
    private String name;
    private String surname;
    private int age;

    public Student(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    @Override
    public String getInfo() {
        return "Student: " + name + " " + surname + ", Age: " + age;
    }
}

