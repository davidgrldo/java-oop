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
        if(employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if(employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }
    }
}
