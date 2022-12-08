package builder_pattern;

public interface Builder {
    public Builder name(String name);
    public Builder age(int age);
    public Builder email(String email);
    public Student build();
}
