package dsa.object.oriented;

import dsa.object.oriented.figures.*;

import java.util.Arrays;
import java.util.Comparator;

//interfaces que más vamos a utilizar: Connection (Base datos conexión), ResultSet (sentencias SQL), Statement...
//implementando con Runnable puedo hacer clase como un hilo
public class GestorClasses {

    //ara farem ordenació figures
    public static void sort(Figure[] v){
        //ordenar un array d'objectes/figures
        Arrays.sort(v);

        //ordenar un array per tipus de figura
        Arrays.sort(v, new Comparator<Figure>() {
            @Override
            public int compare(Figure o1, Figure o2) {
                return o1.compareTo(o2);
            }
        });

        //hem compactat la funció d'abans amb lambda
        Arrays.sort(v, (o1, o2) -> o1.compareTo(o2));
    }

    public static void main(){

        // inicialitzem un vector de figures
        Figure[] v = new Figure[5];
        v[0] = new Circle(5);
        v[1] = new Rectangle(2,1);
        v[2] = new Square(2);
        v[3] = new Triangle(7,6);
        v[4] = new Rhombus(2,8);

        //fem instàncies de r3 per posar nous valors als costats
        //Rectangle r3 = new Rectangle();
        //r3.setL1(4);
        //r3.setL2(5);

        //Tot això es equivalent en una línia de codi
        //Rectangle r3 = new Rectangle(4,5);

        //invoquem mètode estàtic
        double r = GestorClasses.suma(v);

        //ens donaria valor de l'area global a la sortida de la consola
        //evitarem usar System... donarà muerte por éxito (recurs compartit = semàfor)
        System.out.println(r);

        //tema d'ordenació
        //totes les figures han d'implementar interfície comparable
        System.out.println(Arrays.asList(v));
        GestorClasses.sort(v);
        System.out.println(Arrays.asList(v));
    }

    //codificació de la suma
    //mètode polimòrfic
    // no canvia per ninuna figura
    private static double suma(Figure[] v) {
        //definim una variable qualsevol
        double ret=0;
        //fem un recorregut sobre tots els elements del vector que sabem que son figures
        for(Figure f: v){

            //aquest Foreach es equivalent al següent:
            //Figure f = null;
            //for(int i=0; i<v.length; i++){
            //f=v[i];}
            //f.area();

            //System.out.println(f);
            //fem una acomulació / invoquem el mètode polimòrfic de figura
            ret+=f.area();
        }


        return ret;
    }

}
