public class Shape {
    private String shapeName;
    private int numberOfEdges;

    public Shape() {
        System.out.println("Shape constructor created");
        this.shapeName = "undefined shape";
        this.numberOfEdges = 0;
    }

    public Shape(double radius) {
        System.out.println("Circle object is created");
        this.shapeName = "Circle";
        this.numberOfEdges = 0;
    }

    public Shape(int edges, double edgeLength) {
        System.out.println("The square object is created");
        this.numberOfEdges = edges;
        this.shapeName = "Square";
    }

    public Shape(int edges, double e1, double e2) {
        System.out.println("Rectangle object created");
        this.numberOfEdges = edges;
        this.shapeName = "Rectangle";

    }

    public Shape(int edges, double e1, double e2, double e3) {
        System.out.println("Triangle object created");
        this.numberOfEdges = edges;
        this.shapeName = "Triangle";

    }

    public String getShapeDetails() {
        return "Shape name: "+shapeName+", Number of edges: "+numberOfEdges;
    }
}
