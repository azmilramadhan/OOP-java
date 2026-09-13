package promlan1;

public class Robot {
    private String name;
    private int x;
    private int y;
    private String direction;
    private int battery;
    
   public Robot (String name, int x, int y, String direction, int battery){
       this.name = name;
       this.x = x;
       this.y = y;
       this.direction = direction;
       this.battery = battery;
   }
   
   public String getName(){
       return this.name;
   }
   
   public int getX (){
       return this.x;
   }
   
   public int getY (){
       return this.y;
   }
   
    public void setDir(String direction){
        switch (direction) {
            case "NORTH":
            case "EAST":
            case "SOUTH":
            case "WEST":
                this.direction = direction;
                break;
            default:
                System.out.println("ERROR: ARAH TIDAK DIKENAL");
                break;
        }
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
        if (battery == 0){
            System.out.println("Baterai abis, gabisa jalan");
            return;
        }
        switch (direction) {
            case "NORTH": y++; break;
            case "EAST": x++; break;
            case "SOUTH": y--; break;
            case "WEST": x--; break;
           
        }
    battery -=10;
    }
    
    public void turnLeft(){
        switch (direction) {
            case "NORTH": direction = "WEST"; break;
            case "EAST": direction = "NORTH"; break;
            case "SOUTH": direction = "EAST"; break;
            case "WEST": direction = "SOUTH"; break;
            
        }
        
    }
    
   public void turnRight(){
        switch (direction) {
            case "NORTH": direction = "EAST"; break;
            case "EAST": direction = "SOUTH"; break;
            case "SOUTH": direction = "WEST"; break;
            case "WEST": direction = "NORTH"; break;
            
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
            int batterysebelum = battery;
            this.moveForward();
            if (battery == batterysebelum){
                break;
            } 
        }
    }
    
    public void consumeBattery(int amount){
        if (amount < 0){
            throw new IllegalArgumentException ("Angka yang dimasukkan tidak boleh kurang dari 0!"); }
            battery Math.max(0, Battery - amount);
        
    }
    
    public boolean isBatteryLow(){
        return battery < 20;
    }
    
    private boolean isValidDirection(String direction){
        return switch (direction) {
            case "NORTH", "SOUTH", "EAST", "WEST" -> true;
            default -> false;
        };
    }
}
