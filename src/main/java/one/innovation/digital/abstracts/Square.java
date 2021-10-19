package one.innovation.digital.abstracts;

/**
 * Square class | extended from GeometricFigure abstract class
 */
public class Square extends GeometricFigure {
    private String gfName;
    private Double gfArea;
    private Double gfX;
    private Double gfY;
    public Square(final String gfName, final Double gfX, final Double gfY, final Double gfArea){
        this.gfName = gfName;
        this.gfArea = gfArea;
        this.gfX = gfX;
        this.gfY = gfY;
    }
    @Override
    public String gfName(){
        return gfName;
    }
    @Override
    public Double gfArea(){
        gfArea = gfX * gfY;
        return gfArea;
    }
    @Override
    public Double gfX() {
        return gfX;
    }
    @Override
    public Double gfY() {
        return gfY;
    }
    @Override
    public String toString(){
        final StringBuilder builder = new StringBuilder("Square [" + "Name = " + gfName + " | Area = " + gfArea() + "]");
        return builder.toString();
    }
}
