package one.innovation.digital.abstracts;

public class GeometricFigureProgram {
    public static void main(String[] args) {
        // Error: GeometricFigure is abstract and can't b instantiated
        // final GeometricFigure geometricFigure = new GeometricFigure();
        final GeometricFigure square = new Square("square one", 12.0, 12.0, 25.0);
        System.out.println(square);
        System.out.println(square.gfDrawing(square.gfX(), square.gfY()));
        System.out.println("Name: " + square.gfName());
        System.out.println("Area: " + square.gfArea());
    }
}
