//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape radius = new Shape(21.4);
        Shape square = new Shape(4, 12);
        Shape rectangle = new Shape(4, 12, 10);
        Shape triangle = new Shape(3, 12.5, 12.5, 15);

        String shapeDetails = shape.getShapeDetails();
        String radiusDetails = radius.getShapeDetails();
        String squareDetails = square.getShapeDetails();
        String rectangleDetails = rectangle.getShapeDetails();
        String triangleDetails = triangle.getShapeDetails();

        System.out.println("Shape details: " + shapeDetails + "\n");
        System.out.println("Radius details: " + radiusDetails + "\n");
        System.out.println("Square details: " + squareDetails + "\n");
        System.out.println("Rectangle details: " + rectangleDetails + "\n");
        System.out.println("Triangle details: " + triangleDetails + "\n");
    }
}