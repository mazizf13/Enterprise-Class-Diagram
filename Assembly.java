public class Assembly {
    private int id;
    private String assembly;
    private Part part;

    public Assembly(int id, String assembly, Part part) {
        this.id = id;
        this.assembly = assembly;
        this.part = part;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAssembly() {
        return assembly;
    }

    public void setAssembly(String assembly) {
        this.assembly = assembly;
    }

    public Part getPart() {
        return part;
    }

    public void setPart(Part part) {
        this.part = part;
    }
}
