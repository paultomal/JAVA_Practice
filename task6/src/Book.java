public class Book extends Author{
    private String title;
    private int Year;
    private Author author;
    public Book(String title, int Year, Author author){
        setTitle(title);
        setYear(Year);
        setAuthor(author);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return Year;
    }
    public Author getAuthor() {
        return author;
    }
    public void displayBookDetails(){
        System.out.println(title);
        System.out.println(Year);
        System.out.println(author.getName());
        System.out.println(author.getAge());
        System.out.println(author.getGender());
    }

}
