package promlan1;

public class Robot {
    String name;
    int x;
    int y;
    String direction;
    int battery;
    
    void moveForward(){
        if (battery <= 0){
            System.out.println("Baterai abis, gabisa jalan");
            return;
        }
        if (direction.equals("NORTH"))y++;
        else if (direction.equals("EAST"))x++;
        else if (direction.equals("SOUTH"))y--;
        else if (direction.equals("WEST"))x--;
    battery -=10;
    }
    
    void turnLeft(){
        if (direction.equals("NORTH")){
            direction = "WEST";
        }
        else if (direction.equals("EAST")){
            direction = "NORTH";
        }
        else if (direction.equals("SOUTH")){
            direction = "EAST";
        }
        else if (direction.equals("WEST")){
            direction = "SOUTH";
        }
    }
    
    void turnRight(){
         if (direction.equals("NORTH")){
            direction = "EAST";
        }
        else if (direction.equals("EAST")){
            direction = "SOUTH";
        }
        else if (direction.equals("SOUTH")){
            direction = "WEST";
        }
        else if (direction.equals("WEST")){
            direction = "NORTH";
        } 
    }
    
    void charge(){
        battery = 100;
    }
    
    void printStatus(){
        System.out.println ("Position: ("+x+","+ y+") | Direction: "+ direction+ "| Battery: "+ battery);
    }
    
    void moveForward(int steps){
        for (int i = 0; i < steps; i++){
            this.moveForward();
        }
    }
    
    boolean isBatteryLow(){
        return battery < 20;
    }
}