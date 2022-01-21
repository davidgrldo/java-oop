public class PolymorphismApp {
    public static void main(String[] args) {
        Employee employee = new Employee("John");
        employee.sayHello("Jane");

        employee = new Manager("Josh");
        employee.sayHello("Jose");

        employee = new VicePresident("Doe");
        employee.sayHello("Doo");

        sayHello(new Employee("John"));
        sayHello(new Manager("Josh"));
        sayHello(new VicePresident("Jane"));
    }

    static void sayHello(Employee employee) {
        System.out.println("Hello, " + employee.name);
    }
}
