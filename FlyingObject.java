package finalquestion1;

public class FlyingObject {
    private int airSpeedMPH;
    private int elevationPerMinute;
    private String name;
    private int totalMilesTraveled;
    private int totalElevation;
    
    public FlyingObject (int a, int e, String n) {
        airSpeedMPH = a;
        elevationPerMinute = e;
        name = n;
    }
    
    public void setAirSpeed(int a){
        airSpeedMPH = a;
    }
    
    public void setAltimeter(int e){
        elevationPerMinute = e;
    }
    
    public void Fly() {
        totalMilesTraveled = totalMilesTraveled + airSpeedMPH/60;
        totalElevation = totalElevation + elevationPerMinute;
    }
    
    public void Location() {
        System.out.printf("%s: Miles Traveled = %d, Elevation = %d feet", name, totalMilesTraveled, totalElevation);
    }
    
}
