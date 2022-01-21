public class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager("John");
        manager.sayHello("Jane");

        var vicePresident = new VicePresident("Josh");
        vicePresident.sayHello("Jose");

        System.out.println(manager);
        System.out.println(vicePresident);
    }
}
