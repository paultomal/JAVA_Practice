// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Author author = new Author("John Doe", 35, "Male");
        Book book = new Book("Sample Book", 2023, author);

        book.displayBookDetails();

    }
}