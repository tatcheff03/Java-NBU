package NBU_.child;
import java.time.LocalDate;
public class AdChild {
    public static void main(String[] args) {
        Adult adult = new Adult("first", "last", LocalDate.now());
        Child child= new Child("name","last",LocalDate.of(2004,05, 5));

        Adult adultFromChild= new Adult(child);
        System.out.println(adultFromChild);
        }

    }

