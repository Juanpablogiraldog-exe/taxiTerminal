public class Taxi {
    private String plateNumber;
    private String model;
    private String color;
    private boolean available;
    private int capacity;

    public Taxi(String plateNumber, String model, String color, int capacity) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.color = color;
        this.capacity = capacity;
        this.available = true;
    }

    // Getters and Setters
    public String getPlateNumber() {
        return plateNumber;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "plateNumber='" + plateNumber + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", available=" + available +
                ", capacity=" + capacity +
                '}';
    }
}
