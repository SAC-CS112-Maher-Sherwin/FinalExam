package finalexam;

public class FinalExam {

    public static void main(String[] args) {
   
    // Creation of the Bird object
        FlyingObject bird = new FlyingObject(10, 3, "Bird");
        
    // Creation of the Airplane object
        FlyingObject airplane = new FlyingObject(450, 50, "Airplane");
        
    // Creation of the Jet Plane object
        FlyingObject jetPlane = new FlyingObject(1000, 120, "Jet Plane");
        
    // Creation of the Missile object
        FlyingObject missile = new FlyingObject(2500, 800, "Missile");
        
    // Creation of Superman object
        FlyingObject superman = new FlyingObject(3500, 500, "Superman");
        
        for (int i = 0; i <= 30; i++){
            bird.Fly(i);
            airplane.Fly(i);
            jetPlane.Fly(i);
            missile.Fly(i);
            superman.Fly(i);
            
            if (i % 5 == 0){
                System.out.printf("Minute: %d\n", i);
                bird.Location();
                airplane.Location();
                jetPlane.Location();
                missile.Location();
                superman.Location();
                System.out.println("");
                
        }
        
    }        
    }
    
}
