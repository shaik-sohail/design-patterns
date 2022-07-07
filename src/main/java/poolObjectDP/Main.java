package poolObjectDP;

public class Main {
    public static void main(String[] args) {
        BookPool pool = new BookPool("Pyth",123);
        Book book = pool.takeOut();

        pool.takeIn(book);
        BookPool pool1 = new BookPool("Pyth",123);
        Book book1 = pool.takeOut();
        pool1.takeIn(book);

    }
}
