package dsa.object.oriented.figures;

//extends significa que hereta de la clase abstracta figura
//aquesta clase esta obligada a asumir el contracte amb figura
public class Rectangle extends Figure {

    private double l1;
    private double l2;

    //generem a més a més constructor buit
    public Rectangle() {
    }

    //falta constructor rectangle
    public Rectangle(double l1, double l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    //posem getters i setters de les dues variables dels costats del rectangle
    //ho fem com a prova per posar nous valors en el càlcul
    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    // calcúl de l'area
    @Override
    public double area() {
        return this.l1 * this.l2;
    }

    // missatge sigui llegible per l'humà
    // altre vegada tostring prove de la clase objecte
    @Override
    public String toString() {
        return "Rectangle l1: "+this.l1+"l2: "+this.l2+"area: (("+this.area()+"))";
    }
}
