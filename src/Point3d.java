public class Point3d extends Point2d {
    //private double xCoord;
    //private double yCoord;
    private double zCoord;

    // Class constructor
    public Point3d (double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }
    public Point3d(){
        this(0,0,0);
    }

    // Return z coordinate
    public double GetZ() {
        return zCoord;
    }

    // Change z coordinate
    public void SetZ(double val) {
        zCoord = val;
    }

    // Comparison
    public boolean IsEqual(Point3d point) {
        if ((super.GetX() == point.GetX()) & (super.GetY() == point.GetY()) & (zCoord == point.GetZ())) {
            return true;
        }
        return false;
    }

    // Return distance to another 3d point
    public double distanceTo(Point3d point) {
        double distance = Math.sqrt(Math.pow(super.GetX()-point.GetX(), 2) + Math.pow(super.GetY()-point.GetY(), 2) + Math.pow(zCoord-point.GetZ(), 2));
        double scale = Math.pow(10, 2);
        distance = Math.round((distance * scale)) / scale;
        return distance;
    }

    public static void main(String[] args) {
        Point3d point1 = new Point3d(0, 0, 0);
        Point3d point2 = new Point3d(0, 0, 5);
        Point3d point3 = new Point3d(1, 5, 1);
        System.out.println(point3.GetX() + " " + point3.GetY() + " " + point3.GetZ());
        System.out.println(Lab1.computeArea(point1, point2, point3));
    }
}
