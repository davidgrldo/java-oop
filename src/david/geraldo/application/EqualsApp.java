package david.geraldo.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "David";
        first = first + " " + "Geraldo";
        System.out.println(first);

        String second = "David Geraldo";
        System.out.println(second);
        System.out.println(first == second);
        System.out.println(first.equals(second));
        
        String third = "David Geraldo";
        System.out.println(second == third);
        System.out.println(second.equals(third));
    }
}
