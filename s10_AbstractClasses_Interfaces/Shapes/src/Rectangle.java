public class Rectangle extends AbstractShape {
    private Point corner1;
    private Point corner2;

    public Rectangle() {}

    public Rectangle(Point corner1, Point corner2, Color color) {
        super(color);
        this.corner1 = corner1;
        this.corner2 = corner2;
    }

    @Override
    public double area() {
        double height = Math.abs(corner1.getY() - corner2.getY());
        double width = Math.abs(corner1.getX() - corner2.getX());
        return height * width; 
    }

    @Override
    public double perimeter() {
        double height = Math.abs(corner1.getY() - corner2.getY());
        double width = Math.abs(corner1.getX() - corner2.getX());
        return 2 * (height + width);
    }

    public Point getCorner1() {
        return corner1;
    }

    public void setCorner1(Point corner1) {
        this.corner1 = corner1;
    }

    public Point getCorner2() {
        return corner2;
    }

    public void setCorner2(Point corner2) {
        this.corner2 = corner2;
    }

}
