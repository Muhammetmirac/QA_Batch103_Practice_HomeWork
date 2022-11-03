package AccesModifier02;

import AccesModifier01.Car;

public class CarModel extends Car {
    public static void main(String[] args) {
        Car car3 = new Car();
        System.out.println(car3.brand);
        CarModel carmodel1 = new CarModel();
        System.out.println(carmodel1.brand);
        System.out.println(carmodel1.model);
        carmodel1.start();
        carmodel1.stop();
    }
}
