public class MaintenanceParts {
    private int id;
    private ServiceList serviceList;
    private Part part;

    public MaintenanceParts(int id, ServiceList serviceList, Part part) {
        this.id = id;
        this.serviceList = serviceList;
        this.part = part;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ServiceList getServiceList() {
        return serviceList;
    }

    public void setServiceList(ServiceList serviceList) {
        this.serviceList = serviceList;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }
}
