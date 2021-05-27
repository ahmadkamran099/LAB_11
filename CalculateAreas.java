package package_1;

public class CalculateAreas  {
    public Shape[] a;
    public double[] calculation_of_area(Shape[] a){
        double b[]=new double[a.length];
        for(int i=0;i< a.length;i++){
            b[i]=a[i].area();
        }
        return b;
    }
}
