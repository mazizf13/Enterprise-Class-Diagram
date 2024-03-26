import java.util.ArrayList;
import java.util.List;

public class CarBrand {
    private String name;
    private String logo;
    private List<CarModel> carModels;

    public CarBrand(String name, String logo) {
        this.name = name;
        this.logo = logo;
        this.carModels = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getLogo() {
        return logo;
    }

    public List<CarModel> getCarModels() {
        return carModels;
    }

    public void addCarModel(CarModel carModel) {
        carModels.add(carModel);
    }
}
