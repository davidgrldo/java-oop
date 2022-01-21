public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("David", "Bekasi");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("John");

        Person person2 = new Person("Jane");

        Person person3;
        person3 = new Person();
        person3.name = "Josh";
        person3.sayHello("Jen");
    }
}
