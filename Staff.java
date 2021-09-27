public class Staff {
    private String name;
    private String post;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    Staff(String name, String post, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void info() {
        System.out.println("Name: " + name + ",\nPost: " + post + ",\nEmail: " + email + ",\nPhone number; " + phoneNumber + ",\nSalary: " + salary + ",\nAge: " + age);
    }

    public String toString() {
        return "Name: " + name + ",\nPost: " + post + ",\nEmail: " + email + ",\nPhone number; " + phoneNumber + ",\nSalary: " + salary + ",\nAge: " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}