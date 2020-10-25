package dsa.object.oriented.figures;

public class Rhombus extends Figure {

    //variables rombo
    private double d1;
    private double d2;

    //generem constructor
    public Rhombus(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    //generem getters i setters
    public double getD1() {
        return d1;
    }

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public double getD2() {
        return d2;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    @Override
    public double area() {
        return (d1*d2)/2;
    }

    //definim el toString perquè ens doni els valors a la consola
    @Override
    public String toString() {
        return "Rhombus diagonal1: "+ this.d1 +" diagonal2: "+ this.d2 +" area ((" +this.area()+"))";
    }

}
