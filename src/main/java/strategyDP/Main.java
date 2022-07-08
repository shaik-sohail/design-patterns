
/*
        1.In Strategy pattern, a class behavior or its algorithm can be changed at run time.
        This type of design pattern comes under behavior pattern.

        2.The same can also be attained by RUN TIME POLYMORPHISM IN JAVA, in JAVA language perspective Strategy pattern
        uses the concept of polymorphism.

        3.In some hypothetical functional language,
        function readFile(path: String, decrypt: string -> string) {
            return decrypt(loadFromDisk(path));

        readFile("customers.txt", aes)
        readFile("finance.txt", blowfish)

        The above code is written in some hypothetical functional language which uses the concept of Strategy design pattern
        In the above example,we didn't use any polymorphism.

        4.As the design patterns are language independent we will implement design patterns in different ways

        5.can be mapped to Open/Closed Principle because new modifications can be made easily.

        6.In real world this design pattern is used in encryption software where the strategy of the algorithm can be changed
        during runtime.

        7.java.util.Comparator#compare() called from Collections#sort().

 */

package strategyDP;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(new ManualSteering());
        context.addSteering();
        context = new Context(new PowerSteering());
        context.addSteering();
        context = new Context(new RackPinionSteering());
        context.addSteering();
    }
}
