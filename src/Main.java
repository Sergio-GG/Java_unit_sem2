public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Audi", "V8", 1999);
        Vehicle moto = new Motorcycle("Honda", "Shadow", 2005);

        car.testDrive();
        System.out.println(car.getSpeed());
    }
}