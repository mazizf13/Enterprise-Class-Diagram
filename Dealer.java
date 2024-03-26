import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private String name;
    private List<Vehicle> inventory;
    private List<Technician> technicians;

    public Dealer(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vehicle> getInventory() {
        return inventory;
    }

    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    public List<Technician> getTechnicians() {
        return technicians;
    }

    public void setTechnicians(List<Technician> technicians) {
        this.technicians = technicians;
    }
}
