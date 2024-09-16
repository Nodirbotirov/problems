package pattern.factory;

public class App {
    public static void main(String[] args) {
        ComputerFactory computerFactory = ComputerFactory.getInstance();
        Computer Computer = computerFactory.buildComputer(
                1000,
                32,
                3600,
                "Asus z690",
                "Intel Core I5 11400f"
        );
    }
}
