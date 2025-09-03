public class Passenger {
    private String name;
    private String phoneNumber;
    private String email;
    private int rating;
    private String paymentMethod;

    public Passenger(String name, String phoneNumber, String email, String paymentMethod) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.paymentMethod = paymentMethod;
        this.rating = 5; // Default rating
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            this.rating = rating;
        }
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", rating=" + rating +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
