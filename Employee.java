import java.util.Objects;

//Создать класс Employee (сотрудник), у которого:
//        1.1 Есть приватное поле String firstName (имя)
//        1.2 Есть приватное поле String lastName (фамилия)
//        1.3 Приватное поле int age (возраст)
//        1.4 Приватное поле double salary (зарплата)
//        2.1 Есть метод getAge, который возвращает возраст
//        2.2 Есть метод getSalary, который возвращает зарплату
//        2.3 Есть метод getFullName, который возвращает конкатенацию firstName и lastName
//        2.4 Есть методы (сеттеры) для изменения всех полей (setAge, setSalary, setFirstName, setLastName)
//        3.1 Есть конструктор, который принимает все 4 поля
//        3.2 Есть конструктор, который принимает firstName, lastName и возраст (зарплата по умолчанию 1_000.0)
//        3.3 Есть конструктор, который принимает firstName, lastName (зарплата по умолчанию 1_000.0, возраст по умолчанию 25)
//        4. Реализовать метод toString, который выводит информацию о сотруднике в строковом представлении (формат придумать самостоятельно).
//        5. Реализовать методы equals и hashCode, которые учитывают только firstName и lastName.

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    // Конструкторы

    public Employee(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    // Вот эти два конструктора ниже можно реализовать вызвав первый и передав в него значения,
    // но мне больше нравится такая реализация
    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = 1_000.0;
    }

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 25;
        this.salary = 1_000.0;
    }

    // Геттеры

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    // Сеттеры

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Этот метод можно по идее переписать еще с использованием Геттеров, но мне больше нравится такая реализация
    @Override
    public String toString() {
        return "Employee:\n" +
                "Имя работника: " + firstName +
                "\nФамилия работника: " + lastName +
                "\nВозраст: " + age +
                "\nЗарплата: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}