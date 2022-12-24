public class Point2d {
    private double xCoord;
    private double yCoord;
    public Point2d ( double x, double y) {
        xCoord = x;
        yCoord = y;
    }
    public Point2d(){
        this(0,0);
    }
    public double GetX() {
        return xCoord;
    }
    public double GetY() {
        return yCoord;
    }
    public void SetX(double val) {
        xCoord = val;
    }
    public void SetY(double val) {
        yCoord = val;
    }

    public static void main(String[] args) {
        Point2d point = new Point2d(4, 4);
        System.out.println(String.format("Point 1: %s %s", point.GetX(), point.GetY()));
        point.SetX(6);
        System.out.println(String.format("Point 2: %s %s", point.GetX(), point.GetY()));
        point.SetY(8);
        System.out.println(String.format("Point 3: %s %s", point.GetX(), point.GetY()));
        point = new Point2d();
        System.out.println(String.format("Point 4: %s %s", point.GetX(), point.GetY()));
    }
}

