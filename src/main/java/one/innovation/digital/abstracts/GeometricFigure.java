package one.innovation.digital.abstracts;

/**
 * GeometricFigure abstract class
 */
public abstract class GeometricFigure {
    public abstract String gfName();
    public abstract Double gfArea();
    public abstract Double gfX();
    public abstract Double gfY();
    public String gfDrawing(double x, double y) {
        return "Drawing with A and B sides' values: A = " + x + " | B = " + y;
    }
}
