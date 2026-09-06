package promlan1;

public class Robot {
    private String name;
    private int x;
    private int y;
    private String direction;
    private int battery;
    
   public Robot (){
       this.name = "UDIN";
       this.x = 0;
       this.y = 0;
       this.direction = "NORTH";
       this.battery = 100;
   }
       
   public void setName(String name){
       this.name = name;
   }
   
   public String getName(){
       return this.name;
   }
   
    public void setX(int x){
       this.x = x;
   }
   
   public int getX (){
       return this.x;
   }
   
   public void setY(int y){
       this.y = y;
   }
   
   public int getY (){
       return this.y;
   }
   
    public void setDir(String direction){
       this.direction = direction;
   }
   
   public String getDir(){
       return this.direction;
   }
    public void setBat(int battery){
        if (battery <0 || battery > 100){
            System.out.println("invalid masukkan dengan jangka 0-100");
            return;
        }
       this.battery = battery;
   }
   
   public int getBat (){
       return this.battery;
   }
       
   public void moveForward(){
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
    
    public void turnLeft(){
        if (direction.equals("NORTH"))
            direction = "WEST";
        
        else if (direction.equals("EAST"))
            direction = "NORTH";
       
        else if (direction.equals("SOUTH"))
            direction = "EAST";
        
        else if (direction.equals("WEST"))
            direction = "SOUTH";
        
    }
    
   public void turnRight(){
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
    
    public void charge(){
        battery = 100;
    }

    public void printStatus(){
        System.out.printf("Position: (%d, %d) | Direction: %s | Battery: %d%%\n", x, y, direction, battery);
    }
    
    public void moveForward(int steps){
        for (int i = 0; i < steps; i++){
            this.moveForward();
        }
    }
    
    public boolean isBatteryLow(){
        return battery < 20;
    }
}
