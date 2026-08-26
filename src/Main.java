package promlan1;

public class Main {     
    public static void main(String[] args) {         
                
        Robot robotA = new Robot();          
        
                
        robotA.x = 0;         
        robotA.y = 0;         
        robotA.direction = "NORTH";          
        
       
        robotA.moveForward(5);
    
        System.out.println(robotA.y);    
    } 
}
