package NBU_.Repo;


public class NewsPaper extends Document {
    private PeriodityofIssue Issue;
    private int countArticles;

    public NewsPaper() {
    }
    public NewsPaper(int countArticles, PeriodityofIssue Issue, double fileSize, DocumentType format, String title) {
        super(fileSize, format, title);
        this.countArticles = countArticles;
        this.Issue = Issue;
    }
    public int getCountArticles() {
        return countArticles;
    }
    public void setCountArticles(int countArticles) {
        this.countArticles = countArticles;
    }
    @Override
    public String toString() {
        return super.toString()+ ",NewsPaper{" +
                "countArticles=" + countArticles +
                '}';
    }
}

