package dsa.object.oriented.figures;

//extends significa que hereta de la clase abstracta figura
//aquesta clase esta obligada a asumir el contracte amb figura
public class Circle extends Figure {

    private double r;

    //Generem el constructor
    //amb el nostre radi que després utilitzarem en el mètode àrea
    public Circle(double r) {
        this.r = r;
    }

    // aqui implementem amb generate to implement de la super clase que hereta Circle
    //es un contracte si tu vols hereta de figura necessites respectar el meu contracte
    //implementar tots els metodes de la clase abstracta
    //aquest es un mètode polimòrfic
    @Override
    public double area() {
        //esta operacion pi*r^2 hay que revisarla ya que nos la marca mal
        return Math.PI * Math.pow(this.r,2);
    }

    //ara reimplementem una altre clase anomenada objecte to string per donar la resposta
    @Override
    public String toString() {
        return "Cercle r: "+ this.r+" area ((" +this.area()+"))";
    }
}
