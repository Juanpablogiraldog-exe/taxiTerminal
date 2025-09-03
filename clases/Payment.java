public class Payment {
    private String paymentId;
    private double amount;
    private String paymentMethod;
    private String status;
    private String tripId;
    private java.util.Date paymentDate;

    public Payment(String paymentId, double amount, String paymentMethod, String tripId) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.tripId = tripId;
        this.status = "PENDING";
        this.paymentDate = new java.util.Date();
    }

    // Getters and Setters
    public String getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status.toUpperCase();
    }

    public String getTripId() {
        return tripId;
    }

    public java.util.Date getPaymentDate() {
        return paymentDate;
    }

    public boolean processPayment() {
        // Simulate payment processing
        if (this.status.equals("PENDING")) {
            this.status = "COMPLETED";
            this.paymentDate = new java.util.Date();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", amount=" + amount +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", status='" + status + '\'' +
                ", tripId='" + tripId + '\'' +
                ", paymentDate=" + paymentDate +
                '}';
    }
}
