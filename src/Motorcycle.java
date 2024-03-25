public class Motorcycle extends Vehicle{

    public Motorcycle(String company, String model,int yearRelease) {
        super(company, model, yearRelease);
        this.numWheels = 2;
        this.speed = 0;
    }

    @Override
    void testDrive() {
        this.speed = 75;
    }

    @Override
    void park() {
        this.speed = 0;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", yearRelease=" + yearRelease +
                ", numWheels=" + numWheels +
                ", speed=" + speed +
                '}';
    }
}
