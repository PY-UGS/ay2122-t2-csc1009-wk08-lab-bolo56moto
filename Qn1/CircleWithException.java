package Lab8.Qn1;

public class CircleWithException extends Exception {
    private double radius;
    public CircleWithException(){

    } 
    public CircleWithException(double radius) throws Exception{
        this.radius = radius;
        if(radius <0) throw new IllegalArgumentException("Input is negative");
        if(getArea()>1000) throw new Exception("Area is more than 1000");
        
        
    }
    
    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
        double area = Math.pow(getRadius(),2)*Math.PI;
        return area;

    }

    public double getDiameter(){
        return 2*radius;
    }


    
}
