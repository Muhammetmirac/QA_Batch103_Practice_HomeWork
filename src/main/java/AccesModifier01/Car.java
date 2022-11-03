package AccesModifier01;

public class Car {
    public String brand="Ford";
    protected String model = "Camry";
    String color = "White";
    private String carNumberPlate = "TR 34FC 6304";

    public void start(){
        System.out.println("Car Start");
    }
    protected void stop(){
        System.out.println("Car stop");
    }


    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.carNumberPlate);
        car1.

    }
}
