public class Triangle implements Shape {
    private Point p1;
    private Point p2;
    private Point p3;
    private double lado1;
    private double lado2;
    private double lado3;

    private void calculateSide() {
        lado1 = Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2) + 
            Math.pow(p1.getY()-p2.getY(), 2));
        lado2 = Math.sqrt(Math.pow(p2.getX()-p3.getX(), 2) + 
            Math.pow(p2.getY()-p3.getY(), 2));
        lado3 = Math.sqrt(Math.pow(p3.getX()-p1.getX(), 2) + 
            Math.pow(p3.getY()-p1.getY(), 2));
    }

    public Triangle() {}

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        calculateSide();
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
        calculateSide();
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
        calculateSide();
    }

    public Point getP3() {
        return p3;
    }

    public void setP3(Point p3) {
        this.p3 = p3;
        calculateSide();
    }

    @Override
    public double area() {
        double s = perimeter() / 2.0;
        return Math.sqrt(s * (s-lado1) * (s-lado2) * (s-lado3));
    }

    @Override
    public double perimeter() {
        return lado1 + lado2 + lado3;
    }
    
}
