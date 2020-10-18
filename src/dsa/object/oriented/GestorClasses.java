package dsa.object.oriented;

import dsa.object.oriented.figures.Circle;
import dsa.object.oriented.figures.Figure;
import dsa.object.oriented.figures.Rectangle;
import dsa.object.oriented.figures.Square;

public class GestorClasses {

    public static void main(){

        // inicialitzem un vector de figures
        Figure[] v = new Figure[3];
        v[0] = new Circle(5);
        v[1] = new Rectangle(2,1);
        v[2] = new Rectangle(2,2);

        //invoquem
        double r = GestorClasses.suma(v);

        //area global
        System.out.println(r);

        //altre tema d'ordenació
    }

    //codificació de la suma
    //metode polimorfic
    // no canvia per ninuna figura
    private static double suma(Figure[] v) {
        //definim una variable qualsevol
        double ret=0;
        for(Figure f: v){
            //System.out.println(f);
            //fem una acomulació
            ret=f.area();
        }

        //for(int i=0; i<v.length; i++)
        return ret;
    }

}
