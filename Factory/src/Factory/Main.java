package Factory;

/**
 * @author Yağız Ünal on 10/19/21.
 * @project DesignPatterns.Factory
 **/
public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car mercedes = carFactory.createCar("mercedes", "G63 AMG", "2020");
        mercedes.drive();

        Car bmw = carFactory.createCar("Bmw", "420d", "2022");
        bmw.drive();
    }
}
