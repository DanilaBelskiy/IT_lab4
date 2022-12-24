public class Lab1 {
    public static void main(String[] args) {
        if (args.length > 8) {
            var point1 = new Point3d(Double.parseDouble(args[0]), Double.parseDouble(args[1]), Double.parseDouble(args[2]));
            var point2 = new Point3d(Double.parseDouble(args[3]), Double.parseDouble(args[4]), Double.parseDouble(args[5]));
            var point3 = new Point3d(Double.parseDouble(args[6]), Double.parseDouble(args[7]), Double.parseDouble(args[8]));

            if ((point1.IsEqual(point2)) | (point2.IsEqual(point3)) | (point3.IsEqual(point1)))  {
                System.out.println("Triangle does not exists");
            } else {
                double area = computeArea(point1, point2, point3);
                System.out.println(area);
            }
        }
    }

    // Return area of a triangle given 3 points
    public static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
        double side1 = point1.distanceTo(point2);
        double side2 = point2.distanceTo(point3);
        double side3 = point3.distanceTo(point1);
        double p = (side1 + side2 + side3) / 2;

        double area = Math.sqrt(p * (p-side1) * (p-side2) * (p-side3));

        return area;
    }
}
