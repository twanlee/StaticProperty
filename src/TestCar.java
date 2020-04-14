public class TestCar {
    public static void main(String[] args) {
        Car car = new Car("Toyota","Skyactiv 1");
        System.out.println(Car.count);
        Car car1 = new Car("Toyota","Skyactiv 1");
        System.out.println(Car.count);
        Car car2 = new Car("Toyota","Skyactiv 1");
        System.out.println(Car.count);
    }
}
