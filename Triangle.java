package package_1;

public class Triangle implements Shape{
    
    public int base;
    public int height;
    Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }
    @Override
    public double area() {
        return 0.5*base*height;
    }
}
