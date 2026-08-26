package promlan1;

public class Main {
        public static void main(String[] args){
            Robot robotA = new Robot();
            
            robotA.name = "Asep";
            robotA.x = 0;
            robotA.y = 0;
            robotA.direction = "north";
            robotA.battery = 100;

            robotA.moveForward();
            System.out.println ("Position: ("+ robotA.x + "," + robotA.y + ") | Direction: "+ robotA.direction + "| Battery: "+ robotA.battery);


}
}
