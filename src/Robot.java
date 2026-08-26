package promlan1;

public class Robot {     
  
    public int x;     
    public int y;     
    public String direction;      

    
    void moveForward() { 
        if (direction.equals("NORTH")) {             
            y++;         
        }     
    } 
    
    void moveForward (int steps) {
        for (int i = 0; i < steps; i++) {
            this.moveForward();
        }
    }
}
