public class DreamVacation {
    private String Location;
    private double Cost;

    public DreamVacation() {
    }

    public DreamVacation(String location, double cost) {
        Location = location;
        Cost = cost;
    }

    public String getLocation() {
        return Location;
    }

    public double getCost() {
        return Cost;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public void setCost(double cost) {
        Cost = cost;
    }

    public static void main(String[] args) {
        DreamVacation vacation = new DreamVacation("Israel", 6220);
        System.out.println("My dream vacation would be in " + vacation.getLocation() + ", and the cost would be around "
                + vacation.getCost() + " dollars");
        DreamVacation vacation2 = new DreamVacation();
        vacation2.setLocation("Iceland");
        vacation2.setCost(5000.00);
        System.out.println("My dream vacation would be in " + vacation2.getLocation()
                + ", and the cost would be around " + vacation2.getCost() + " dollars");

    }

}