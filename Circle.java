package package_1;

public class Circle implements Shape {
   public int radius;
    Circle(int radius){
        this.radius=radius;
    }
   
    @Override
    public double area() {
        return 3.14*(radius^2);
    }
}
