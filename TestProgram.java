public class TestProgram {
    public static void main(String[] args) {
        // Тестируем все конструкторы:
        Employee[] employees = {new Employee("Вася", "Петров"),
                                new Employee("Вася", "Петров", 35),
                                new Employee("Гурген", "Заржавелли", 28, 2_000),
                                new Employee("Джамшут","Амраны", 31, 1_500)};

        // Тестируем toString():
        for (Employee emploee: employees) {
            System.out.println(emploee + "\n");
        }

        // Тестируем Сеттеры:
        employees[3].setFirstName("Равшан");
        employees[3].setLastName("Равын");
        employees[3].setAge(30);
        employees[3].setSalary(1_600);

        // Тестируем Геттеры:
        System.out.println(employees[3].getFullName());
        System.out.println(employees[3].getAge());
        System.out.println(employees[3].getSalary());

        System.out.println();

        // Тестируем работу метода eqals()
        System.out.println(employees[0].equals(employees[1])); // True
        System.out.println(employees[1].equals(employees[2])); // False
    }
}
