package package_1;

public class Rectangle implements Shape {
    public int length;
    public int width;
Rectangle(int length,int width){
    this.length=length;
    this.width=width;
}


    @Override
    public double area() {
       return length*width;
    }
}
