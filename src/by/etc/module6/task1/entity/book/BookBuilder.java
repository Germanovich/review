package by.etc.module6.task1.entity.book;

public class BookBuilder {
    private Book book;

    public BookBuilder() {
        this.book = new Book();
    }

    public BookBuilder withTitle(String title){
        book.setTitle(title);
        return this;
    }

    public BookBuilder withAuthor(String author){
        book.setAuthor(author);
        return this;
    }

    public BookBuilder setPublisher(String publisher){
        book.setPublisher(publisher);
        return this;
    }

    public BookBuilder setYear(int year){
        book.setYear(year);
        return this;
    }

    public BookBuilder setPageNum(int pageNum){
        book.setPageNum(pageNum);
        return this;
    }

    public BookBuilder setType(Type type){
        book.setType(type);
        return this;
    }

    public Book build(){
        return book;
    }
}
