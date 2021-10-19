package one.innovation.digital.abstracts;

public class GeometricFigureProgram {
    public static void main(String[] args) {
        // Error: GeometricFigure is abstract and can't b instantiated
        // final GeometricFigure geometricFigure = new GeometricFigure();
        // Initializing variables, inferring types
        var squareName = "square one";
        var squareX = 12.0;
        var squareY = 12.0;
        var squareArea = 12.0;
        // Instantiating a GeometricFigure object
        final GeometricFigure square = new Square(squareName, squareX, squareY, squareArea);
        // Print values to console
        System.out.println(square);
        System.out.println(square.gfDrawing(square.gfX(), square.gfY()));
        System.out.println("Name: " + square.gfName());
        System.out.println("Area: " + square.gfArea());
    }
}
