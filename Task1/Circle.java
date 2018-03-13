package Task1;

public class Circle extends Figure {
    private double radius;

    public Circle (double radius) {     // libo ...(double r)
        this.radius = radius;           // radius = r;
        radius = 12;
    }

    @Override
     public String name() {
         return "Circle";
     }

     @Override
     public Double area() {
         return radius * radius * Math.PI;
     }
 }