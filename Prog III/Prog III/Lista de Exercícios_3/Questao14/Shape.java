public abstract class  Shape {
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

    abstract Point getCenter();

    public static class Circle extends Shape {
        private double radius;

        public Circle(Point center, double radius) {
            super(center);
            this.radius = radius; 
        }
        @Override
        public void moveBy(double dx, double dy) {
            super.moveBy(dx, dy);
        }
        @Override
        public Point getCenter() {
            return new Point(this.radius, this.radius);
        }
    }
    public static class Rectangle extends Shape {
        private double width;
        private double height;

        public Rectangle(Point topLeft, double width, double height) {
            super(topLeft);
            this.width = width;
            this.height = height;
        }
        @Override
        public void moveBy(double dx, double dy) {
            super.moveBy(dx, dy);
        }
        @Override
        public Point getCenter() {
            return new Point(this.width, this.height);
        }
    }

    public static class Line extends Shape {
        private double x1;
        private double y1;

        public Line(Point from, Point to) {
            super(from);
            this.x1 = to.getX();
            this.y1 = to.getY();
        }
        @Override
        public void moveBy(double dx, double dy) {
            super.moveBy(dx, dy);
        }
        @Override
        public Point getCenter() {
            return new Point(this.x1, this.y1);
        }
    }
}

