package poolObjectDP;

public class BookPool extends ObjectPool<Book>{


    String bookName;
    int id;
    boolean isGoodCondition=true;

    public BookPool(String bookName, int id) {
        super();
        this.bookName = bookName;
        this.id = id;

    }

    @Override
    Book print() {
        Book book= new Book(bookName,id,isGoodCondition);
        return book;
    }

    @Override
    boolean validate(Book o) {
        return o.isGoodCondition();
    }

    @Override
    void dead(Book o) {
        System.out.println("Book removed from pool");
    }
}
