public class Part {
    private int id;
    private String name;
    private Assembly assembly;
    private Vendor vendor;

    public Part(int id, String name, Assembly assembly, Vendor vendor) {
        this.id = id;
        this.name = name;
        this.assembly = assembly;
        this.vendor = vendor;
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

    public Assembly getAssembly() {
        return assembly;
    }

    public void setAssembly(Assembly assembly) {
        this.assembly = assembly;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }
}
