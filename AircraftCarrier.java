import java.util.ArrayList;
import java.util.List;

public class AircraftCarrier {

    private int numberId;
    public int capacity;
    private Marine captain;

    private List<Marine> marines;
    private List<Aircraft> aircrafts = new ArrayList<>();
    private List<Aircraft> enemiesAircrafts = new ArrayList<>();
    private Position location;


    public AircraftCarrier(int numberId, int capacity) {
        this.numberId = numberId;
        this.capacity = capacity;
    }

    public List<Aircraft> getenemiesAircrafts(){
        return enemiesAircrafts;
    }

    public List<Aircraft> getOwnAircrafts() {
        return aircrafts;
    }

    /**
     * Consulta la placa de los aviones enemigos que están en el aire
     *
     * @returns: la placa de los aviones enemigos que están en el aire
     */
    public ArrayList<String> enAire() {
        String enemyLicencePlate;
        ArrayList<String> enemiesLicencePlates = new ArrayList<>();
        for(Aircraft aircraft : enemiesAircrafts){
            if(aircraft.getinAir()){
                enemyLicencePlate = aircraft.getLicencePlate();
                enemiesLicencePlates.add(enemyLicencePlate);
            }
        }
        return enemiesLicencePlates;
    }

    /**
     * Consulta si puede confundir sus aviones con aviones enemigos considerando
     * las placas
     *
     * @returns: si hay problema en aire
     */
    public boolean problemaEnAire(){
        boolean result = false;
        for(Aircraft aircraft : aircrafts){
            for(Aircraft enemyAircraft : enemiesAircrafts){
                if(aircraft.getLicencePlate().equals(enemyAircraft.getLicencePlate())){
                    result = true;
                }
            }
        }
        return result;
    }
}
