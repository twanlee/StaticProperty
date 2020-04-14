public class Car {
    private String name;
    private String engine;
    public static int count = 0;
    Car(String n, String e){
        name = n;
        engine = e;
        count++;
    }

}
