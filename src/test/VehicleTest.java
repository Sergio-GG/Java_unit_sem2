import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.*;


public class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;
    public void setup(){
        car = new Car("Audi", "V8", 1999);
        motorcycle = new Motorcycle("Honda", "Shadow", 2005);

    }
    @Test
    void checkIfCarIsVehicle(){
        setup();
        assertThat(car).isInstanceOf(Vehicle.class);
    }
    @Test
    void checkCarWheelNumber(){
        setup();
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
    @Test
    void checkMotorcycleWheelNumber(){
        setup();
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }
    @Test
    void checkCarSpeedDrive(){
        setup();
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }
    @Test
    void checkMotorcycleSpeedDrive(){
        setup();
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }
    @Test
    void checkCarSpeedPark(){
        setup();
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
    @Test
    void checkMotorcycleSpeedPark(){
        setup();
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}