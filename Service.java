public class Service {
    private int id;
    private String description;
    private ServiceCenter serviceCenter;
    private double price;

    public Service(int id, String description, ServiceCenter serviceCenter, double price) {
        this.id = id;
        this.description = description;
        this.serviceCenter = serviceCenter;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ServiceCenter getServiceCenter() {
        return serviceCenter;
    }

    public void setServiceCenter(ServiceCenter serviceCenter) {
        this.serviceCenter = serviceCenter;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
