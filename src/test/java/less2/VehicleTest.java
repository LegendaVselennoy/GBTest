package less2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VehicleTest {

    private Car car;
    private Motorcycle motorcycle;

    @BeforeEach
    void setup(){

       car = new Car("CompanyCar", "Reo", 2024);
       car.testDrive();

       motorcycle=new Motorcycle("CompanyMotorcycle","Siu",2024);
       motorcycle.testDrive();

    }


    @Test
    public void isAnInstanceOfAVehicle() {
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    @Test
    public void checkingTheObjectTheCarIsCreatedWithFourWheels(){
         assertEquals(car.getNumWheels(), 4);
    }

    @Test
    public void aMotorcycleObjectIsCreatedWithTwoWheels(){
        assertEquals(motorcycle.getNumWheels(), 2);
    }

    @Test
    public void objectTheCarReachesASpeedOf60InTestDrivingMode(){
        assertEquals(car.getSpeed(), 60);
    }

    @Test
    public void objectTheMotorcycleReachesASpeedOf75InTestDrivingMode(){
        assertEquals(motorcycle.getSpeed(), 75);
    }

    @Test
    public void theCarStops(){
        car.park();
        assertEquals(car.getSpeed(), 0);
    }

    @Test
    public void theMotorcycleStops(){
        motorcycle.park();
        assertEquals(motorcycle.getSpeed(), 0);
    }
}
