import java.util.List;

public class Maintenance {
    private int id;
    private String name;
    private MaintenanceType maintenanceType;
    private List<Service> services;
    private List<ServiceCenter> serviceCenters;
    private double total;
    private String term;

    public Maintenance(int id, String name, MaintenanceType maintenanceType, List<Service> services,
                      List<ServiceCenter> serviceCenters, double total, String term) {
        this.id = id;
        this.name = name;
        this.maintenanceType = maintenanceType;
        this.services = services;
        this.serviceCenters = serviceCenters;
        this.total = total;
        this.term = term;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MaintenanceType getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(MaintenanceType maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public List<ServiceCenter> getServiceCenters() {
        return serviceCenters;
    }

    public void setServiceCenters(List<ServiceCenter> serviceCenters) {
        this.serviceCenters = serviceCenters;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }
}
