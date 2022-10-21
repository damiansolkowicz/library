public class book {
    String title;
    String author;
    int releaseDatesedate;
    String publisher;
    String isbn;
    int pages;

    book(String bookTitle, String bookAuthor, int releaseDate, String bookPublisher, String bookIsbn, int bookPages) {
    title=bookTitle;
    author = bookAuthor;
    releaseDatesedate = releaseDate;
    publisher = bookPublisher;
    isbn = bookIsbn;
    pages = bookPages;
    }

    public void printInfo() {
        String info = title +", " + author+", "+ releaseDatesedate + ", " +publisher + ", " + isbn +", "+ pages;
        System.out.println(info);
    }
}

