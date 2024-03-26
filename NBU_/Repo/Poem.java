package NBU_.Repo;

public class Poem extends Book{
    private int countOfPoems;

    public Poem() {
    }
    public Poem(int countOfPoems, double fileSize, DocumentType format, String title, Author author, String isbnCode) {
        super(fileSize, format, title, author, isbnCode);
        this.countOfPoems = countOfPoems;
    }
    public int getCountOfPoems() {
        return countOfPoems;
    }
    public void setCountOfPoems(int countOfPoems) {
        this.countOfPoems = countOfPoems;
    }
    @Override
    public String toString() {
        return super.toString()+ "Poem{" +
                "countOfPoems=" + countOfPoems +
                '}';
    }
}
