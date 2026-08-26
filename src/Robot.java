package promlan1;

public class Robot {     
  
    String name;
    int x;
    int y;
    String direction;
    int battery;
    
    void moveForward(){
        if (battery <=20 ){
            return;
        }
        if (direction.equalsIgnoreCase("NORTH")){
            y++;
        }
        else if (direction.equalsIgnoreCase("EAST")){
            x++;
        }
        else if (direction.equalsIgnoreCase("SOUTH")){
            y--;
        }
        else if (direction.equalsIgnoreCase("WEST")){
            x--;
        }
        battery-=10;
    }
    void turnLeft(){
        if (direction.equals("NORTH")) {
        direction = "WEST";
    } else if (direction.equals("WEST")) {
        direction = "SOUTH";
    } else if (direction.equals("SOUTH")) {
        direction = "EAST";
    } else if (direction.equals("EAST")) {
        direction = "NORTH";
    }
    }
    
    void turnRight() {
    if (direction.equals("NORTH")) {
        direction = "EAST";
    } else if (direction.equals("EAST")) {
        direction = "SOUTH";
    } else if (direction.equals("SOUTH")) {
        direction = "WEST";
    } else if (direction.equals("WEST")) {
        direction = "NORTH";
    }
}
   void charge(){
       battery = 100;
       System.out.println("battery sudah dicas sampai 100%");
   }
}
