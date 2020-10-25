package dsa.object.oriented.figures;

//extends significa que hereta de la clase abstracta figura
//aquesta clase esta obligada a asumir el contracte amb figura
//asumim altre contracte: hereta de Rectangle
public class Square extends Rectangle {

    //implementem las variables del quadrat
    //no fa falta variable costat perque ja la té el rectangle
    //private double l;

    //generem constructor
    public Square(double l) {
        //fiquem constructor rectangle
        //s'està invocant l'altre constructor
        super(l,l);
    }

    //càlcul de l'àrea tampoc fa falta ja que la fa rectangle
    //@Override
    //public double area() {
    //    return this.l*this.l;
    //}

    //generem també toString perquè es vegi millor

    @Override
    public String toString() {
        //canviem el l per el getter del costat L1 del rectangle i l'àrea ara la farà també rectangle...
        //posem super ja que vé de la super clase rectangle
        return "Square{" + "l=" + this.getL1() + "area=" + super.area() + '}';
    }
}
