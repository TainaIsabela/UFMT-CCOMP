public class Clones {
    public static void main(String[] args) {
        Point p = new Point(1, 2);
        Point p2 = p.clone();
        System.out.println(p2.getX());
        System.out.println(p2.getY());
        p2.setX(3);
        p2.setY(4);
        System.out.println(p.getX());
        System.out.println(p.getY());
    }

    public static class Point implements Cloneable {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public void moveBy(double dx, double dy) {
            this.x += dx;
            this.y += dy;
        }

        public Point clone() {
            return new Point(this.x, this.y);
        }
    }

    public static class Shape {
        private double x;
        private double y;

        public Shape(Point center) {
            this.x = center.getX();
            this.y = center.getY();
        }

        public void moveBy(double dx, double dy) {
            this.x += dx;
            this.y += dy;
        }

        public Point getCenter() {
            return new Point(this.x, this.y);
        }
    }
}