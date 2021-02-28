import java.util.ArrayList;
import java.util.List;

public class Navy {

    private String name;
    public final String code="";
    public final int capacity=100;

    private Aircraft avion;
    private Marine marine;
    private AircraftCarrier portaAviones;
    private Position location;
    private Ship ship;
    private Board board= new Board();

    private int currentCapacity=1;
    private int availability;

    public List<AircraftCarrier> aircraftCarriers = new ArrayList<>();
    public List<Aircraft> aircrafts = new ArrayList<>();


    @Override
    public boolean equals(Object m) {//Metodo
        if (m == null) {
            return false;
        }
        if (m instanceof Navy) {
            return false;
        }

        Navy n1= (Navy) m; //castear
        return name == board.getName();


    }



    public Navy(String name) {
        this.name=name;

    }

    public String getName() {
        return name;
    }

    /*
     * Consulta el número de flotas que tienen su mismo nombre
     *
     * @returns: numero de flotas con el mismo nombre
     */
    public int alias() {
        return board.countNavies(name)-1;


    }
    /**
     * Consulta la disponibilidad total de los portaaviones
     *
     * @returns: numero de nuevos aviones que podrían cargarse a los portaaviones
     */

    public int availabilityAircraft (){
        AircraftCarrier air2 = new AircraftCarrier(3,100);


        if (currentCapacity < capacity ){
            availability= capacity-currentCapacity;
        }
        return availability;
    }
}
