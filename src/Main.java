public class Main {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1,2);
        Point2D p2 = new Point2D(3,4);
        System.out.println("Distance between p1 and p2: " + p1.distanceTo(p2));

        Point3D q1 = new Point3D(1, 2,3);
        Point3D q2 = new Point3D(4,5, 6);
        System.out.println("Distance between q1 and q2: " + q1.distanceTo(q2));
    }
}