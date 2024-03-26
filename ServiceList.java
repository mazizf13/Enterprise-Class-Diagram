import java.util.List;

public class ServiceList {
    private int id;
    private Service service;
    private Maintenance maintenance;
    private String term;
    private List<MaintenanceParts> parts;

    public ServiceList(int id, Service service, Maintenance maintenance, String term, List<MaintenanceParts> parts) {
        this.id = id;
        this.service = service;
        this.maintenance = maintenance;
        this.term = term;
        this.parts = parts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Maintenance getMaintenance() {
        return maintenance;
    }

    public void setMaintenance(Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public List<MaintenanceParts> getParts() {
        return parts;
    }

    public void setParts(List<MaintenanceParts> parts) {
        this.parts = parts;
    }
}
