import java.util.ArrayList;
import java.util.List;

public class Vehicle {
    private String plateNumber;
    private String engineNumber;
    private CarModel carModel;
    private Dealer dealer;
    private List<Technician> technicians;

    public Vehicle(String plateNumber, String engineNumber, CarModel carModel, Dealer dealer) {
        this.plateNumber = plateNumber;
        this.engineNumber = engineNumber;
        this.carModel = carModel;
        this.dealer = dealer;
        this.technicians = new ArrayList<>();
    }

    // Getters and setters
    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public void setCarModel(CarModel carModel) {
        this.carModel = carModel;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public List<Technician> getTechnicians() {
        return technicians;
    }

    public void setTechnicians(List<Technician> technicians) {
        this.technicians = technicians;
    }
}
