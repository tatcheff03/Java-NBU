package NBU_.video;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Author {
    private String name;
    private  int age;

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        Author author= new Author("Angel",20);

        Video.setMaxDuration(BigDecimal.valueOf(5));
        System.out.println("MaxDuration:" + Video.getMaxDuration());

        Video video1=new Video(1,"My video 1", BigDecimal.valueOf(3.6),10,author, LocalDate.of(2024,2,27));
        Video video2=new Video(2,"My video 2", BigDecimal.valueOf(3.3),20,author, LocalDate.of(2024,2,28));

        System.out.println(video1);
        System.out.println(video2);

        Video.setMaxDuration(BigDecimal.valueOf(10));
        System.out.println("MaxDuration:" + Video.getMaxDuration());
        video1.setDuration(BigDecimal.valueOf(12));

        System.out.println(video1);
        System.out.println(video2);





    }
}