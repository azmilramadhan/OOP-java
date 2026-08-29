package promlan1;

public class Main{
    public static void main(String[] args){
        Robot robotA = new Robot();
        
        robotA.x = 0;
        robotA.y = 0;
        robotA.battery = 70;
        robotA.name = "Udin";
        robotA.direction = "NORTH";
        
        robotA.printStatus();
        robotA.moveForward(6);
        if (robotA.isBatteryLow()){
            System.out.println("Baterai low");
            robotA.charge();
        }
        else {
            System.out.println("jalan terus");
        }
        
        robotA.turnRight();
        robotA.moveForward(11);
        robotA.printStatus();
        
        
    }
}