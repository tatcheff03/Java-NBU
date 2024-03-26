package NBU_.Repo;

public class Main {
    public static void main(String[] args) {
        Document document= new Document();
        Document document1= new Document(10.0,DocumentType.PDF,"First Title");
        Book book= new Book();
        Book book1= new Book(11.0,DocumentType.PDF,"Second Title",new Author("Ivan","Ivanov"),"1234567890");

        System.out.println(document);
        System.out.println(document1);
        System.out.println(book);
        System.out.println(book1);

        Book novel= new Book(11.0,DocumentType.PDF,"Second Title",new Author("Ivan","Ivanov"),"1234567890");
        Poem poem= new Poem(1,12.0,DocumentType.PDF,"Third Title",new Author("Petur","Petrov"),"0987654321");
        Repo repo= new Repo(1000.0,0,0.0);

        repo.storeDocument(novel);
        repo.storeDocument(poem);
        repo.storeDocument(book);
    }
}
