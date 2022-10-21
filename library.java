public class library {
    public static void main(String[] args) {
        final String appName = "Biblioteka 0,3";
        book book1= new book("W pustyni i w puszczy", "Henryk Sienkiewicz", 2010, "Greg", "957593", 1890);
        book book2= new book("Bajki dla dzieci", "Henryk Sienkiewicz", 2012, "Greg", "957593", 98);
        book book3= new book("Bajki dla dorosłych", "Henryk Inny ", 2010, "Greg", "957593", 759);

        System.out.println(appName);
        System.out.println("Książki dostępne w bibliotece:");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
    }
}