package HomeWork5;

public class Person {

    private String fullName;
    private String position;
    private String email;
    private String  phone;
    private int salary;
    private int age;

    public Person (String fullName, String position, String email, String phone, int salary, int age){
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void getEmployeeData(){
        System.out.println("ФИО работника: " + fullName);
        System.out.println("Должность работника: " + position);
        System.out.println("email: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }

    public int getAge(){
        return age;
    }

}

