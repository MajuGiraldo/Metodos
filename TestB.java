import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestB {

    @Test

    @DisplayName("GIVEN WHEN THEN")

    public void alias() {

        List<Navy> navies = new ArrayList<>();

        Navy n1 = new Navy("M");
        Navy n2 = new Navy("P");
        Navy n3 = new Navy("M");

        navies.add(n1);
        navies.add(n2);
        navies.add(n3);

        Board b = new Board(navies);

        int result1 = n1.alias();
        assertEquals(1, result1);

        int result2 = n2.alias();
        assertEquals(0, result2);

    }

    @Test
    @DisplayName("GIVEN WHEN THEN")

    public void availabilityAircraft (){

        Navy navy1 = new Navy("T");
        AircraftCarrier a1 = new AircraftCarrier(900,navy1.capacity);
        Aircraft aa1 = new Aircraft("JB900",false);

        navy1.aircraftCarriers.add(a1);
        navy1.aircrafts.add(aa1);

        assertEquals(navy1.capacity-1,navy1.availabilityAircraft());
    }

    @Test
    @DisplayName("GIVEN a list with enemies aircraft´s license plates on air WHEN compare sizes THEN must be the same")

    public void enemiesLicencePlateOnAir (){

        AircraftCarrier a1 = new AircraftCarrier(600, 100);
        Aircraft aa1 = new Aircraft("JB600", false);
        Aircraft aa2 = new Aircraft("JK600", true);

        a1.getenemiesAircrafts().add(aa1);
        a1.getenemiesAircrafts().add(aa2);

        int result = a1.enAire().size();

        assertEquals(1, result);
    }

    @Test
    @DisplayName("GIVEN WHEN THEN")

    public void confuseEnemiesAircraftswithOwnAircrafts (){

        AircraftCarrier a1 = new AircraftCarrier(700, 100);
        Aircraft aa1 = new Aircraft("JB700", true);
        Aircraft aa2 = new Aircraft("JB700", true);

        a1.getenemiesAircrafts().add(aa1);
        a1.getOwnAircrafts().add(aa2);

        boolean confuse = a1.problemaEnAire();

        assertTrue(confuse, "There was a confuse between enemies License plates and own");
    }
}
