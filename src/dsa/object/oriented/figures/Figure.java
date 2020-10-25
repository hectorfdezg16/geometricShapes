package dsa.object.oriented.figures;

import java.io.Serializable;

// mai podem crear instancies de la clase figura
// estrany ja que si instanciem vector de figures a l'hora de fer operacions en el gestor
//añadiendo varios implements hacemos que una clase implemente diferentes interfaces
//podemos emular con Java herencia múltiple / comparable es interfaz porque respetamos contrato
//interfaz=especificas, clase=codificas
public abstract class Figure implements Comparable<Figure>{

    //metode abstracte per crear area
    public abstract double area();

    /*Aquest funció em retorna tres números
     * <0
     * 0
     * >0
     * */
    @Override
    public int compareTo(Figure f) {
        //el que estic restant es la meva àrea del constructor buit menys una altre àrea caiguda del cel...
        //quan fiquem this.area NO parlem d'una instància de la clase abstracta figura, instància clase objecte...
        //rectangle,cercle,etc.
        return (int)(f.area()-this.area());
    }
}
