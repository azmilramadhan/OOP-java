package promlan1;

public class Main{
    public static void main(String[] args){
        Robot robotA = new Robot();
        
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