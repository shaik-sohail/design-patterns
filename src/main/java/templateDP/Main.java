
/*
    1.Template method design pattern is to define an algorithm as a skeleton of operations and leave the
    details to be implemented by the child classes. The overall structure and sequence of the algorithm
    are preserved by the parent class.

    2.we use template design pattern,
        A. To let the subclasses implement varying behavior,
        B.Avoid duplication in the code.
        C.the general workflow structure is implemented once in the abstract class's algorithm,
          and necessary variations are implemented in the subclasses.

    3. It is used during blinkist application

    4.This pattern is widely used in the Java core libraries, for example by java.util.AbstractList,
    or java.util.AbstractSet.

    For example, Abstract List provides a skeletal implementation of the List interface.


 */
package templateDP;

public class Main {
    public static void main(String[] args) {
        PageTemplate pageTemplate = new MyLibraryPage();
        pageTemplate.draw();
    }
}
