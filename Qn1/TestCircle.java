package Lab8.Qn1;
import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
            System.out.println("What is the radius : ");
            double radius = sc.nextDouble();
            
            try{
                CircleWithException circle = new CircleWithException(radius);
                System.out.println("The radius is "+circle.getRadius());
                System.out.println("The area is "+circle.getArea());
                System.out.println("The diameter is "+circle.getDiameter());
            }catch(CircleWithException ce){
                System.err.print(ce);

            }
                
            
            sc.close(); 
    }
}
