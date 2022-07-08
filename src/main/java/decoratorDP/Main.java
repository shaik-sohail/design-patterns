

/*
    1.Decorator pattern allows a user to add new functionality to an existing object without altering its structure.
      This type of design pattern comes under structural pattern as this pattern acts as a wrapper to existing class.

    2.single responsibility, open close principle, Liskov substitution principle, are obeyed in this design pattern.

    3.Real time usage in McDonald store's software, this pattern is applied by cake bakers,

      java.util.Collections, methods checkedXXX(), synchronizedXXX() and unmodifiableXXX()
      Collection<String> c = Collections.checkedCollection(new HashSet<>(), String.class);

 */
package decoratorDP;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
