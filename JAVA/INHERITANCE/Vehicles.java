class Vehicle {
    String brand = "BMW";
}
class Car extends Vehicle{
    void data(){
    System.out.println(brand);
    }
}
/**
 * Vehicles
 */
public class Vehicles {

    public static void main(String[] args){
        Car c1 = new Car();
        c1.data();
    }
}