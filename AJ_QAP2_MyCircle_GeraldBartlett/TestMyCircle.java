package AJ_QAP2_MyCircle_GeraldBartlett;

public class TestMyCircle {
    public static void main(String[] args) {

        // create first circle object with no arg constructor
        MyCircle circle1 = new MyCircle(10, 10, 5);

        // Create a second circle object with parameterized constructor
        MyCircle circle2 = new MyCircle(5, 5, 6);
        System.out.println(" ");
        System.out
                .println("Point 1 : Coordinates are " + "(" + circle1.getCenterX() + ", " + circle1.getCenterY() + ")");
        System.out
                .println("Point 2 : Coordinates are " + "(" + circle2.getCenterX() + ", " + circle2.getCenterY() + ")");
        System.out.println(" ");
        System.out.println("First Circle : Center Coordinates are " + circle1);
        System.out.println("Second Circle : Center Coordinates are " + circle2);
        System.out.println(" ");

        // call getArea method for object circle1

        System.out.println("Area of First Circle = " + circle1.getArea());
        // call getArea method for object circle2
        System.out.println("Area of Second Circle = " + circle2.getArea());
        System.out.println(" ");

        // call the distance between the two circles

        System.out.printf("The distance between two circles is: %.0f%n", circle1.distance(circle2));
        System.out.println(" ");
        System.out.println("Set Circle 1 Center to P2");

        // Setting new coordinates

        circle1.setCenterXY(5, 5);
        System.out.println("First Circle : Center Coordinates are " + circle1);
        System.out.println("Second Circle : Center Coordinates are " + circle2);
        System.out.printf("New distance between two circles is: %.0f%n", circle1.distance(circle2));
        System.out.println(" ");
        circle1.setCenterXY(5, 10);
        circle2.setCenterXY(25, 10);
        System.out.println(" ");
        System.out.println("Set Circle 1 to (" + circle1.getCenterX() + ", " + circle1.getCenterY()
                + ") and Circle 2 to (" + circle2.getCenterX() + ", " + circle2.getCenterY() + ")");
        System.out.println("First Circle : Center Coordinates are " + circle1);
        System.out.println("Second Circle : Center Coordinates are " + circle2);
        System.out.printf("Final distance between two circles is: %.0f%n", circle1.distance(circle2));
        System.out.println(" ");

    }
}
