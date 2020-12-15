package HomeWork5;

public class Staff {

    String fullName;

    String post;
    String email;
    String phone;
    int salary;
    int age;


    public Staff(String fullName, String post, String email, String phone, int salary, int age) {
        this.fullName = fullName != null ? fullName : null;
        this.post = post != null ? post : null;
        this.email = email != null ? email : null;
        this.phone = phone != null ? phone : null;
        this.salary = salary;
        this.age = age;
    }
    public Staff(String fullName){
        this(fullName,null,null,null,0,0);
    }
     void printInfo() {
        System.out.println(this);
    }

    public String toString() {
        return String.format("ФИО сотрудника: %s%n Должность: %s%n Email: %s%n Номер телефона: %s%n ЗП: %d%n Возраст сотрудника: %d%n",
                fullName, post, email, phone, salary, age);
    }

}
