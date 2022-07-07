package poolObjectDP;

public class Book {
    private String bookName;
    private int id;
    private boolean isGoodCondition=true;

    public Book(String bookName, int id) {
        this.bookName = bookName;
        this.id = id;
    }

    Book(String bookName, int id, boolean isGoodCondition){
        this.bookName=bookName;
        this.id=id;
        this.isGoodCondition=isGoodCondition;
    }

    public void setGoodCondition(boolean goodCondition) {
        this.isGoodCondition = goodCondition;
    }

    public String getBookName() {
        return bookName;
    }

    public int getId() {
        return id;
    }

    public boolean isGoodCondition() {
        return isGoodCondition;
    }
}
