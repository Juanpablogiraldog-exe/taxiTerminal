public class Driver {
    private String name;
    private String licenseNumber;
    private String phoneNumber;
    private double rating;
    private boolean available;

    public Driver(String name, String licenseNumber, String phoneNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.phoneNumber = phoneNumber;
        this.rating = 5.0; // Default rating
        this.available = true;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getRating() {
        return rating;
    }

    public void updateRating(double newRating) {
        if (newRating >= 1.0 && newRating <= 5.0) {
            this.rating = (this.rating + newRating) / 2; // Simple average
        }
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", rating=" + rating +
                ", available=" + available +
                '}';
    }
}
