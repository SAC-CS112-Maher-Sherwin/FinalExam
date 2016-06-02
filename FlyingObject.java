package finalexam;

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
    
    public int getAirSpeed(){
        return airSpeedMPH;
    }
    
    public void setAltimeter(int e){
        elevationPerMinute = e;
    }
    
    public int getAltimeter(){
        return elevationPerMinute;
    }
    
    public void Fly(int i) {
        totalMilesTraveled = totalMilesTraveled + ((airSpeedMPH/60)*i);
        totalElevation = totalElevation + elevationPerMinute*i;
    }
    
    public void Location() {
        System.out.printf("%s: Miles Traveled = %d, Elevation = %d feet\n", name, totalMilesTraveled, totalElevation);
    }
    
}