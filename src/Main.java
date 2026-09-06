package promlan1;

public class Main{
    public static void main(String[] args){
        Robot robotA = new Robot("Udin", 0, 0, "NORTH", 60);
        
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
        robotA.moveForward(12);
        robotA.printStatus();
        
        
    }
}