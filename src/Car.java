public class Car extends Vehicle{


    public Car(String company, String model, int yearRelease) {
        super(company, model, yearRelease);
        this.numWheels = 4;
        this.speed = 0;
    }

    @Override
    void testDrive() {
        this.speed = 60;
    }

    @Override
    void park() {
        this.speed = 0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", yearRelease=" + yearRelease +
                ", numWheels=" + numWheels +
                ", speed=" + speed +
                '}';
    }
}
