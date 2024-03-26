public class CarModel {
    private int id;
    private String name;
    private ProductionFacility productionFacility;
    private CarBrand carBrand;
    private Vehicle vehicle;
    
    public CarModel(int id, String name, ProductionFacility productionFacility, CarBrand carBrand) {
        this.id = id;
        this.name = name;
        this.productionFacility = productionFacility;
        this.carBrand = carBrand;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }
    
    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ProductionFacility getProductionFacility() {
        return productionFacility;
    }

    public void setProductionFacility(ProductionFacility productionFacility) {
        this.productionFacility = productionFacility;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
