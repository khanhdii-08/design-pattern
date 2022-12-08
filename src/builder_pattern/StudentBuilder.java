package builder_pattern;

public class StudentBuilder implements Builder{

    private String name;
    private int age;
    private String email;

    @Override
    public Builder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public Builder age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public Builder email(String email) {
        this.email=email;
        return this;
    }

    @Override
    public Student build() {
        return new Student(name, age, email);
    }


}
