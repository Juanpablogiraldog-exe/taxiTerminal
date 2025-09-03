public class Route {
    private String routeId;
    private String startPoint;
    private String endPoint;
    private double distance; // in kilometers
    private int estimatedTime; // in minutes
    private String[] waypoints;

    public Route(String routeId, String startPoint, String endPoint, double distance, int estimatedTime) {
        this.routeId = routeId;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
        this.distance = distance;
        this.estimatedTime = estimatedTime;
        this.waypoints = new String[0];
    }

    // Getters and Setters
    public String getRouteId() {
        return routeId;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public double getDistance() {
        return distance;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public String[] getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(String[] waypoints) {
        this.waypoints = waypoints;
    }

    public double calculateFare(double ratePerKm) {
        return distance * ratePerKm;
    }

    public void updateRoute(String newEndPoint, double additionalDistance, int additionalTime) {
        this.endPoint = newEndPoint;
        this.distance += additionalDistance;
        this.estimatedTime += additionalTime;
    }

    @Override
    public String toString() {
        return "Route{" +
                "routeId='" + routeId + '\'' +
                ", startPoint='" + startPoint + '\'' +
                ", endPoint='" + endPoint + '\'' +
                ", distance=" + distance +
                " km, estimatedTime=" + estimatedTime +
                " minutes}";
    }
}
