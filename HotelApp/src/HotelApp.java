// HotelService.java
public interface HotelService {
    void performService();
}

// Valet.java
public class Valet implements HotelService {
    @Override
    public void performService() {
        // logic for valet parking service
    }

    public void pickUpVehicle(String plateNumber) {
        // logic for picking up a vehicle
    }
}

// HouseKeeping.java
public class HouseKeeping implements HotelService {
    @Override
    public void performService() {
        // logic for housekeeping service
    }

    public void cleanRoom(int roomNumber) {
        // logic for cleaning a room
    }
}

// Cart.java
public class Cart implements HotelService {
    @Override
    public void performService() {
        // logic for handling luggage carts
    }

    public void requestCart(int numberOfCarts) {
        // logic for requesting luggage carts
    }
}

// FrontDesk.java
import java.util.HashMap;
import java.util.Map;

public class FrontDesk {
    private Map<String, HotelService> serviceProviders;

    public FrontDesk() {
        serviceProviders = new HashMap<>();
        serviceProviders.put("Valet", new Valet());
        serviceProviders.put("HouseKeeping", new HouseKeeping());
        serviceProviders.put("Cart", new Cart());
    }

    public void performService(String serviceType) {
        serviceProviders.get(serviceType).performService();
    }
}

// HotelApp.java
public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        // Check-in process
        frontDesk.performService("Valet");
        frontDesk.performService("HouseKeeping");
        frontDesk.performService("Cart");

        // Check-out process
        // Similar service request logic
    }
}