package NBU_.Repo;

public class Novel extends Book {
private  String summary;

public Novel() {
}
    public Novel(double fileSize, DocumentType format, String title, Author author, String isbnCode, String summary) {
        super(fileSize, format, title, author, isbnCode);
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    @Override
    public String toString() {
        return "Novel{" +
                "summary='" + summary + '\'' +
                '}';
    }
}

