package promlan1;

public class Main {
        public static void main(String[] args){
            Robot robotA = new Robot();
            
            robotA.name = "Asep";
            robotA.x = 0;
            robotA.y = 0;
            robotA.direction = "NORTH";
            robotA.battery = 0;
            
            robotA.isBatteryLow();
            robotA.turnRight();
            System.out.println ("Position: ("+ robotA.x + "," + robotA.y + ") | Direction: "+ robotA.direction + "| Battery: "+ robotA.battery);
            
            robotA.charge();
            robotA.turnLeft();
            robotA.moveForward(5);
            System.out.println ("Position: ("+ robotA.x + "," + robotA.y + ") | Direction: "+ robotA.direction + "| Battery: "+ robotA.battery);
}
}
