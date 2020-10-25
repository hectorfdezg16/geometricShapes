package dsa.object.oriented.figures;

public class Triangle extends  Figure {

    //per provar una mica més l'exercici hem fet la classe Triangle
    //declarem las variables de l'àrea
    private double base;
    private double height;

    //definim el constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //a més a més afegim getters i setters per si volem editar els paramètres en el GestorClasses
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //posem el càlcul que farà de l'àrea
    @Override
    public double area() {
        return (base*height)/2;
    }

    //definim el toString perquè ens doni els valors a la consola
    @Override
    public String toString() {
        return "Triangle b: "+ this.base +" h: "+ this.height +" area ((" +this.area()+"))";
    }
}
