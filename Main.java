import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Membuat beberapa merek mobil
        CarBrand hyundai = new CarBrand("Hyundai", "HyundaiLogo.png");
        CarBrand honda = new CarBrand("Honda", "HondaLogo.png");

        // Menambahkan beberapa model mobil ke dalam setiap merek
        CarModel palisade = new CarModel(1, "Palisade", new ProductionFacility("Hyundai Factory"), hyundai);
        CarModel civic = new CarModel(2, "Civic", new ProductionFacility("Honda Factory"), honda);

        hyundai.addCarModel(palisade);
        honda.addCarModel(civic);

        // Membuat dealer
        Dealer dealer = new Dealer("Aziz Dealer");

        // Menambahkan beberapa kendaraan ke dalam inventaris dealer
        Vehicle vehicle1 = new Vehicle("L 2023 NAF", "ENG123", palisade, dealer);
        Vehicle vehicle2 = new Vehicle("L 2024 SAP", "ENG456", civic, dealer);

        // Menambahkan kendaraan ke inventaris dealer
        dealer.addVehicle(vehicle1);
        dealer.addVehicle(vehicle2);

        // Menambahkan teknisi ke dalam dealer
        Technician technician1 = new Technician("tech1", "pass1", new Role("Mechanic"), "John", "", "Doe");
        Technician technician2 = new Technician("tech2", "pass2", new Role("Electrician"), "Jane", "", "Smith");

        List<Technician> technicians = new ArrayList<>();
        technicians.add(technician1);
        technicians.add(technician2);

        dealer.setTechnicians(technicians);

        // Menampilkan informasi mengenai kendaraan-kendaraan yang tersedia di dealer
        System.out.println("=======================");
        System.out.println("Welcome to " + dealer.getName());
        System.out.println("=======================");
        System.out.println("Available Vehicles:");
        System.out.println("-------------------");
        for (Vehicle vehicle : dealer.getInventory()) {
            System.out.println("Plate Number: " + vehicle.getPlateNumber());
            System.out.println("Model: " + vehicle.getCarModel().getName());
            System.out.println("Brand: " + vehicle.getCarModel().getCarBrand().getName());
            System.out.println("-------------------");
        }
    }
}
