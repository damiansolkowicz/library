public class library {
    public static void main(String[] args) {
        final String appName = "Biblioteka 0,2";
        book book1= new book();
        book1.title=" W pustyni i w puszczy";
        book1.author="Henryk Sienkiewicz";
        book1.releaseDatesedate=10;
        book1.publisher="Greg";
        book1.isbn="7593840394";
        book1.pages= 88;
        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.releaseDatesedate);
        System.out.println(book1.pages);
        System.out.println(book1.publisher);
        System.out.println(book1.isbn);
    }
}