package NBU_.Repo;



public class Book extends Document {
    private Author author;
    private String isbnCode;

    public Book() {
    }

    public Book(double fileSize, DocumentType format, String title, Author author, String isbnCode) {
        super(fileSize, format, title);
        this.author = author;
        this.isbnCode = isbnCode;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author=" + author +
                ", isbnCode='" + isbnCode + '\'' +
                '}';
    }
}